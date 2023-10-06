package org.example.repository;

import org.example.repository.entity.Kullanici;
import org.example.utility.HibernateUtility;
import org.example.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Optional;

public class KullaniciRepository extends MyFactoryRepository<Kullanici,Long> {
    EntityManager entityManager=HibernateUtility.getSessionFactory().createEntityManager();
    public KullaniciRepository() {
        super(new Kullanici());
    }

    public Optional<Kullanici> kimlikDogrulama(String kimlikNo) {
        String sql="SELECT * FROM tbl_kullanici WHERE tcKimlik=:kimlikNo";
        TypedQuery<Kullanici> query= (TypedQuery<Kullanici>) entityManager.createNativeQuery(sql,Kullanici.class);
        query.setParameter("kimlikNo",kimlikNo);
        Kullanici kullanici=query.getSingleResult();
        return Optional.ofNullable(kullanici);
    }
}

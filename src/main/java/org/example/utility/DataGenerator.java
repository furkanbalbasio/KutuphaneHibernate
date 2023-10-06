package org.example.utility;

import org.example.controller.KitapController;
import org.example.controller.KullaniciController;
import org.example.controller.YazarController;
import org.example.repository.entity.Kitap;
import org.example.repository.entity.Kullanici;
import org.example.repository.entity.Yazar;
import org.example.repository.enums.Etur;

import java.time.LocalDate;
import java.util.List;

public class DataGenerator {
    KitapController kitapController;
    KullaniciController kullaniciController;
    YazarController yazarController;


    public DataGenerator(){
        this.kitapController = new KitapController();
        this.kullaniciController = new KullaniciController();
        this.yazarController = new YazarController();
    }

    public List<Kitap> kitapOlustur(List<Yazar> yazarList){
        Kitap kitap1 = Kitap.builder()
                .ad("Sefiller")
                .tur(Etur.DRAM)
                .adet(4)
                .satistaMi(true)
                .isbn("2314454656")
                .fiyat(20.0)
                .sayfaSayisi(840)
                .yazarId(yazarList.get(0).getId())
                .yazarAdi(yazarList.get(0).getAd()+" "+yazarList.get(0).getSoyad())
                .yayinEvi("Is Bankasi")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(1855,1,22))
                .build();
        Kitap kitap2 = Kitap.builder()
                .ad("Suç ve Ceza")
                .tur(Etur.DRAM)
                .adet(17)
                .satistaMi(true)
                .isbn("247896542")
                .fiyat(30.0)
                .sayfaSayisi(740)
                .yazarId(yazarList.get(0).getId())
                .yazarAdi(yazarList.get(0).getAd()+" "+yazarList.get(0).getSoyad())
                .yayinEvi("Is Bankasi")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(1845,5,22))
                .build();
        Kitap kitap3 = Kitap.builder()
                .ad("Martin Eden")
                .tur(Etur.MACERA)
                .adet(57)
                .satistaMi(true)
                .isbn("3425636")
                .fiyat(50.0)
                .sayfaSayisi(350)
                .yazarId(yazarList.get(1).getId())
                .yazarAdi(yazarList.get(1).getAd()+" "+yazarList.get(1).getSoyad())
                .yayinEvi("Akilcelen")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(1910,7,28))
                .build();
        Kitap kitap4 = Kitap.builder()
                .ad("Vahsetin Cagrisi")
                .tur(Etur.PSIKOLOJI)
                .adet(57)
                .satistaMi(true)
                .isbn("3475556")
                .fiyat(80.0)
                .sayfaSayisi(470)
                .yazarId(yazarList.get(1).getId())
                .yazarAdi(yazarList.get(1).getAd()+" "+yazarList.get(1).getSoyad())
                .yayinEvi("Akilcelen")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(1935,9,28))
                .build();
        Kitap kitap5 = Kitap.builder()
                .ad("Insan Ne ile Yasar")
                .tur(Etur.FELSEFE)
                .adet(97)
                .satistaMi(true)
                .isbn("32793356")
                .fiyat(10.0)
                .sayfaSayisi(170)
                .yazarId(yazarList.get(2).getId())
                .yazarAdi(yazarList.get(2).getAd()+" "+yazarList.get(2).getSoyad())
                .yayinEvi("Yapi Kredi")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(1827,11,28))
                .build();
        Kitap kitap6 = Kitap.builder()
                .ad("Dirilis")
                .tur(Etur.FELSEFE)
                .adet(97)
                .satistaMi(true)
                .isbn("34443356")
                .fiyat(10.0)
                .sayfaSayisi(170)
                .yazarId(yazarList.get(2).getId())
                .yazarAdi(yazarList.get(2).getAd()+" "+yazarList.get(2).getSoyad())
                .yayinEvi("Yapi Kredi")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(1827,11,28))
                .build();


        Kitap kitap7= Kitap.builder()
                .ad("Kürk Mantolu Madonna")
                .tur(Etur.EDEBIYAT)
                .adet(2)
                .satistaMi(true)
                .isbn("9789753638029")
                .fiyat(25D)
                .sayfaSayisi(160)
                .yazarId(yazarList.get(3).getId())
                .yazarAdi(yazarList.get(3).getAd()+" "+yazarList.get(3).getSoyad())
                .yayinEvi("Yapi Kredi")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(2000,1,5))
                .build();

        Kitap kitap8 = Kitap.builder()
                .ad("Abartma Tozu")
                .tur(Etur.OYKU)
                .adet(5)
                .satistaMi(true)
                .isbn("9786056883569")
                .fiyat(114.84)
                .sayfaSayisi(160)
                .yazarId(yazarList.get(3).getId())
                .yazarAdi(yazarList.get(3).getAd()+" "+yazarList.get(3).getSoyad())
                .yayinEvi("Yapi Kredi")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(2019,3,15))
                .build();

        Kitap kitap9 = Kitap.builder()
                .ad("Sissoylu")
                .tur(Etur.FANTASTIK)
                .adet(10000)
                .satistaMi(true)
                .isbn("37856369")
                .fiyat(100.0)
                .sayfaSayisi(668)
                .yazarId(yazarList.get(4).getId())
                .yazarAdi(yazarList.get(4).getAd()+" "+yazarList.get(4).getSoyad())
                .yayinEvi("Akılcelen Kitaplar")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(2006,7,17))
                .build();
        Kitap kitap10 = Kitap.builder()
                .ad("Dune")
                .tur(Etur.BILIMKURGU)
                .adet(10000)
                .satistaMi(true)
                .isbn("57487593")
                .fiyat(100.00)
                .sayfaSayisi(712)
                .yazarId(yazarList.get(4).getId())
                .yazarAdi(yazarList.get(4).getAd()+" "+yazarList.get(4).getSoyad())
                .yayinEvi("Ithaki Yayinlari")
                .baseEntity(Constans.getBaseEntity())
                .yayinTarihi(LocalDate.of(1965,8,26))
                .build();

        return kitapController.saveAll(List.of(kitap4,kitap5,kitap6,kitap3,kitap2,kitap7,kitap8,kitap1,kitap9,kitap10));
    }

    public List<Kullanici> kullaniciOlustur(){
        Kullanici kullanici1 = Kullanici.builder()
                .ad("Banu")
                .soyad("Yilmaz")
                .tcKimlik("123456789")
                .paraMiktari(150D)
                .telefonNo("05554215689")
                .baseEntity(Constans.getBaseEntity())
                .build();
        Kullanici kullanici2 = Kullanici.builder()
                .ad("Berke")
                .soyad("Yildirimer")
                .tcKimlik("123456798")
                .paraMiktari(200D)
                .telefonNo("05554218975")
                .baseEntity(Constans.getBaseEntity())
                .build();
        Kullanici kullanici3 = Kullanici.builder()
                .ad("Furkan")
                .soyad("Balbasio")
                .tcKimlik("123456123")
                .paraMiktari(250D)
                .telefonNo("05554526978")
                .baseEntity(Constans.getBaseEntity())
                .build();
        Kullanici kullanici4 = Kullanici.builder()
                .ad("Alperen")
                .soyad("Ikinci")
                .tcKimlik("123456456")
                .paraMiktari(300D)
                .telefonNo("05554526966")
                .baseEntity(Constans.getBaseEntity())
                .build();

        return  kullaniciController.saveAll(List.of(kullanici4,kullanici3,kullanici2,kullanici1));
    }

    public List<Yazar> yazarOlustur(){
        Yazar yazar1=Yazar.builder()
                .ad("Brandon")
                .soyad("Sanderson")
                .dogumTarihi(LocalDate.of(1975,12,19))
                .olumTarihi(LocalDate.of(1986,2,11))
                .biyografi("Unlu bir yazardir")
                .baseEntity(Constans.getBaseEntity())
                .build();
        Yazar yazar2=Yazar.builder()
                .ad("Christopher")
                .soyad("Paolini")
                .dogumTarihi(LocalDate.of(1983,11,17))
                .olumTarihi(LocalDate.of(1986,2,11))
                .biyografi("Unlu bir yazardir")
                .baseEntity(Constans.getBaseEntity())
                .build();
        Yazar yazar3=Yazar.builder()
                .ad("Frank")
                .soyad("Herbert")
                .dogumTarihi(LocalDate.of(1920,10,8))
                .olumTarihi(LocalDate.of(1986,2,11))
                .biyografi("Unlu bir yazardir")
                .baseEntity(Constans.getBaseEntity())
                .build();
        Yazar yazar4=Yazar.builder()
                .ad("George R. R.")
                .soyad("Martin")
                .dogumTarihi(LocalDate.of(1975,12,19))
                .olumTarihi(LocalDate.of(1986,2,11))
                .biyografi("Unlu bir yazardir")
                .baseEntity(Constans.getBaseEntity())
                .build();
        Yazar yazar5=Yazar.builder()
                .ad("Robert")
                .soyad("Jordan")
                .dogumTarihi(LocalDate.of(1948,10,17))
                .olumTarihi(LocalDate.of(2007,2,11))
                .biyografi("Unlu bir yazardir")
                .baseEntity(Constans.getBaseEntity())
                .build();

        return yazarController.saveAll(List.of(yazar5,yazar1,yazar4,yazar3,yazar2));
    }

    public List<Yazar> yazarKitaplariniGuncelle(List<Kitap> kitapList,List<Yazar> yazarList){
        Yazar yazar1=yazarList.get(0);
        Yazar yazar2=yazarList.get(1);
        Yazar yazar3=yazarList.get(2);
        Yazar yazar4=yazarList.get(3);
        Yazar yazar5=yazarList.get(4);
        yazar1.setYazarKitaplari(List.of(kitapList.get(0).getAd(),kitapList.get(1).getAd()));
        yazar2.setYazarKitaplari(List.of(kitapList.get(2).getAd(),kitapList.get(3).getAd()));
        yazar3.setYazarKitaplari(List.of(kitapList.get(4).getAd(),kitapList.get(5).getAd()));
        yazar4.setYazarKitaplari(List.of(kitapList.get(6).getAd(),kitapList.get(7).getAd()));
        yazar5.setYazarKitaplari(List.of(kitapList.get(8).getAd(),kitapList.get(9).getAd()));

        yazarController.update(yazar1);
        yazarController.update(yazar2);
        yazarController.update(yazar3);
        yazarController.update(yazar4);
        yazarController.update(yazar5);

        return List.of(yazar1,yazar2,yazar3,yazar4,yazar5);

    }
    public void dataOlustur(){
        kullaniciOlustur();
        List<Yazar> yazarList=yazarOlustur();
        List<Kitap> kitapList=kitapOlustur(yazarList);
        yazarKitaplariniGuncelle(kitapList,yazarList);
    }
}

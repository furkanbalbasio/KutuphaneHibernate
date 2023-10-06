package org.example;

import org.example.controller.KitapController;
import org.example.controller.KullaniciController;
import org.example.repository.entity.Kullanici;
import org.example.utility.DataGenerator;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    KullaniciController kullaniciController=new KullaniciController();
    KitapController kitapController=new KitapController();
    public static void main(String[] args) {
        DataGenerator dataGenerator=new DataGenerator();
        dataGenerator.dataOlustur();
        /**
         * Kullanici gelip kitap satin alabilecek, ama satin alması için satistaMi = true olmali,
         * kullanıcının parası kitaba yetmeli ve Kitap adedi sıfırdan fazla olmalı.
         * Satın alınan kitabın adedi azalmalı, kullanıcının parası azalmalı, satın alınan kitap kullanıcının
         * kitaplarına eklenmeli. Kitap adedi 0’a düştüğünde satistaMi? Durumu false olmalı. Stok
         * geldiğinde True’ya dönmeli
         * Kitap ekle metodu,
         * Yazar ekle metodu,
         * Kullanıcı ekle metodu,
         * Kitap satin al metodu
         * Kitap satın al çalıştırıldığında tc kimlik numarası ile giriş yapılacak. Giriş başarılı olur ise
         * tcNo'nun sahibi olan kişi ismi ile "Hoşgeldin.. Ahmet gibi karşılanacak" satın alım işlemi
         * gerçekleştirmek için kitaplar listelenecek.
         * Yazarlar'ın kitapları isimleriyle görüntülenebilmeli
         */
        /**
         * public Integer menu(){
         * System.out.println("### Kutuphaneye Hosgeldiniz! ####");
         * System.out.println("1- Giris Yap");
         * System.out.println("2- Tum Kitaplari Goster");
         * System.out.println("3- Stoktaki Kitaplar");
         * System.out.println("4- Yazarlari Goster");
         * System.out.println("5- Kitap Ekle");
         * System.out.println("6- Yazar Ekle");
         * System.out.println("7- Kullanici Ekle");
         * System.out.println("8- Turune Gore Kitap Ara");
         * System.out.println("0 - Cikis");
         * System.out.print("Secim yapiniz : ");
         * Integer secim = Integer.parseInt(scanner.nextLine());
         * return secim;}System.out.println("1- Kitap Satin Al");
         * System.out.println("2- Bakiye Yukle");
         * System.out.println("0- Cikis Yap");
         * System.out.print("Secim yapiniz : ");
         * secim = Integer.parseInt(scanner.nextLine());
         */
    }
    private void menu() {
        System.out.println("### Kutuphaneye Hosgeldiniz! ####");
        System.out.println("1- Giris Yap");
        System.out.println("2- Tum Kitaplari Goster");
        System.out.println("3- Stoktaki Kitaplar");
        System.out.println("4- Yazarlari Goster");
        System.out.println("5- Kitap Ekle");
        System.out.println("6- Yazar Ekle");
        System.out.println("7- Kullanici Ekle");
        System.out.println("8- Turune Gore Kitap Ara");
        System.out.println("0 - Cikis");
    }
    private void registerMenu(){
        menu();
        System.out.print("Secim yapiniz : ");
         Integer secim = Integer.parseInt(new Scanner(System.in).nextLine());
         boolean kontrol=true;
         do {
             switch (secim){
                 case 1: girisYapKontrol(); break;
                 case 2: break;
                 case 3: break;
                 case 4: break;
                 case 5: break;
                 case 6: break;
                 case 7: break;
                 case 8: break;
                 case 0: break;
             }
         }while(kontrol);

    }

    private void girisYapKontrol() {
        girisYapMenu();
        System.out.println("TC Kimlik Numaranizi giriniz.");
        String girilenKimlikNo=new Scanner(System.in).nextLine();
       Optional<Kullanici> kullanici=kullaniciController.kimlikDogrulama(girilenKimlikNo);
       if (kullanici.isPresent()){
           System.out.println("Hosgeldin "+kullanici.get().getAd());
           girisYap();
       }else {
           System.out.println("TC Kimlik Numarasi Yanlis Girilmistir.");
       }
    }

    private void girisYap() {
        girisYapMenu();
        System.out.print("Secim yapiniz : ");
        Integer secim = Integer.parseInt(new Scanner(System.in).nextLine());
        boolean kontrol=true;
        do {
            switch (secim){
                case 1: kitaplariListele();break;
                case 2: break;
                case 0: break;
            }
        }while (kontrol);
    }

    private void kitaplariListele() {
        kitapController.findAll().forEach(kitap -> {
            System.out.println(kitap.toString());
        });
    }

    private void girisYapMenu(){
        System.out.println("1- Kitap Satin Al");
        System.out.println("2- Bakiye Yukle");
        System.out.println("0- Cikis Yap");
    }
}
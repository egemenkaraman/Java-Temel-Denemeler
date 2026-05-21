package org.example;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static boolean asalMi( int sayi){
        for (int i = 2 ; i < sayi ; i++ ){
            if (sayi % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static int ebobBulma(int sayi1, int sayi2 ){
        int ebob = 1;
        for (int i = 1; i <= sayi1 && sayi2 >=i ; i++){
            if ((sayi1 % 1 == 0) && (sayi2 % 1 == 0)){
                ebob = i;
            }
        }
        return ebob;

    }

    public static int cıkarma(int a, int b) {
        return(a-b);
    }
    public static double bolme (double a , double b){
        return((double) a/b);
    }
    public static int toplama(int a,int b ){
        return(a+b);
    }
    public static int toplama(int a,int b,int c ){
        return(a+b+c);
    }
    public static int carpma(int a, int b){
        return(a*b);
    }
    public static int carpma(int a, int b,int c){
        return(a*b*c);
    }



    public static void main(String[] args) {

        // Vücut Kitle endeksi başlangıcı
        //  Scanner scanner = new Scanner(System.in);

        //System.out.print("kilonuz:");

        //int kilo = scanner.nextInt();
        //System.out.print("Boy (Örnek : 1,72)");
        //double boy = scanner.nextDouble();

        //double bki = (kilo / (boy * boy));

        //if (bki < 18.5) {
        //  System.out.println("Zayıf");
        //} else if (18.5 >= bki && bki < 25) {
        //   System.out.println("Normal");
        //} else if (25 >= bki && bki < 30) {
        //  System.out.println("Fazla Kilolu");
        //} else {
        //  System.out.println("Obez");
        //}
        //Vücut kitle endeksi sonu
        //Hesap makinesi başı
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************************************");
        String islemler = "1. Toplama İşlemi\n" +
                "2. Çıkarma İşlemi\n" +
                "3. Çarpma İşlemi\n" +
                "4. Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("*****************************************************");

        System.out.println("İşlemi Seçiniz");
        String islem = scanner.nextLine();
        switch (islem){
            case "1":
                System.out.println("1. Sayıyı Giriniz");
                int a = scanner.nextInt();
                System.out.println("2. Sayıyı Giriniz");
                int b = scanner.nextInt();
                System.out.println("Toplam:" + (a+b));
                break;
            case "2":
                System.out.println("1.Sayıyı Giriniz");
                int c = scanner.nextInt();
                System.out.println("2. Sayıyı Giriniz");
                int d = scanner.nextInt();
                System.out.println("Sonuç:"+ (c-d));
                break;
            case "3":
                System.out.println("1. Sayıyı Giriniz");
                int e = scanner.nextInt();
                System.out.println("2. Sayıyı Giriniz");
                int f = scanner.nextInt();
                System.out.println("Sonuç:" + (e*f) );
                break;
            case "4":
                System.out.println("1. Sayıyı Giriniz");
                double g = scanner.nextDouble();

                System.out.println("2. Sayıyı Giriniz");
                int h = scanner.nextInt();
                System.out.println("Sonuç:" + (g/h));
                break;
            default:
                System.out.println("Geçersiz İşlem Girdiniz!!!!!");
                break;
        } */
        // HESAP MSKİNESİ SONU

        //NOT HESAPLAMA BAŞLANGIÇ

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Vize Notunuz");
        int vize1 = scanner.nextInt();
        System.out.println("2.Vize Notunuz");
        int vize2 = scanner.nextInt();
        System.out.println("Final Notunuz");
        int finalnot = scanner.nextInt();

        double toplamnot = (vize1 * 3/10.0) + (vize2 * 3/10.0) + (finalnot * 4/10.0);

        if (toplamnot >= 90) {
            System.out.println("AA Aldınız ...");
        }
        else if (toplamnot >=85 && toplamnot >90) {
            System.out.println("AB ALDINIZ");
        }
        else if (toplamnot >=80 && toplamnot >85) {
            System.out.println("BB ALDINIZ");
        }
        else if (toplamnot >=85 && toplamnot >80) {
            System.out.println("BC ALDINIZ");
        }
        else if (toplamnot >=70 && toplamnot >75) {
            System.out.println("CD ALDINIZ");
        }
        else if (toplamnot >=50 && toplamnot >70) {
            System.out.println("DD ALDINIZ");
        }
        else {
            System.out.println("FF Aldınız ve Kldınız...");
        }

        */

        //NOT HEESAPLAMA SONU

        //KENDİ DENEMEM

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Faktoriyelini hesaplamak istedğiniz bir sayı giriniz:");
        int sayı = scanner.nextInt();
        int faktoriyel = 1;
        for (int i = 1 ; i <= sayı ; i++ ) {

             faktoriyel = i * faktoriyel ;
        }
        System.out.println("Sonuç:" + faktoriyel);


        */

        //KENDİ DENEMEM BİTTİ

        //BANKA UYGULAMASI (DÖNGÜLERLE)

        /*
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem Para Çekme\n" +
                "2.İşlem Para Yatırman\n" +
                "3.İşlem Bakiye Sorgulama\n" +
                "Çıkış için q'ya Basın";

        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");

        while (true){
            System.out.println("İşlem Seçiniz");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Sistemden Çıkılıyor");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz:");
                int a = scanner.nextInt();
                bakiye = bakiye + a;
                System.out.println("Güncel Bakiye" + bakiye );
                continue;


            }
            else if (islem.equals("2")){
                System.out.println("Çekmek İstediğiniz Tutarı Giriniz:");

                int a = scanner.nextInt();
                if (bakiye - a < 0 ){
                    System.out.println("Yeterli Bakiye Yok!!! Bakiyeniz:" + bakiye);
                }
                else {
                    bakiye = bakiye - a;
                    System.out.println("Güncel Bakiye" + bakiye);

                    continue;
                }

            }
            else if (islem.equals("3")){
                System.out.println("Bakiye:" + bakiye);
                continue;

            }

            else {
                System.out.println("Hatalı İşlem Yaptınız...");
                continue;

            }


        }
         */
        //BANKA UYGULAMSI SONU

        //ÇARPIM TABLOSU BASLANGICI ( İÇ İÇE DÖNGÜ)

        /*
        for (int i = 0;i <=10;
        i++){

            System.out.println("******************************");

        for (int j = 0; j <= 10;
        j++){
            System.out.println(i + "x" + j +"=" + (i*j));

        }
            System.out.println("******************************");

        }

         */

        //ÇARPIM TABLOSU SONU

        // KULLANICI GİRİŞİ UYGULAMASI
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("GİRİŞİ EKRANINA HOŞGELDİNİZ");
        System.out.println("**********************");

        String sys_kullanıcı_adı = "Egemen Karaman";
        String sys_parola = "616161";
        int giris_hakkı = 3;

        while (true){

            System.out.println("Kullanıcı Adını Girinz:");
            String kullanıcı_adı = scanner.nextLine();
            System.out.println("Parolayı Giriniz:");
            String parola = scanner.nextLine();

            if(sys_kullanıcı_adı.equals(kullanıcı_adı) && sys_parola.equals(parola)){
                System.out.println("Hoşgeldiniz:" + sys_kullanıcı_adı);
                break;
            }
            else if (sys_kullanıcı_adı.equals(kullanıcı_adı) && !sys_parola.equals(parola)){
                System.out.println("Hatalı Parola!!!");
                System.out.println("Giriş Hakkınız:" + giris_hakkı);
                giris_hakkı -= 1;
            }
            else if (!sys_kullanıcı_adı.equals(kullanıcı_adı) && sys_parola.equals(parola)){
                System.out.println("Hatalı Kullanıcı Adı!!!");
                System.out.println("Giriş Hakkınız:" + giris_hakkı);
                giris_hakkı -= 1;

            }
            else {
                System.out.println("Hatalı Kullanıcı Adı ve Parola!!!");
                System.out.println("Giriş Hakkınız:" + giris_hakkı);
                giris_hakkı -= 1;

            }
            if (giris_hakkı == 0) {
                System.out.println("Giriş Hakkınız Bitmiştir!!!");
                break;
            }
        }

         */

        // KULLANICI GİRİŞİ UYGULAMASI

        //ASALMİ METODU(FONKSİYONU BASLANGIÇ
        /*

        for (int i = 2; i<1000;i++){
            if (asalMi(i)){
                System.out.println(i);
            }

        }

         */
        //ASALMİ METODU(FONKSİYONU SONU

        // EBOBBULMA METODU BAŞLANGICI
         /*
        Scanner scanner = new Scanner(System.in);

         System.out.println("Birinci Sayıyı Giriniz:");
         int birinci_sayi = scanner.nextInt();

        System.out.println("İkinci Sayıyı Giriniz:");
        int ikinci_sayi = scanner.nextInt();

        System.out.println("İki sayının Ebobu:" + ebobBulma(birinci_sayi,ikinci_sayi));


          */
        // EBOBBULMA METODU SONU

        // GELİŞMİS HESAP MAKİNESİ METODLARLA BAŞLANGICI

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************************************");
        String islemler = "1. Toplama İşlemi\n" +
                "2. Çıkarma İşlemi\n" +
                "3. Çarpma İşlemi\n" +
                "4. Bölme İşlemi\n" +
                "Çıkış İçin q'ya basın";
        System.out.println(islemler);
        System.out.println("*****************************************************");

        while (true) {
            System.out.println("İşlem Seçiniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Kaç Değer Toplayacaksınız?(2 veya 3)");
                int sayı_alma = scanner.nextInt();
                if (sayı_alma == 2){
                    System.out.println("Birinci Sayıyı Giriniz:");
                    int birinci_sayi = scanner.nextInt();
                    System.out.println("İkininci Sayıyı Giriniz:");
                    int ikinci_sayi = scanner.nextInt();
                    System.out.println("İşlemin sonucu:" + toplama(birinci_sayi,ikinci_sayi));
                    break;

                } else if (sayı_alma == 3) {
                    System.out.println("Birinci Sayıyı Giriniz:");
                    int birinci_sayi = scanner.nextInt();
                    System.out.println("İkininci Sayıyı Giriniz:");
                    int ikinci_sayi = scanner.nextInt();
                    System.out.println("Üçüncü Sayıyı Giriniz:");
                    int üçüncü_sayi = scanner.nextInt();
                    System.out.println("İşlemin sonucu:" + toplama(birinci_sayi,ikinci_sayi,üçüncü_sayi));
                    break;

                }
                else {
                    System.out.println("Bunun İçin Metod Bulunmuyor!!!");
                    continue;
                }


            } else if (islem.equals("2")) {
                System.out.println("Birinci Sayıyı Giriniz:");
                int birinci_sayi = scanner.nextInt();
                System.out.println("İkininci Sayıyı Giriniz:");
                int ikinci_sayi = scanner.nextInt();
                System.out.println("İşlemin Sonucu" + cıkarma(birinci_sayi,ikinci_sayi));

                break;
            } else if (islem.equals("3")) {
                System.out.println("Kaç Değer Çarpacaksınız?(2 veya 3)");
                int sayı_alma = scanner.nextInt();
                if (sayı_alma == 2){
                    System.out.println("Birinci Sayıyı Giriniz:");
                    int birinci_sayi = scanner.nextInt();
                    System.out.println("İkininci Sayıyı Giriniz:");
                    int ikinci_sayi = scanner.nextInt();
                    System.out.println("İşlemin sonucu:" + carpma(birinci_sayi,ikinci_sayi));
                    break;
                } else if (sayı_alma == 3) {
                    System.out.println("Birinci Sayıyı Giriniz:");
                    int birinci_sayi = scanner.nextInt();
                    System.out.println("İkininci Sayıyı Giriniz:");
                    int ikinci_sayi = scanner.nextInt();
                    System.out.println("Üçüncü Sayıyı Giriniz:");
                    int üçüncü_sayi = scanner.nextInt();
                    System.out.println("İşlemin sonucu:" + carpma(birinci_sayi,ikinci_sayi,üçüncü_sayi));
                    break;

                }
                else {
                    System.out.println("Bunun İçin Metod Bulunmuyor!!!");
                    continue;
                }
            } else if (islem.equals("4")) {
                System.out.println("Birinci Sayıyı Giriniz:");
                int birinci_sayi = scanner.nextInt();
                System.out.println("İkininci Sayıyı Giriniz:");
                int ikinci_sayi = scanner.nextInt();
                System.out.println("İşlemin Sonucu" + bolme(birinci_sayi,ikinci_sayi));
                break;
            }
            else {
                System.out.println("Hatalı İşlem Seçtiniz Tekrar Deneyiniz");
                continue;
            }
        }

         */

        // GELİŞMİS HESAP MAKİNESİ METODLARLA SONU









    }
}
public class Odev1 {

    public static void calistir(){
        System.out.println("Merhaba Java");
        System.out.println("Merhaba Java 2");

        System.out.println("**************************************");

        int ogrenciSayisi = 12;
        String mesaj = "Öğrenci sayisi : ";
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci Sayim :" + ogrenciSayisi);
        System.out.println("Öğrenci Sayim :" + ogrenciSayisi);
        System.out.println("Öğrenci Sayim :" + ogrenciSayisi);

        System.out.println("**************************************");
        double sayi = 12.5;
        sayi = -129;

        char karakter = 'A';
        boolean dogruMu = false;


        int sayim = 24;
        if (sayim < 20) {
            System.out.println("Sayi 20'den küçüktür");
        } else if (sayim == 20) {
            System.out.println("Sayi 20'ye eşittir");
        } else {
            System.out.println("Sayi 20'den büyüktür");
        }

        System.out.println("**************************************");
        //Recap Demo

        int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük =" + enBuyuk);

        System.out.println("**************************************");
        //Switch Case

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }

        System.out.println("**************************************");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("While Döngüsü Bitti");

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        System.out.println("Do-While Döngüsü Bitti");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Selin";
        ogrenciler[3] = "Ahmet";

        for (int k = 0; k < ogrenciler.length; k++) {
            System.out.println(ogrenciler[k]);
        }
        System.out.println("**************************************");
        //Recap Demo2

        System.out.println("Recap Demo2");

        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam =" + total);
        System.out.println("En Büyük =" + max);
        System.out.println("**************************************");
        System.out.println("Çok Boyutlu Diziler");

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int a = 0; a <= 2; a++) {
            System.out.println("-----------------------");
            for (int b = 0; b <= 2; b++) {
                System.out.println(sehirler[a][b]);
            }
        }
        System.out.println("**************************************");
        System.out.println("Stringler ile çalışmak");

        String message = "Bugün hava çok güzel";
        System.out.println(message);

        System.out.println("Eleman Sayisi :" + message.length());
        System.out.println("5. eleman :" + message.charAt(4));
        System.out.println(message.concat("Yaşasın!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] karakterler = new char[5];
        message.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf("a"));

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.substring(2, 5));

        for (String kelime : message.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println("**************************************");
        System.out.println("ASAL SAYI UYGULAMASI");

        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;

        for (int c = 2; c < number; c++) {
            if (number % c == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " Sayisi asal sayidir");
        } else {
            System.out.println(number + " Sayisi asal sayi değildir");
        }
        System.out.println("**************************************");
        System.out.println("Kalın Sesli ve İnce Sesli Harfler");

        char harf = 'I';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("KALIN SESLİ HARF");
                break;
            default:
                System.out.println("İNCE SESLİ HARF");
        }
        System.out.println("**************************************");
        System.out.println("Mükemmel Sayilar");

        int numberr = 28;
        int totall = 0;

        for (int d = 1; d < numberr; d++) {
            if (number % d == 0) {
                totall += d;
            }
        }

        if (totall == numberr) {
            System.out.println("Mükemmel sayidir");
        } else {
            System.out.println("Mükemmel sayi değildir");
        }
        System.out.println("**************************************");
        System.out.println("ARKADAŞ SAYILAR");

        int number1 = 220;
        int number2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int e = 1; e < number1; e++) {
            if (number1 % e == 0) {
                toplam1 += e;
            }
        }

        for (int f = 1; f < number2; f++) {
            if (number2 % f == 0) {
                toplam2 += f;
            }
        }

        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println("Bu iki sayi arkadaştır");
        } else {
            System.out.println("Bu iki sayi arkadaş değildir");
        }
        System.out.println("**************************************");
        System.out.println("Sayi Bulma");

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayii : sayilar) {
            if (sayii == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayi mevcuttur");
        } else {
            System.out.println("Sayi mevcut değildir");
        }
    }
}

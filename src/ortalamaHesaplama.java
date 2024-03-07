import java.util.Scanner;
public class ortalamaHesaplama {
    public static void main(String[] args) {
        int kisiSayisi;
        String[] isimler;
        Scanner giris = new Scanner(System.in);

        
        System.out.println("Kişi Sayısını Giriniz:");
        kisiSayisi = giris.nextInt();

        
        isimler = new String[kisiSayisi];
        for (int i = 0; i < kisiSayisi; i++) {
            System.out.println((i + 1) + ". Kişinin Adını Giriniz:");
            isimler[i] = giris.next();
        }

        
        for (int i = 0; i < kisiSayisi; i++) {
            int vn, fn, bn;
            String harfNotu = "";
            String gecme = "";

            
            System.out.println(isimler[i] + " için Vize Notunu Giriniz:");
            vn = giris.nextInt();
            System.out.println(isimler[i] + " için Final Notunu Giriniz:");
            fn = giris.nextInt();

           
            bn = (int) ((vn * 0.4 + fn * 0.6));

           
            if (bn <= 28) {
                harfNotu = "FF";
                gecme = "Kaldı";

            } else if (bn <= 39) {
                harfNotu = "DD";
                gecme = "Koşullu geçer";

            } else if (bn <= 49) {
                harfNotu = "DC";
                gecme = "Koşullu geçer";

            } else if (bn <= 59) {
                harfNotu = "CC";
                gecme = "Geçti";

            } else if (bn <= 69) {
                harfNotu = "CB";
                gecme = "Geçti";

            } else if (bn <= 79) {
                harfNotu = "BB";
                gecme = "Geçti";

            } else if (bn <= 89) {
                harfNotu = "BA";
                gecme = "Geçti";

            } else if (bn <= 100) {
                harfNotu = "AA";
                gecme = "Geçti";

            }

           
            System.out.println(isimler[i] + " için Harf Notu: " + harfNotu + "\n" + isimler[i] + " için Geçme Durumu: " + gecme);
        }
    }
}



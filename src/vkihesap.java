import java.util.Scanner;
public class vkihesap {
    public static void main(String[] args) {
        float boy, kilo, vki, boyToplam = 0, kiloToplam = 0;
        String durum="";
        Scanner giris = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {


            System.out.println("Boyunuzu Giriniz:");
            boy = giris.nextFloat();
            System.out.println("Kilonuzu Giriniz:");
            kilo = giris.nextFloat();
            boyToplam += boy;
            kiloToplam += kilo;

            vki = kilo / (boy * boy);
            System.out.println("Vücut kitle indeksiniz:" + vki);

            if (vki < 18.5)
                durum= "İdeal kilonun altında";
             else if (vki < 24.9)
                durum = "İdeal kiloda";

            else if (vki < 29.9)
                durum="İdeal kilonun üstünde";

             else if (vki < 39.9)
                durum="Obez";

             else if (vki < 40)
                durum="Morbid Obez";
             System.out.println("Vki değerin:"+vki+"\n durum:"+durum);




        }
        System.out.println("boy ortalaması:"+boyToplam/5);
        System.out.println("kilo ortalaması:"+kiloToplam/5);
    }
}

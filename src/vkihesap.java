import java.util.Scanner;
public class vkihesap {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz:");
        float boy=giris.nextFloat();
        System.out.println("Kilonuzu Giriniz:");
        float kilo=giris.nextFloat();

        float vki= kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz:"+ vki );

        if(vki < 18.5) {
            System.out.println(" İdeal kilonun altında");
        }
        else if(vki < 24.9){
                System.out.println("İdeal kiloda");
                
        } else if (vki < 29.9) {
            System.out.println("İdeal kilonun üstünde");
            
        } else if (vki < 39.9) {
            System.out.println("Obez");

        } else if (vki < 40) {
            System.out.println("Morbid Obez");

        }


    }
}

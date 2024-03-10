import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double price, total, kdvPrice, rate = 18;

        System.out.println("Tutar Giriniz:");
        price = scan.nextDouble();

        kdvPrice = price * (rate/100);
        total = kdvPrice + price;

        System.out.println("KDV oranı: %"+ (int)rate);
        System.out.println("KDV tutari:" + kdvPrice);
        System.out.println("KDV`li tutar: " + total);



    }
}

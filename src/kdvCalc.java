// Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

import java.util.Scanner;

public class kdvCalc {
    public static void main(String[] args) {
        Scanner kdv = new Scanner(System.in);

        double tutar;

        System.out.println();
        System.out.print("Tutari Giriniz : ");
        tutar = kdv.nextDouble();

        // Eğer tutar 0 ila 1000 arasında ise kdv oranını 0.18 değilse 0.08 olması için karar mekanizması yazıyoruz. Daha sonra Toplam tutarı hesaplatıyoruz.

        double kdvTutari = tutar > 0 && tutar < 1000 ? 0.18 * tutar : 0.08 * tutar;

        double toplamTutar = tutar + kdvTutari;

        // Son olarak kdv tutarını ve toplam ücreti ekrana yazdırıyoruz.

        System.out.println();
        System.out.println("KDV Tutari : " + kdvTutari);
        System.out.print("Toplam Odeyeceginiz Ucret : " + toplamTutar);
        System.out.println();
    }
}
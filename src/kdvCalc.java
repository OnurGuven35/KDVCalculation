import java.util.Scanner;

public class kdvCalc {
    public static void main(String[] args) {

        double tutar;
        System.out.print("Tutari Giriniz : ");
        Scanner kdv = new Scanner(System.in);
        tutar = kdv.nextDouble();

        double kdvTutari = tutar > 0 && tutar < 1000 ? 0.18 * tutar : 0.08 * tutar;
        double toplamTutar = tutar + kdvTutari;
        System.out.println("KDV Tutari : " + kdvTutari);
        System.out.print("Toplam Odeyeceginiz Ucret : " + toplamTutar);

    }
}

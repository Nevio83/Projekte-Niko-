import java.util.Scanner;

public class kreis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius eingeben: ");
        double radius = sc.nextDouble();

        double flaeche = Math.PI * radius * radius;
        double umfang = 2 * Math.PI * radius;

        System.out.println("Flaeche: " + flaeche);
        System.out.println("Umfang: " + umfang);

        sc.close();
    }
}
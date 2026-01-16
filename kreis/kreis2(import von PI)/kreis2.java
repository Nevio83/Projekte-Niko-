import java.util.Scanner;
public class kreis2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double dblradius;
        System.out.print("Geben sie den Radius des Kreises ein: ");
dblradius = sc.nextDouble();
double dblumfang = 2 * Math.PI * dblradius;
double dblflaeche = Math.PI * Math.pow(dblradius, 2);
System.out.println("Der Umfang des Kreises beträgt: " + dblumfang);
System.out.println("Die Fläche des Kreises beträgt: " + dblflaeche);
sc.close();
    }
}
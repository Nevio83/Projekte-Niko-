import java.util.*;

public class Haupt4
{
   public static void main(String argv[])
   {
      //Variablen anlegen
      double dblMeineSeiteA;

      //Scanner
      Scanner objBsZeile;
      objBsZeile = new Scanner(System.in);

      System.out.print("Bitte geben Sie die Seitenlaenge ein: ");
      dblMeineSeiteA = objBsZeile.nextDouble();

      //Wuerfel
      Wuerfel4 objW1 = new Wuerfel4();

      //Methodenaufruf setSeite im Objekt objW1
      objW1.setSeiteA(dblMeineSeiteA);

      System.out.println("******************************************");    

      //Ausgabe im Objekt objW1
      objW1.showFlaeche();
      objW1.showKantenlaenge();
      objW1.showVolumen();
      
      System.out.println("");
      System.out.println("******************************************");
      System.out.println("");
      
   }
}

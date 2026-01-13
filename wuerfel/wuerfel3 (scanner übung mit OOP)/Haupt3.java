import java.util.*;

public class Haupt3
{
   public static void main(String argv[])
   {
      double dlbMeineSeite;
      
      
      //Objekte definieren und erzeugen
      //Eingabe
      Scanner objBsZeile;
      objBsZeile = new Scanner(System.in);

    
    
      System.out.print("Bitte geben Sie die Seitenlaenge ein: ");
      dlbMeineSeite = objBsZeile.nextDouble();
    
      
      System.out.println("");
      
      
      Wuerfel3 objW1;                      
      objW1 = new Wuerfel3(dlbMeineSeite);      
 
      //Ausgabe
      System.out.println("Seitenlaenge: " + objW1.getSeite() + " cm");
      System.out.println("Flaeche: " + objW1.getFlaeche() + " cm*2");
      System.out.println("Kantenlaenge: " + objW1.getKantenlaenge() + " cm");
      System.out.println("Volumen: " + objW1.getVolumen() + " cm*3");

   }
}

import java.util.*;

public class Haupt3
{
   public static void main(String argv[])
   {
      double dlbMeineSeite;
      String strEingabe;
      
      //Objekte definieren und erzeugen
      //Eingabe
      Scanner objBsZeile;
      objBsZeile = new Scanner(System.in);

      //Eingabe Seite
      System.out.println("*************************************");
      System.out.println("");
    
      System.out.print("Bitte geben Sie die Seitenlaenge ein: ");
      strEingabe=objBsZeile.nextLine();
      dlbMeineSeite=Double.parseDouble(strEingabe);
    
      System.out.println("*************************************");
      System.out.println("");
      
      //Konstruktoraufruf für Würfelobjekt objW1
      Wuerfel3 objW1;                      
      objW1 = new Wuerfel3(dlbMeineSeite);      
    
      //Methodenaufruf getFlaeche im Objekt objW1
      System.out.println("Die Flaeche des Wuerfels mit der Seitenlaenge: " +objW1.getSeite());
      System.out.println("6 X (" +objW1.getSeite() +" X "+objW1.getSeite()+") = "+objW1.getFlaeche());
      System.out.println("");

      //Methodenaufruf getKantenlaenge im Objekt objW1
      System.out.println("Die Kantenlaenge des Wuerfels mit der Seitenlaenge: " +objW1.getSeite());
      System.out.println("12 X " +objW1.getSeite() +" = "+objW1.getKantenlaenge());
      System.out.println("");
      
      //Methodenaufruf getVolumen im Objekt objW1
      System.out.println("Das Volumen des Wuerfels mit der Seitenlaenge: " +objW1.getSeite());
      System.out.println(objW1.getSeite()+" X "+objW1.getSeite()+" X "+objW1.getSeite()+" = "+objW1.getVolumen());
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");

   }
}

//Franz Hain
//Übung: Eingabeparameter, ohne Rückgabewert
public class Haupt1
{
   public static void main(String argv[])
   {
      //Wuerfel
      Wuerfel1 objW1;
      objW1 = new Wuerfel1();
      
      //Methodenaufruf setSeite im Objekt objW1
      objW1.dblSeiteA=5;     
    
    
      //Eingabe Seite
      System.out.println("******************************************");
      System.out.println("");
      System.out.println("Seitenlaenge: "+objW1.dblSeiteA);
      System.out.println("******************************************");
      System.out.println("");
       
      //Ausgabe im Objekt objW1
      objW1.showFlaeche();
      objW1.showKantenlaenge();
      objW1.showVolumen();
      
      System.out.println("");
      System.out.println("******************************************");
      System.out.println("");
      
   }
}

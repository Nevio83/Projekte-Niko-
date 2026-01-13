
public class Haupt2
{
   public static void main(String argv[])
   {
      //Variablen anlegen
      double dblMeineSeiteA;
    
      //Wuerfel
      Wuerfel2 objW1 = new Wuerfel2();
    
      //Methodenaufruf setSeite im Objekt objW1
      objW1.setSeiteA(7);     
    
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

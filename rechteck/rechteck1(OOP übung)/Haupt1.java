public class Haupt1
{
   public static void main(String argv[])
   {
      //Rechteck
      Rechteck1 objR1;
      objR1 = new Rechteck1();
      
      //Methodenaufruf setSeite im Objekt objR1
      objR1.dblSeiteA=5;
      objR1.dblSeiteB=3;
    
    
      //Eingabe Seite
      System.out.println("******************************************");
      System.out.println("");
      System.out.println("Seitenlaenge A: "+objR1.dblSeiteA);
      System.out.println("Seitenlaenge B: "+objR1.dblSeiteB);
      System.out.println("******************************************");
      System.out.println("");
       
      //Ausgabe im Objekt objR1
      objR1.showFlaeche();
      objR1.showUmfang();
      
      System.out.println("");
      System.out.println("******************************************");
      System.out.println("");
      
   }
}

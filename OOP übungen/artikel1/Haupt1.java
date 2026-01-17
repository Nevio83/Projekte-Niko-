public class Haupt1
{
   public static void main(String argv[])
   {
      //Artikel
      Artikel1 objA1;
      objA1 = new Artikel1();
      
      //Attribute setzen
      objA1.dblEinzelPreis = 10.50;
      objA1.intMenge = 5;
  
      //Ausgabe der gesetzten Werte
      System.out.println("******************************************");
      System.out.println("");
      System.out.println("Einzelpreis: " + objA1.dblEinzelPreis + " Euro");
      System.out.println("Menge: " + objA1.intMenge);
      System.out.println("******************************************");
      System.out.println("");
       
      //Methodenaufrufe
      objA1.showNettoPreis();
      objA1.showBruttoPreis();
      
      System.out.println("");
      System.out.println("******************************************");
      System.out.println("");
      
   }
}

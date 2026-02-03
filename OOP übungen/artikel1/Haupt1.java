public class Haupt1
{
   public static void main(String argv[])
   {
      //Artikel
     Artikel1 obja1= new Artikel1();
     obja1.intMenge=5;
     obja1.dblEinzelPreis=10.5;
     System.out.println("***************************");
     System.out.println("Einzelpreis: "+obja1.dblEinzelPreis);
     System.out.println("Menge: "+obja1.intMenge);
     System.out.println("***************************");
     obja1.showNettoPreis();
     obja1.showBruttoPreis();
     System.out.println("***************************");
   }
}

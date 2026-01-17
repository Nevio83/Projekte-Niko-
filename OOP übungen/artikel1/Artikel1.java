public class Artikel1
{
   //Attribute
   public double dblEinzelPreis;
   public int intMenge;
      
   //Methoden
   public void showNettoPreis()
   {
      double dblNetto;
      dblNetto = dblEinzelPreis * intMenge;
      System.out.println("Der Nettopreis betraegt: " + dblNetto +" Euro");    
   }
   
   //Brutto berechnen
   public void showBruttoPreis()
   {
      double dblBrutto;
      dblBrutto = (dblEinzelPreis * intMenge) * 1.19;
      System.out.println("Der Bruttopreis betraegt: " + dblBrutto +" Euro");     
   }
}

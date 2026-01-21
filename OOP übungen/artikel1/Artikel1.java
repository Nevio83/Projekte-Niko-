public class Artikel1
{
   //Attribute
   public double dblEinzelPreis;
   public int intMenge;
   public void showNettoPreis(){
    double dblnetto;
    dblnetto=dblEinzelPreis*intMenge;
    System.out.println("Der nettopreis betragt: "+dblnetto);
   }
   public void showBruttoPreis(){
    double dblBrutto;
    dblBrutto=dblEinzelPreis*intMenge*1.19;
    System.out.println("Der Bruttopreis betraegt: "+dblBrutto);
   }
}
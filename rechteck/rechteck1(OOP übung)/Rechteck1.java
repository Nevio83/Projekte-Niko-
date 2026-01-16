public class Rechteck1
{
   //Attribute
   public double dblSeiteA;
   public double dblSeiteB;
      
   //Methoden
   public void showFlaeche()
   {
      double dblFlaeche;
      dblFlaeche=dblSeiteA*dblSeiteB;
      System.out.println("Die Flaeche betraegt: " + dblFlaeche +" cm*2");    
   }
   
   //Umfang berechnen
   public void showUmfang()
   {
      double dblUmfang;
      dblUmfang=(2*dblSeiteA)+(2*dblSeiteB);
      System.out.println("Der Umfang betraegt: " + dblUmfang +" cm");     
   }
}
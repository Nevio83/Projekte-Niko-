
{
   //Attribute
   public double dblSeiteA;
      
   //Methoden
   public void showFlaeche()
   {
      double dblFlaeche;
      dblFlaeche=dblSeiteA*dblSeiteA*6;
      System.out.println("Die Flaeche betraegt: " + dblFlaeche +" cm*2");    
   }
   
   //Umfang berechnen
   public void showKantenlaenge()
   {
      double dblKantenlaenge;
      dblKantenlaenge=3*4*dblSeiteA;
      System.out.println("Die Kantenlaenge betraegt: " + dblKantenlaenge +" cm");     
   }
   
   //Volumen berechnen
   public void showVolumen()
   {
      double dblVolumen;
      dblVolumen=dblSeiteA*dblSeiteA*dblSeiteA;
      System.out.println("Das Volumen betraegt: " + dblVolumen +" cm*3");     
   }
}

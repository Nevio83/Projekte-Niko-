
public class Wuerfel3
{
  //Attribute
  private double dblSeiteA;
   
  //Konstruktoren
  public Wuerfel3()     //Standardkonstruktor
  {
    
  }

  public Wuerfel3(double prmSeiteA)     //benutzerdefinierter Konstruktor
  {
    dblSeiteA=prmSeiteA;  
  }
      
  //Methoden
  public void setSeiteA(double prmSeiteA)
  {
    dblSeiteA=prmSeiteA;
  }  

  public double getSeite()
  {
    return dblSeiteA;
  }     
     

  public double getFlaeche()
  {
    double dblFlaeche;
    dblFlaeche=6*dblSeiteA*dblSeiteA;
     
    return dblFlaeche; 
  }
   
  //Umfang berechnen
  public double getKantenlaenge()
  {
    double dblKantenlaenge;
    dblKantenlaenge=12*dblSeiteA;         
      
    return dblKantenlaenge;
  }
   
  //Volumen berechnen
  public double getVolumen()
  {
    double dblVolumen;
    dblVolumen=dblSeiteA*dblSeiteA*dblSeiteA;
      
    return dblVolumen;
  }

}

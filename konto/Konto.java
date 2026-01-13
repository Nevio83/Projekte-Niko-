public class Konto
{
  private String strInhaber;
  private double dblKontostand;

  public Konto()
  {
    strInhaber = "";
    dblKontostand = 0.0;
  }

  public Konto(String prmInhaber, double prmStartguthaben)
  {
    strInhaber = prmInhaber;
    dblKontostand = prmStartguthaben;
  }

  public void setInhaber(String prmInhaber)
  {
    strInhaber = prmInhaber;
  }

  public String getInhaber()
  {
    return strInhaber;
  }

  public void setKontostand(double prmKontostand)
  {
    dblKontostand = prmKontostand;
  }

  public double getKontostand()
  {
    return dblKontostand;
  }

  public void einzahlen(double prmBetrag)
  {
    if (prmBetrag > 0)
    {
      dblKontostand = dblKontostand + prmBetrag;
    }
  }

  public void abheben(double prmBetrag)
  {
    if (prmBetrag > 0 && prmBetrag <= dblKontostand)
    {
      dblKontostand = dblKontostand - prmBetrag;
    }
  }

  public double berechneZinsen(double prmZinssatz)
  {
    double dblZinsen;
    dblZinsen = dblKontostand * prmZinssatz / 100.0;
    return dblZinsen;
  }
}

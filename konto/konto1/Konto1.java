public class Konto1
{
   private int intKontonummer;
   private String strKontoinhaber;
   private double dblKontostand;

   public void setKontonummer(int prmKontonummer)
   {
      intKontonummer = prmKontonummer;
   }

   public void setKontoinhaber(String prmKontoinhaber)
   {
      strKontoinhaber = prmKontoinhaber;
   }

   public void setAnfangskontostand(double prmKontostand)
   {
      dblKontostand = prmKontostand;
   }

   public double getKontostand()
   {
      return dblKontostand;
   }

   public int getKontonummer()
   {
      return intKontonummer;
   }

   public String getKontoinhaber()
   {
      return strKontoinhaber;
   }

   public void einzahlen(double prmBetrag)
   {
      dblKontostand = dblKontostand + prmBetrag;
   }

   public void abheben(double prmBetrag)
   {
      dblKontostand = dblKontostand - prmBetrag;
   }
}

import java.util.*;

public class Haupt1
{
   public static void main(String argv[])
   {
      int intKontonummer;
      String strKontoinhaber;
      double dblAnfangskontostand;
      double dblEinzahlung;
      double dblAbhebung;

      Scanner objBsZeile;
      objBsZeile = new Scanner(System.in);

      System.out.print("Bitte geben Sie die Kontonummer ein: ");
      intKontonummer = objBsZeile.nextInt();

      objBsZeile.nextLine();

      System.out.print("Bitte geben Sie den Kontoinhaber ein: ");
      strKontoinhaber = objBsZeile.nextLine();

      System.out.print("Bitte geben Sie den Anfangskontostand ein: ");
      dblAnfangskontostand = objBsZeile.nextDouble();

      Konto1 objK1 = new Konto1();
      objK1.setKontonummer(intKontonummer);
      objK1.setKontoinhaber(strKontoinhaber);
      objK1.setAnfangskontostand(dblAnfangskontostand);

      System.out.println("******************************************");
      System.out.println("Kontonummer: " + objK1.getKontonummer());
      System.out.println("Kontoinhaber: " + objK1.getKontoinhaber());
      System.out.println("Kontostand: " + objK1.getKontostand());

      System.out.println("******************************************");

      System.out.print("Bitte geben Sie den Einzahlungsbetrag ein: ");
      dblEinzahlung = objBsZeile.nextDouble();
      objK1.einzahlen(dblEinzahlung);
      System.out.println("Kontostand nach Einzahlung: " + objK1.getKontostand());

      System.out.println("******************************************");

      System.out.print("Bitte geben Sie den Abhebungsbetrag ein: ");
      dblAbhebung = objBsZeile.nextDouble();
      objK1.abheben(dblAbhebung);
      System.out.println("Kontostand nach Abhebung: " + objK1.getKontostand());

      System.out.println("******************************************");
      System.out.println("");

      objBsZeile.close();
   }
}

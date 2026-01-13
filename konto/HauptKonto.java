public class HauptKonto
{
   public static void main(String argv[])
   {
      Konto objK1;
      objK1 = new Konto();
      objK1.setInhaber("Alex");
      objK1.setKontostand(100.0);

      System.out.println("Konto 1 Inhaber: " + objK1.getInhaber());
      System.out.println("Konto 1 Kontostand: " + objK1.getKontostand() + " EUR");

      objK1.einzahlen(50.0);
      System.out.println("Nach Einzahlung (50): " + objK1.getKontostand() + " EUR");

      objK1.abheben(30.0);
      System.out.println("Nach Abhebung (30): " + objK1.getKontostand() + " EUR");

      objK1.abheben(500.0);
      System.out.println("Nach Abhebung (500): " + objK1.getKontostand() + " EUR");

      System.out.println("Zinsen bei 2.5%: " + objK1.berechneZinsen(2.5) + " EUR");

      System.out.println();

      Konto objK2;
      objK2 = new Konto("Sam", 200.0);

      System.out.println("Konto 2 Inhaber: " + objK2.getInhaber());
      System.out.println("Konto 2 Kontostand: " + objK2.getKontostand() + " EUR");

      objK2.einzahlen(20.0);
      System.out.println("Nach Einzahlung (20): " + objK2.getKontostand() + " EUR");

      objK2.abheben(60.0);
      System.out.println("Nach Abhebung (60): " + objK2.getKontostand() + " EUR");

      System.out.println("Zinsen bei 1.2%: " + objK2.berechneZinsen(1.2) + " EUR");
   }
}

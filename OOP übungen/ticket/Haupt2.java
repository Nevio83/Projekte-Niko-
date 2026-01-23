import java.util.Scanner;

public class Haupt2
{
   public static void main(String argv[])
   {
      Scanner scanner = new Scanner(System.in);
      //KinoTicket
     KinoTicket objkt1 = new KinoTicket();

     System.out.print("Bitte geben Sie die Anzahl der Tickets ein: ");
     objkt1.intAnzahl = scanner.nextInt();

     System.out.print("Ermaessigt? (1 = ja, 0 = nein): ");
     int intE = scanner.nextInt();
     objkt1.bolErmaessigt = (intE == 1);

     objkt1.dblTicketPreis = 12.0;

     System.out.println("Ticketpreis: " + objkt1.dblTicketPreis);
     System.out.println("Anzahl: " + objkt1.intAnzahl);
     System.out.println("Ermaessigt: " + objkt1.bolErmaessigt);

     objkt1.showGesamtPreis();
     objkt1.showGesamtPreisMitMwSt();

   }
}

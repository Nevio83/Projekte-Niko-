public class KinoTicket
{
   //Attribute
   public double dblTicketPreis;
   public int intAnzahl;
   public boolean bolErmaessigt;

   public void showGesamtPreis(){
    double dblGesamt;
    dblGesamt = dblTicketPreis * intAnzahl;
    if(bolErmaessigt){
      dblGesamt = dblGesamt * 0.85;
    }
    System.out.println("Der Gesamtpreis betraegt: " + dblGesamt);
   }

   public void showGesamtPreisMitMwSt(){
    double dblGesamt;
    dblGesamt = dblTicketPreis * intAnzahl * 1.07;
    if(bolErmaessigt){
      dblGesamt = dblGesamt * 0.85;
    }
    System.out.println("Der Gesamtpreis mit MwSt betraegt: " + dblGesamt);
   }
}

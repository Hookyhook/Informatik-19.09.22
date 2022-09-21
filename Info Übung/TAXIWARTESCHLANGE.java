class TAXIWARTESCHLANGE {
    // Attribute
    private int anzahlTaxis;
    private TAXI[] taxistand;

    // Konstruktor
    public TAXIWARTESCHLANGE() {
        taxistand=new TAXI[6];
        anzahlTaxis=0;
    }
  
    // Methoden
    
    // Vgl. Klassenkarte von TAXIWARTESCHLANGE im Buch S.11
     // Erg�nzen Sie die fehlenden Methoden 
    
    // 1. Methode anzahlGeben()
    // Bestimmen Sie einen geigneten Ausgabedatentyp, gibt es Eingabeparameter?
        
    // 2. Methode istLeer()
    // Bestimmen Sie einen geigneten Ausgabedatentyp
    
    public void hintenAnstellen(TAXI t){
        if (anzahlTaxis==6){
           System.out.println("Fehler: Kein Platz mehr frei!");
        }
        else {
           taxistand[anzahlTaxis]=t;
           anzahlTaxis=anzahlTaxis+1;
        }
    }
    
    
    public TAXI vorneAbfahren(){
       TAXI erstesTaxi=null;
       if (anzahlTaxis==0) {
           System.out.println("Fehler: Kein Taxi in der Schlange!");
       }
       else {
           erstesTaxi=taxistand[0];
          for (int i=1;i<anzahlTaxis;i++){
             taxistand[i-1]=taxistand[i];
          }
          taxistand[anzahlTaxis-1]=null;
          anzahlTaxis=anzahlTaxis-1;
        }
        return erstesTaxi;
    }
    public void fahrerlisteAusgeben(){
       String ausgabe="";
       for (int i=0;i<anzahlTaxis;i++){
          ausgabe=ausgabe+"|"+taxistand[i].fahrernameGeben();
       }
       System.out.println(ausgabe);
    }
   public int anzahlGeben(){
      int anzahlTaxis = 0;
      for(int i = 0; i < taxistand.length; i++){
         if(taxistand[i] != null){
            anzahlTaxis++;
         }
        
      }
      return anzahlTaxis;
    }
    public boolean istLeer(){
      boolean istLeer = true;
      for(int i = 0; i < taxistand.length; i++){
         if(taxistand[i] != null){
            istLeer = false;
         }   
      }
      return istLeer;
    }
    
 }


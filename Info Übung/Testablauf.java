class TESTABLAUF {
    // Erg�nzen Sie den passenden Namen
    TAXI taxiA,taxiB,taxiC,taxiD,taxiE,taxiF,taxiG,taxiH,taxiI,taxiJ;
    
    TAXIWARTESCHLANGE taxiwarteschlange1=new TAXIWARTESCHLANGE();
   
    // Erg�nzen Sie den passenden Namen
    public static void main(String[]args) {
       ablaufen(); 
    }
    
    // Erg�nzen Sie den passenden Namen
    private void taxisErzeugen(){
        // hier sollen 10 Taxis erzeugt werden, TaxiA...TaxiJ 
        // mit den Fahrern Britta, Hans, Peter, Willi, Hubert, Paula, Eva, Otto, Iris, Norbert
        // Jedes Taxi hat ein Kennzeichen und einen Fahrernamen
        taxiA = new TAXI("M 7343", "Britta");
        taxiB = new TAXI("M 74543", "Hans");
        taxiC = new TAXI("M 73543", "Peter");
        taxiD = new TAXI("M 73453", "Willi");
        taxiE = new TAXI("M 7345", "Hubert");
        taxiF = new TAXI("M 7123", "Paula");
        taxiG = new TAXI("M 72345", "Eva");
        taxiH = new TAXI("M 72345", "Otto");
        taxiI = new TAXI("M 7456", "Iris");
        taxiJ = new TAXI("M 74645", "Norbert");
    }
    public void ablaufen(){
        taxisErzeugen();
        taxiwarteschlange1.hintenAnstellen(taxiA);
        taxiwarteschlange1.hintenAnstellen(taxiB);
        taxiwarteschlange1.fahrerlisteAusgeben();
        for (int i=0;i<5;i++){
            taxiwarteschlange1.vorneAbfahren();
        }
        taxiwarteschlange1.hintenAnstellen(taxiC);
        taxiwarteschlange1.hintenAnstellen(taxiD);
        taxiwarteschlange1.hintenAnstellen(taxiE);
        taxiwarteschlange1.hintenAnstellen(taxiF);
        
        taxiwarteschlange1.fahrerlisteAusgeben();
        taxiwarteschlange1.vorneAbfahren();
        taxiwarteschlange1.fahrerlisteAusgeben();
        
        taxiwarteschlange1.hintenAnstellen(taxiG);
        taxiwarteschlange1.hintenAnstellen(taxiH);
        taxiwarteschlange1.hintenAnstellen(taxiI);
        taxiwarteschlange1.hintenAnstellen(taxiJ);
        taxiwarteschlange1.fahrerlisteAusgeben();
    }
}

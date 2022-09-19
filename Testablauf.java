class TESTABLAUF {
    // Ergänzen Sie den passenden Namen
    TAXI taxiA,taxiB,taxiC,taxiD,taxiE,taxiF,taxiG,taxiH,taxiI,taxiJ;
    
    TAXIWARTESCHLANGE taxiwarteschlange1=new TAXIWARTESCHLANGE();
   
    // Ergänzen Sie den passenden Namen
    public TESTABLAUF() {
        
    }
    
    // Ergänzen Sie den passenden Namen
    private void taxisErzeugen(){
        // hier sollen 10 Taxis erzeugt werden, TaxiA...TaxiJ 
        // mit den Fahrern Britta, Hans, Peter, Willi, Hubert, Paula, Eva, Otto, Iris, Norbert
        // Jedes Taxi hat ein Kennzeichen und einen Fahrernamen
        
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

class TAXI {
    // Attribute
    // Erg�nzen Sie die fehlenden Attribute, s.Klassenkarte S.11
    private String Kennzeichen;
    private String Fahrernamen;
    // Konstrutktor
    public TAXI(String k, String f) {
      
      Kennzeichen = k;
      Fahrernamen = f;
       
    }
    
    // Methoden
    public String kennzeichenGeben(){
        return Kennzeichen;
    }
      
    public String  fahrernameGeben(){
        return Fahrernamen;
    }
   
}

public class App {
public String name;
public String nachname;
public String a;
//1   
    public String gibNamen () {
        return name;
    }
//2
    public String gibNamen2 (boolean nameverändern){
       if(nameverändern){
        name = name+""+nachname;
       }
    return name; 
    }
//3

    public float mittelwert (int zahl1, int zahl2){
        float mittelwert = (zahl1 + zahl2)/2;
        return mittelwert;
    }
//4
    public String namenabrufen (){
        return gibNamen();
    }

}

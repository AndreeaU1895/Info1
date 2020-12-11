public class Middle{
  public static void main(String[]args){
        int a = StdIn.readInt(); //a einlesen
        for(int i=1; i<=101; i++){
		StdOut.print(a+", "); //a ausgeben
        	a = a*a;		//a quadrieren
		a = (a/10)%100; 	// a aktualisieren
	}
  }
}


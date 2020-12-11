public class Middle1{

 public static void alleZweistelligeZahlen(){
  for(int i = 10; i<=99; i++)
	middleSquare(i);
}
 public static void middleSquare(int a){
 	StdOut.print("\nZahl " + a + "\n");
        for(int i=1; i<=101; i++){
                StdOut.print(a+", "); //a ausgeben
                a = a*a;                //a quadrieren
                a = (a/10)%100;         // a aktualisieren
        }

 
} 

  public  static void main(String [] args){
	alleZweistelligeZahlen();
  }
}


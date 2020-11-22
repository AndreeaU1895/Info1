public class IterierteQuersume{
   public static void main(String[] args){	
	int a = Integer.parseInt(args[0]);
	int itQuersum = 0;
	if (a<0){	// keine negative zahlen
	   System.out.println("nur positive Zahlen");
	   return;
	}
	while( a > 9 ) {		// iteriere solange a groesser 9
	   itQuersum = 0;		// Quersumme refreshen
	   while( a != 0) {		// iteriere solange a nicht 0 ist
		itQuersum = itQuersum + ( a % 10 ); // itSumme + Rest von a
		a = a / 10;		// a verkleinern
	   }
	   a = itQuersum;               // a gleich neue Quersumme
	}
	System.out.println(itQuersum);
   }
}

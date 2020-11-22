public class QuadratModern{
    public static void main(String[] args){
	int anzahlUngeradenZahlen = Integer.parseInt(args[0]);
	int quadrat = 0;
	int nextUngeradeZahl = 1;
	while (anzahlUngeradenZahlen != 0){
	   quadrat += nextUngeradeZahl;
	   nextUngeradeZahl += 2;
	   anzahlUngeradenZahlen--;
	}
	System.out.println( quadrat );
    }
}


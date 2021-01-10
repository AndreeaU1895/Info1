# Aufgabe 1


public class TypeCasting{
   public static void main(String[]args){
	short a = 73;
	short b = 219;
	short c = Cshort) (a+b);
	int d =(byte) c;
	short = e = -3;
	int f =(char)e;
	int g = 1;
	int h = 4;
	double i = g/h *4.0;

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
   }
}



  1. Die main Methode produziert folgende Ausgabe
 73 - Wert von *a* ist eine Variable von Type short
 219 - Wert von *b* ist eine Variable von Type short
 292 - Wert von *c* ist auch eine Variable von Type short und nicht Integer (a +b) weil es eine type casting benutzt ist
 36 - Wert von *d* stellt eine Variable von Type byte, die in int gespeichert ist
 -3 - Wert von *e* ist von Type short
 65533 - Wert von *f* ist eine char in int gespeichert, weil in int gibt es nicht negativen Zahlen, wird es die Reihnfolge von hinter anfangen und wird es von 65535 -3 abgezogen, deshalb ist das Endergebnis 65533  
 1 - Wert von*g* ist eine int Variable
 4 - Wert von *h* ist eine int Variable
 0.0 - Wert von *i* ist von Type double



  2.Java-Compiler verlangt in Zeile 5 ein type casting damit die Addition von *a* und *b* nicht automatisch zu Integer umgewandelt wird, so wird *c* als short Type kompiliert. 


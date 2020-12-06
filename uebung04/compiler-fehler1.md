## `long`, `long` ago (I1-ID: 5nufzi61yii0)

1. `int n1 = 3000000000;`
2. `long n2 = 3000000000;`
3. `long n3 = 300000000L;`
4. `long n4 = 300000000F;`

Nachfolgend sind die drei der vorstehenden Codezeilen aufgelistet,
die der Java-Compiler nicht akzeptiert,
jeweils mit einer Beschreibung des Fehlers.

* Zeile 1 , Fehler: Integer Zahl ist zu groß/ die gegebene Zahl n1 ist zu groß für Integer 
* Zeile 2 , Fehler: Integer Zahl ist zu groß/ die gegebene Zahl n2 ist zu groß für Integer 
* Zeile 4 , Fehler: Inkompatible Typen, eine Lösung wäre möglich, wenn float zu long konvertiert würde

---

## Casting-Show (I1-ID: b9ej9071yii0)

1. `int n1 = (int) 3000000000.;`
2. `int n2 = (int) 3000000.0f;`
3. `long n3 = (long) 3000000000;`
4. `double n4 = (int) 30000000e0;`

Von den vorstehenden Codezeilen akzeptiert der Java-Compiler die Zeile 3 nicht, weil die gegebene Zahl n3 zu groß für Integer ist

Die anderen Zeilen sind richtig, weil sie werden kompiliert, außerdem werden und andere Mittel benutzt wie, z.B (int), .(in n1), f(in n2), e0 (in n4) um float, double, long in integer zu umwandeln, um das Kompilieren zu ermoeglichen.











## Aufgabe 1 - Codierung von Sprachen

1. 
 *a)* $a^n$ ist für binäre Zahlen Anzahl der Kodierungsmöglichkeiten
      $2^2$ = 4 ist zu klein, $2^4$ =16 < 22 ist zu klein, $2^5$ = 32 > 22, das bedeutet, dass es werden 5 Bits benötigt
    
 *b)* es gibt 22^2 Paarkombinationen, das bedeutet 22^2 = 484, dafür werden 9 bits benötigt, da 2^8 =256 ist zu klein, 2^9 = 512 > 484
 
 *c)* wenn 100 Glyphen einzeln kodiert werden, bekommt man 100 * 5 = 500 bits, wenn aber werden sie in Paare kodiert werden 450 bits benötigt, also weniger als             500.Berechnungen mit großeren Yhlen können schneller duchgefürt werden, die Datenmengen können schneller verarbeitet werden.
 
 
 2.
 *a)* zu den 22 Glyphen kommen noch 4 Zeichnen = 26. Dazu werden weiter wie bei der Aufgabe 1 a) 5 bits benötigt, da 2^5 > 26
 
 *b)* 22^2 wird weiter die Anzahl der Paarkombinationen bleiben. Die '-Glyphe kann nur die zweite Glyphes eines Paars sein und das bedeutet, dass es wäre nicht möglich dass 2 '-Glyphen ein Paar bilden.Also werden die Zahlglyphen und '-Glyphen einzeln kodiert. (22^2 -22-2+4+1=467)
 
 *c)* die Codierung eines Textes mit der Methode aus Aufgabenteil 2b) ist in jedem Fall nicht besser als die Codierung mit der Methode aus
Aufgabenteil 2a), weil es kann passieren dass, ein Text nur aus Zahlen und ' besteht. 

 *d)*  Paare: 4^2 = 16 Moeglichkeiten$, Zaichen und '-Glyphen als Paaren 4 Moeglichkeiten,  Tripel 16  Moeglichkeiten

 *e)* Es gibt Zahlenkombinationen mit 5 Glyphen. Nach Aufgabe a) würde jede dieser Glyphen 5 bits brauchen, insgesamnt 25. In Aufgabe d) gibt es Zahlenpaare und Tripel mit Zahlen und '-Glyphen welche diese Kombinationen abdecken, deshalb werden nur 18 bits benötigt.


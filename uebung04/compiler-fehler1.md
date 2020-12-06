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

Die anderen Zeilen sind richtig, weil ... 








## Aufgabe 1 - Codierung von Sprachen

1. 
 a) 2^n

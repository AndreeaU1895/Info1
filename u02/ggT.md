Markdown/AciiMath to HTML/PDF (by pandoc/wkhtmltopdf)
# Informatik I, Übung 02, Aufgabe 2
Markdown und AsciiMath
## Größter gemeinsamer Teiler (ggT)

### Das ggT-Problem
**Gegeben.**  Zwei positive ganze Zahlen *a,b* ∈ Z mit *a,b* > 0.
- *d* teil *a* und *b* ohne Rest
- es gibt keine ganze Zahl *d'* ∈ Z mit *d'>d*,  die *a* und *b* ohne Rest teilt

### Der Euklidischer Algorithmus (klassisch)

**Eingabe.** zwei ganze Zahlen *a*,*b* mit *a* >*b* ≥ 0

**Initialisierung.** *x*← *a*, *y* ← *b*

**Iteration.**  wiederhole das Folgende solange *y* ≠ 0 gilt
- falls (*x*>*y*) dann *x* ← *x* - *y*
- sonst *y* ← *y* -*x*

**Abschluss.** *d* ← *x*

**Rückgabe.** *d*

*Hinweis.* *A* ← *B* steht für: speichere aktuellen Wert von *B* in *A* .

## Euklidischer Algorithmus in Java

// Eklidischer Algorithmus (klassisch)
// Eingabe von a und b
// Initialisierung
int x = a;
int y = b;
// Iteration
while (y != 0) { // ’!=’ steht fuer ’ungleich’
if (x > y)
x = x - y;
else
y = y - x;
}
// Abschluss
int d = x
// Rückgabe von d

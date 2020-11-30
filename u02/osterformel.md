Markdown/AciiMath to HTML/PDF (by pandoc/wkhtmltopdf)

# Informatik I, Übung 01, Aufgabe 1

Markdown und AsciiMath

### Osterdatum nach Gauß

**Gegeben.** Zahl des Jahres *Jahr*∈ N, > 0 und die natürliche Zahlen (∈ N) *x*, *y*, *z* > 0
**Gesucht.** die  Reste der Divisionen *a, b, c, d, e* = 0
- *Jahr* teilt *x*, *y*, *z*
- auf die Quotienten wird gar keine Rücksicht aufgenommen

### Osterformel nach Gauß 

**Eingabe.** vier natürliche Zahlen *Jahr*, *x*, *y*, *z* > 0

**Initialisierung.** *x* ← 19, *y* ← 4, *z* ← 7, *Jahr* ← 2020, *a* = *Jahr* % 19
                      *b* = *Jahr* % 4, *c* = *Jahr* % 7

**Ablauf.** *d* = (19*a* + 23) % 30, 
             
             - falls (*Jahr* / 100 % 2 = 1) dann *e* ← (2*b* + 4*c* + 6*d* + 3) % 7
             - sonst *e*  ← (2*b* + 4*c* + 6*d* + 4) % 7
             
            
**Abschluss** falls *d* + *e* > 9 dann April ← *d* + *e* - 9
              sonst März ← 22 + *d* + *e* 

              
              

**Rückgabe*  *datum*




public class ISBN10Besser{

    private int nr;
    private int querSum;
    private boolean istPlus;
    /**
    * Konstruktor
    */
    public ISBN10Besser()
    {
	StdOut.print("Bitte 9 Stellen einer 10er ISBN eingeben: ");
	nr  = StdIn.readInt();
        querSum = 0;
        istPlus = true;
    }

    public void zahlZehnBerechnen()
    {
	for(int i = 9; i >= 1; i--)
	{
	    querSum += nr % 10 * i;
	    nr /= 10;
	}
	nr = querSum;
	while ( nr >= 11)
	{
	    querSum = 0;
	    while (nr != 0)
	    {
		querSum = istPlus ? querSum + nr % 10 : querSum - nr % 10;
		nr /= 10;
		istPlus = !istPlus;
	    }
	    nr = querSum;
	}
   	while ( querSum < 0 )
	{
	    querSum += 11;
	}
	if (querSum == 10)
	{
	    StdOut.println("X");
	} else {
	    StdOut.println(querSum);
	}
    }
    public static void main(String[] args)
    {
	ISBN10Besser test = new ISBN10Besser();
	test.zahlZehnBerechnen();
    }
}

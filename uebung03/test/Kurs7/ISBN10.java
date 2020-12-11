public class ISBN10{
    public static void main(String[] args){
	int nr  = StdIn.readInt();
	int querSum = 0;
	boolean istPlus = true;

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
}

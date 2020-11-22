public class QuadratKlassisch{
    public static void main(String[] args){
	int x =Integer.parseInt(args[0]);
	int sum = 0;
	int ungeradeZahl = 1;
	if(x<0){
	    x =x*-1;
	}
	for(int i=1; i<=x; i++){
	    sum = sum + ungeradeZahl;
	    ungeradeZahl = ungeradeZahl +2;
	}
	System.out.println(sum);
    }
}

public class Quersume{
public static void main(String[] args){	
	int a=Integer.parseInt(args[0]);
	//int a=0;
	int Quersum =0;
	if (a<0){
	System.out.println("nur positive Zahlen");
	return;
	}
	while(a!=0){
	Quersum =Quersum +(a%10);
	a = a/10;
	}
	System.out.println(Quersum);
	}
}

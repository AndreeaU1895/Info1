public class EuklidKlassisch{
	public static void main(String [] args){
	int x= Integer.parseInt(args[0]); //Wertuebernahme von..
	int y= Integer.parseInt(args[1]); //...der Komandozeile
	if (x<=0|| y<=0){ //"||" steht fuer "oder"
	  System.out.println("nur positive Argumente!!");
	return;//Ende
	}
	System.out.println("|"+"K1"+"|"+x+"|"+y+"|"+"ggT("+x+","+y+")");
	System.out.println("|"+"K2"+"|"+x+"|"+y+"|"+"while("+x+"!=0)");

	while(y!= 0){	//M2

	System.out.println("|"+"K3"+"|"+x+"|"+y+"|"+"if("+x+">"+y+")");

	 System.out.println("|"+"K4"+"|"+x+"|"+y+"|"+"x="+x+ "-"+ y);
	if(x>y){	//M3

	//System.out.println("|"+"K4"+"|"+x+"|"+y+"|"+"x="+x+ "-"+ y);
	x = x-y;	//M4
	}else{
	y = y-x;	//M5
	System.out.println("|"+"K5"+"|"+x+"|"+y+"|"+"y="+y+"-"+x);
	}

	//M6
	System.out.println("|"+"K6"+"|"+x+"|"+y+"|"+x);


	return;	
	}
}

}

public class EuklidModern {
    
    public static void main( String[] args ){ 
	int x = Integer.parseInt(args[0]); // Wertuebernahme von ...
	int y = Integer.parseInt(args[1]); // ... der Kommandozeile
	if ( x <= 0 || y <= 0)  { // '||' steht fuer 'oder'
	    System.out.println("nur positive Argumente!!");
	    return; // Ende
	}
	
	// ggT(x,y)                                    // M1	 
	int r;

	

	 System.out.println("| M2\t| "+x+"\t| "+y+"\t| -\t|  while("+x+"!=0)");
	while ( y != 0 ) {	// M2
	    //System.out.println("| M2\t| "+x+"\t| "+y+"\t| -\t|  while("+x+"!=0)");

	    r = x % y;		// M3
	    System.out.println("| M3\t| "+x+"\t| "+y+"\t|"+r+" r="+x+"%"+y);

	    x = y;		//M4
	    System.out.println("| M4\t| "+x+"\t| "+y+"|"+r+" "+x+"="+y);

	    y = r; 		//M5
	    System.out.println("| M5\t| "+x+"\t "+y+"\t|"+r+"| "+r+"= "+y);
	
	 System.out.println("| M2\t| "+x+"\t| "+y+"\t|" +r+"\t|  while("+x+"!=0)");
	}
	System.out.println();//M6
		 System.out.println("|M6\t|" +x+"|" +y+"|"+"-"+"|" +"="+x);

	return;
    } 
}

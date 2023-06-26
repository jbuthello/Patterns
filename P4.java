package Patterns;

public class P4 {
	public static void main(String[] args) {
//	      1 
//	    1 2 3 
//	  1 2 3 4 5 
//	1 2 3 4 5 6 7 
//	  1 2 3 4 5 
//	    1 2 3 
//	      1 
	      
		int st=1, n=7, sp=n/2;

		for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=st;j++) {
			System.out.print(j+" ");
		}
		if(i<=n/2) {
			st=st+2;
			sp--;
		}
		else {
			st=st-2;
			sp++;
		} System.out.println();
	}
	}

}

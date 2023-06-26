package Patterns;

public class P3 {
	public static void main(String[] args) {
//        1 
//      0 1 0 
//    1 0 1 0 1 
//  0 1 0 1 0 1 0 
//    1 0 1 0 1 
//      0 1 0 
//        1 
	
	int k=1, n=7,st=1,sp=n/2;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print("  ");
		}
		
		for(int j=1;j<=st;j++) {
			System.out.print(k%2+" ");
			k++;
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

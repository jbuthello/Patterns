package Patterns;

public class P6 {
	public static void main(String[] args) {
//		*****
//		 ****
//		  ***
//		   **
//		    *
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int s=1;s<=n-i;s++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}

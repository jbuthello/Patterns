package Patterns;

public class P5 {
//  1  
//2  3  
//3  4  5  
//4  5  6  7  
//5  6  7  8  9

	public static void main(String[] args) {
		
		int a, n=5;
		
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print("   ");
			}
			a=i;
			for(int j=1;j<=i;j++) {
				System.out.print(a+"  ");
				a++;
			}
			System.out.println();
		}
		
	}

}

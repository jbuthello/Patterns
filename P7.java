package Patterns;

public class P7 {
	public static void main(String[] args) {
//		54321
//		5432
//		543
//		54
//		5
		int n=5;
		for(int i=n;i>=1;i--) {
			int temp=n;
			for(int j=1;j<=i;j++) {
				System.out.print(temp+" ");	temp--;
			}System.out.println();
		}
	}
}

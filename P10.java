package Patterns;

public class P10 {
	public static void main(String[] args) {
		
		int n=7, count;
		for(int i=1;i<=n;i++) {
			int temp=i;
			count=n;
			for(int j=1;j<=n;j++) {
				if(j==1) {
					System.out.print(i+" ");
					count--;
				}else {
					temp=temp+count;
					System.out.print(temp+" ");
					count--;
				}
			}System.out.println();
			
		}
	}

}

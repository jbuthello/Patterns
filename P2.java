package Patterns;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
    //      4 
	//    3 4 3 
	//  2 3 4 3 2 
	//1 2 3 4 3 2 1 
	//  2 3 4 3 2 
	//    3 4 3 
    //	    4 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");	
		int n=sc.nextInt();
		int st=1,sp=n/2;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=sp;s++) {
				System.out.print("  ");
			}
			int k=sp+1;
			for(int j=1;j<=st;j++) {
				System.out.print(k+" ");
				if(j<=st/2) {
					k++;
				}else {k--;}
			}
			if(i<=n/2) {
				sp--;st=st+2;
			}else {sp++; st=st-2;}
			System.out.println();
			}
	}
}

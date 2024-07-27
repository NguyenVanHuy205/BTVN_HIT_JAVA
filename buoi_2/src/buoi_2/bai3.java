package bai1;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap n= ");
		n = sc.nextInt();
		int[][] a=new int[n][n];
		int h1=0,h2=n-1,c1=0,c2=n-1,dem=1;
		while(h1<=h2) {
			for(int i=c1;i<=c2;i++) {
				a[h1][i]=dem;
				dem++;
			}
			h1++;
			for(int i=h1;i<=h2;i++) {
				a[i][c2]=dem;
				dem++;
			}
			c2--;
			if(h2>h1) {
				for(int i=c2;i>=c1;i--) {
					a[h2][i]=dem;
					dem++;
				}
				h2--;
			}
			if(c2>c1) {
				for(int i=h2;i>=h1;i--) {
					a[i][c1]=dem;
					dem++;
				}
				c1++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

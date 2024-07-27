package bai1;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("nhap n= ");
		do {
			n = scanner.nextInt();
			if(n<=0 || n>Math.pow(10, 4))
				System.out.println("yc nhap la");
		}
		while(n<=0 || n>Math.pow(10, 4));
		int[] a= new int[n];
		int[] b= new int[n];
		for(int i=0;i<n;i++) {
			do {
				a[i] = scanner.nextInt();
				if(a[i]<0 || a[i]>Math.pow(10,8))
					System.out.println("yc nhap lai");
			}
			while(a[i]<0 || a[i]>Math.pow(10,8));
		}
		for(int i=0;i<n;i++) {
			if(i%2==1) {
				int t;
				if(i==n-1) {
					t = Math.abs(a[i-1]);
					b[i]=a[i]+t;
				}
				else {
					int d=a[i-1]-a[i+1];
					t = Math.abs(d);
					b[i]=a[i]+t;
				}
			}
			else {
				b[i]=a[i];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
		scanner.close();
	}
}
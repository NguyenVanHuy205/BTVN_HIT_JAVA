package Buoi3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = (int) (Math.random()*11);
		int b = (int) (Math.random()*11);
		boolean check = Math.random() < 0.5 ;
		int c;
		if(check) {
			c=a+b;
		}
		else {
			do {
				c = (int) (Math.random()*21);
			}
			while(a+b==c);
		}
		if(a+b==c) {
			System.out.println(a + " + " + b + " = " + c);
			System.out.print("Phép tính trên đúng hay sai (Y/N): ");
			String Y = sc.nextLine();
			if(Y.equals("Y")) {
				System.out.println("true");
			}
		}
		else {
			System.out.println(a + " + " + b + " = " + c);
			System.out.print("Phép tính trên đúng hay sai (Y/N): ");
			String N = sc.nextLine();
			if(N.equals("N")) {
				System.out.println("false");
			}
		}
		sc.close();
	}
}

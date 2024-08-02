package Buoi3;

import java.util.Scanner;

public class bai2 {
	public static Boolean ktra(String t) {
		int i=0;
		int n= t.length()-1;
		while(n>=i) {
			if(t.charAt(i) != t.charAt(n-i)){
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t;
		t = sc.nextLine();
		if(ktra(t)) {
			String k = t.toUpperCase();
			System.out.println(k);
		}
		else {
			String k = t.toLowerCase();
			System.out.println(k);
		}
		sc.close();
	}
}

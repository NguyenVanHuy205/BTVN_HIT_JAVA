package Buoi5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên: ");
		int n = sc.nextInt();
		Student[]st = new Student[n];
		for(int i = 0;i<n;i++) {
			st[i]=new Student();
			st[i].nhap();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Sinh viên thứ " + (i + 1) + ":");
			st[i].xuat();
		}
	}
}

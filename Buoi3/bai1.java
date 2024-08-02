package Buoi3;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t1 = "Square";
		String t2 = "Triangle";
		String t3 = "Circle";
		String type;
		System.out.println("Nhap hinh dang cua vien gach: ");
		type = sc.nextLine();
		if(type.equals(t1)==false && type.equals(t2)==false && type.equals(t3)==false) {
			System.out.println("Hình dạng không hợp lệ!");
		}
		else {
			if(type.equals(t1)) {
				int a = sc.nextInt();
				System.out.println(Math.pow(a, 2));
			}
			else if(type.equals(t2)) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				float s;
				s =(float) (Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b)))/4;
				System.out.printf("%.2f",s);
			}
			else {
				int r = sc.nextInt();
				float s;
				s = (float) (Math.PI*Math.pow(r,2));
				System.out.printf("%.2f",s);
			}
		}
		sc.close();
	}
}

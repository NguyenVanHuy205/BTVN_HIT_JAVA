package Buoi5;

import java.util.Scanner;

public class QuanLy {
	private String MaQL;
	private String Hoten;
	public QuanLy() {
		
	}
	public QuanLy(String maQL, String hoten) {
		this.MaQL = maQL;
		this.Hoten = hoten;
	}
	public String getMaQL() {
		return MaQL;
	}
	public void setMaQL(String maQL) {
		MaQL = maQL;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mã QL: ");
		MaQL = sc.nextLine();
		System.out.print("Họ tên: ");
		Hoten = sc.nextLine();
	}
	void output() {
		System.out.println("Mã QL: " + MaQL + "--Họ tên: " + Hoten);
	}
}

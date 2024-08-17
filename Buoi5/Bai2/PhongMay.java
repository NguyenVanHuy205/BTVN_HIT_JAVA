package Buoi5;

import java.util.Scanner;

public class PhongMay {
	private String MaPhong;
	private String TenPhong;
	private double Dientich;
	private QuanLy x;
	private May[] y;
	private int n;
	public PhongMay() {
		x = new QuanLy();
	}
	public PhongMay(String maPhong, String tenPhong, double dientich, QuanLy x, May y, int n) {
		this.MaPhong = maPhong;
		this.TenPhong = tenPhong;
		this.Dientich = dientich;
		this.x = x;
		this.y = y;
		this.n = n;
	}
	public String getMaPhong() {
		return MaPhong;
	}
	public void setMaPhong(String maPhong) {
		MaPhong = maPhong;
	}
	public String getTenPhong() {
		return TenPhong;
	}
	public void setTenPhong(String tenPhong) {
		TenPhong = tenPhong;
	}
	public double getDientich() {
		return Dientich;
	}
	public void setDientich(double dientich) {
		Dientich = dientich;
	}
	public QuanLy getX() {
		return x;
	}
	public void setX(QuanLy x) {
		this.x = x;
	}
	public May getY() {
		return y;
	}
	public void setY(May y) {
		this.y = y;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mã Phòng: ");
		MaPhong = sc.nextLine();
		System.out.print("Tên Phòng: ");
		TenPhong = sc.nextLine();
		System.out.print("Diện tích: ");
		Dientich = sc.nextDouble(); sc.nextLine();
		x.input();
		System.out.print("Nhập số máy tính có trong phòng: ");
		n = sc.nextInt();
		y = new May[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhập thông tin máy số " + (i+1));
			y[i] = new May();
			y[i].input();
		}
	}
	void output() {	
		System.out.println("Mã Phòng: " + MaPhong + "--Tên Phòng: " + TenPhong + "--Diện tích: " + Dientich);
		x.output();
		for(int i=0;i<n;i++) {
			System.out.println("Máy số " + (i+1));
			y[i].output();
		}
	}
	
}

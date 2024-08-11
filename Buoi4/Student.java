package Buoi4;

import java.util.Scanner;

public class Student {
	private String name;
	private int namsinh;
	private String address;
	private double tx1;
	private double tx2;
	private double kthp;
	private int tietnghi;
	public Student() {
		
	}
	public Student(String name, int namsinh, String address, double tx1, double tx2, double kthp, int tietnghi) {
		this.name = name;
		this.namsinh = namsinh;
		this.address = address;
		this.tx1 = tx1;
		this.tx2 = tx2;
		this.kthp = kthp;
		this.tietnghi = tietnghi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTx1() {
		return tx1;
	}
	public void setTx1(double tx1) {
		this.tx1 = tx1;
	}
	public double getTx2() {
		return tx2;
	}
	public void setTx2(double tx2) {
		this.tx2 = tx2;
	}
	public double getKthp() {
		return kthp;
	}
	public void setKthp(double kthp) {
		this.kthp = kthp;
	}
	public int getTietnghi() {
		return tietnghi;
	}
	public void setTietnghi(int tietnghi) {
		this.tietnghi = tietnghi;
	}
	public int tuoi() {
		return (2024 - namsinh);
	}
	public double gpa() {
		return (tx1*0.2+tx2*0.3+kthp*0.5);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		System.out.println("Nhập năm sinh: ");
		namsinh = sc.nextInt();
		System.out.println("Nhập địa chỉ: ");
		address = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhập điểm TX1: ");
		tx1 = sc.nextDouble();
		System.out.println("Nhập điểm TX2: ");
		tx2 = sc.nextDouble();
		System.out.println("Nhập điểm KTHP: ");
		kthp = sc.nextDouble();
		System.out.println("Nhập số tiết nghỉ: ");
		tietnghi = sc.nextInt();
	}
	public void xuat() {
		System.out.println(name + " " + tuoi() + " " + address + " " + tx1 + " " + tx2 + " " + kthp + " " + gpa() + " " + tietnghi);
	}
}

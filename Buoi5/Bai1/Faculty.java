package Buoi5;

import java.util.Scanner;

public class Faculty {
	private String Name;
	private String Date;
	private School x;
	public Faculty() {
		x = new School();
	}
	public Faculty(String Name, String Date, School x) {
		this.Name = Name;
		this.Date = Date;
		this.x = x;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public School getX() {
		return x;
	}
	public void setX(School x) {
		this.x = x;
	}
	Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.print("Nhập tên khoa: ");
		Name = sc.nextLine();
		System.out.print("Ngày vào khoa: ");
		Date = sc.nextLine();
		x.nhap();
	}
	public void xuat() {
		System.out.print("--Tên khoa: " + Name + "--Ngày vào khoa: "+ Date);
		x.xuat();
	}
}

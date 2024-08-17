package Buoi5;

import java.util.Scanner;

public class School {
	private String Name;
	private String Date;
	public School() {
		
	}
	public School(String Name, String Date) {
		this.Name = Name;
		this.Date = Date;
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
	Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.print("Nhập tên trường: ");
		Name = sc.nextLine();
		System.out.print("Ngày vào trường: ");
		Date = sc.nextLine();
	}
	public void xuat() {
		System.out.println("--Tên trường: " + Name + "--Ngày vào trường: "+ Date);
	}
	
}

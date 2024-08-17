package Buoi5;

import java.util.Scanner;

public class Student {
	private String Name;
	private String Classname;
	private double Score;
	private Faculty y;
	public Student(String Name, String Classname, double Score) {
		this.Name = Name;
		this.Classname = Classname;
		this.Score = Score;
	}
	public Student() {
		y = new Faculty();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getClassname() {
		return Classname;
	}
	public void setClassname(String classname) {
		Classname = classname;
	}
	public double getScore() {
		return Score;
	}
	public void setScore(double score) {
		Score = score;
	}
	public Faculty getY() {
		return y;
	}
	public void setY(Faculty y) {
		this.y = y;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên: ");
		Name = sc.nextLine();
		System.out.print("Nhập lớp: ");
		Classname = sc.nextLine();
		System.out.print("Nhập điểm: ");
		Score = sc.nextDouble();
		sc.nextLine();
		y.nhap();
	}
	public void xuat() {
		System.out.print("Tên: " + Name + "--Lớp: "+ Classname + "--Score: " + Score);
		y.xuat();
	}
}

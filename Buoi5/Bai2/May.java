package Buoi5;

import java.util.Scanner;

public class May {
	private String MaMay;
	private String TenMay;
	private String TinhTrang;
	public May() {
		
	}
	public May(String MaMay, String TenMay, String TinhTrang) {
		this.MaMay = MaMay;
		this.TenMay = TenMay;
		this.TinhTrang = TinhTrang;
	}
	public String getMaMay() {
		return MaMay;
	}
	public void setMaMay(String maMay) {
		MaMay = maMay;
	}
	public String getTenMay() {
		return TenMay;
	}
	public void setTenMay(String tenMay) {
		TenMay = tenMay;
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mã máy: ");
		MaMay = sc.nextLine();
		System.out.print("Tên máy: ");
		TenMay = sc.nextLine();
		System.out.print("Tình trạng: ");
		TinhTrang = sc.nextLine();
	}
	void output() {
		System.out.println("Mã máy: " + MaMay + "--Tên máy: " + TenMay + "--Tình trạng: " + TinhTrang);
	}
}

package Buoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Student[] st = new Student[n];
        st[0] = new Student("Lò Văn Murad", 2005, "Hà Nội", 8, 9, 10, 0);
        st[1] = new Student("Nguyễn Thị Alice", 2006, "Hà Nội", 7, 9, 10, 2);
        st[2] = new Student("Nguyễn Văn Flo", 2000, "Hà Nội", 6, 6, 7, 5);
        st[3] = new Student("Nguyễn Hữu Nakarot", 2010, "Hà Nội", 8, 8, 7, 8);
        st[4] = new Student("Nguyễn Nhật Krixi", 2009, "Liên Quân", 2, 10, 1, 3);
        for (Student hs : st) {
            hs.xuat();
        }

        System.out.println("----------MENU----------");
        System.out.println("1. Thêm sinh viên mới.");
        System.out.println("2. Sửa thông tin sinh viên.");
        System.out.println("3. Sắp xếp theo tuổi.");
        System.out.println("4. Sắp xếp theo GPA.");
        System.out.println("5. Sắp xếp theo số tiết nghỉ.");
        System.out.println("6. Xóa sinh viên.");
        System.out.print("Nhập lựa chọn: ");
        
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.print("Số sinh viên cần thêm: ");
                int add = sc.nextInt();
                int newsize = n + add;

                Student[] st1 = new Student[newsize];
                for (int i = 0; i < n; i++) {
                    st1[i] = st[i];
                }
                for (int i = n; i < newsize; i++) {
                    st1[i] = new Student(); 
                    st1[i].nhap();       
                }
                for (Student hs : st1) {
                    hs.xuat();
                }
                break;
            case 2:
            	System.out.print("nhập thứ tự sinh viên muôn sửa: ");
            	int stt = sc.nextInt();
            	for(int i = 0 ;i < n; i++) {
            		if(i == stt) {
            			st[i].nhap();
            		}
            	}
            	for(Student hs : st) {
            		hs.xuat();
            	}
            	break;	
            case 3:
            	Student tem = new Student();
            	for(int i = 0; i < n-1; i++) {
            		for(int j =i+1; j<n; j++) {
            			if(st[i].tuoi()>st[j].tuoi()) {
            				tem=st[i];
            				st[i]=st[j];
            				st[j]=tem;
            			}
            		}
            	}
            	for(Student hs : st) {
            		hs.xuat();
            	}
            	break;
            case 4:
            	Student temp = new Student();
            	for(int i = 0; i < n-1; i++) {
            		for(int j =i+1; j<n; j++) {
            			if(st[i].gpa()>st[j].gpa()) {
            				temp=st[i];
            				st[i]=st[j];
            				st[j]=temp;
            			}
            		}
            	}
            	for(Student hs : st) {
            		hs.xuat();
            	}
            	break;
            case 5:
            	Student tempp = new Student();
            	for(int i = 0; i < n-1; i++) {
            		for(int j =i+1; j<n; j++) {
            			if(st[i].getTietnghi()>st[j].getTietnghi()) {
            				tempp=st[i];
            				st[i]=st[j];
            				st[j]=tempp;
            			}
            		}
            	}
            	for(Student hs : st) {
            		hs.xuat();
            	}
            	break;
            case 6:
            	System.out.print("Số thứ tự sinh viên muốn xóa: ");
            	int delete = sc.nextInt();
            	Student [] st2 = new Student[n];
            	for(int i=0;i<delete;i++) {
            		st2[i]=st[i];
            	}
            	for(int i=delete;i<n-1;i++) {
            		st2[i]=st[i+1];
            	}
            	n--;
            	for(Student hs : st2) {
            		hs.xuat();
            	}
            	break;
        }

        sc.close(); 
    }
}

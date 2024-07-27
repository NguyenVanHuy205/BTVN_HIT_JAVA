package bai1;
import java.util.Arrays;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float r,cv,dt;
		System.out.println("Nhap r= ");
		do {
			r = scanner.nextFloat();
		}
		while(r<=0 || r>=1000);
		cv=(float) (2*(3.14)*r);
		System.out.printf("chu vi bang %.3f \n",cv);
		dt=(float) (3.14*Math.pow(r, 2));
		System.out.printf("dien tich bang %.3f",dt);
	}
}

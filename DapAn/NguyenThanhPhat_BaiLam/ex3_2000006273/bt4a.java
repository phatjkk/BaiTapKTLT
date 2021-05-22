import java.util.Scanner;

public class bt4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tu,mau;
		System.out.println("Nhap tu so:");
		tu = sc.nextInt();
		System.out.println("Nhap mau so:");
		mau = sc.nextInt();
		if((float)tu/(float)mau<0) {
			System.out.println("So am");	
		}
		else {
			if((float)tu/(float)mau==0) {
				System.out.println("Bang 0");
			}
			else {
				System.out.println("So duong");
			}
		}
	  }
} 

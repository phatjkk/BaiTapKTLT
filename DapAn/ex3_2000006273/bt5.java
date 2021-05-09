import java.util.Scanner;

public class bt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tuA,mauA,tuB,mauB;
		System.out.println("Nhap tu so phan so A:");
		tuA = sc.nextInt();
		System.out.println("Nhap mau so phan so A:");
		mauA = sc.nextInt();
		System.out.println("Nhap tu so phan so B:");
		tuB = sc.nextInt();
		System.out.println("Nhap mau so phan so B:");
		mauB = sc.nextInt();
		if((float)tuA/(float)mauA > (float)tuB/(float)mauB) {
			System.out.println("Phan so A lon nhat");
		}
		else {
			if((float)tuA/(float)mauA == (float)tuB/(float)mauB)
				System.out.println("Khong co phan so lon nhat");
			else
				System.out.println("Phan so B lon nhat");
		}
	}
}

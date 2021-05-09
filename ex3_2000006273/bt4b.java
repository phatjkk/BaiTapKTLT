import java.util.Scanner;

public class bt4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tu,mau;
		System.out.println("Nhap tu so:");
		tu = sc.nextInt();
		System.out.println("Nhap mau so:");
		mau = sc.nextInt();
        int tam_tu = tu;

        int tam_mau = mau;

        while (tu != mau){

            if (tu > mau) tu = tu - mau;

            else mau = mau - tu;
 }
       tam_tu = tam_tu / tu;
 tam_mau = tam_tu / tu;
        System.out.println(tam_tu+"/"+tam_mau);
	  } 
}

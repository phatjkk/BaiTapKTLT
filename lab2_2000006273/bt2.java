import java.util.Scanner;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap dai rong hinh vuong:");
		int n = input.nextInt();
		for(int row=1; row<=n;row++){
			for(int col=1;col<=n;col++){
				if(row==1||row==n) System.out.print("*");
				else if(col==1||col==n) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
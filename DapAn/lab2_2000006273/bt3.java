import java.util.Scanner;

public class bt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={0,0,0,0,0,0,0} ;
		int num,chuSo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so doi xung:");
		num = sc.nextInt();
		for(int i = 0; i<7;i++){
			chuSo=num%10;
			num=num/10;
			arr[i] = chuSo;
		}
		if((arr[0]==arr[6])&&(arr[1]==arr[5])&&(arr[2]==arr[4])){
			System.out.println("La so doi xung");
		}
		else{
			System.out.println("Khong la so doi xung");
		}
	}

}
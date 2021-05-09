import java.util.Scanner;

public class bt4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,chuSo;
		String kq="";
		int[]arr={0,0,0,0} ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma 4 so:");
		num = sc.nextInt();
		if(String.valueOf(num).length()==4){
			for(int i = 0; i<4;i++){
				chuSo=num%10;
				num=num/10;
				arr[i] = (chuSo+7)%10;
			}
			for(int i = 0; i<4;i++){
				kq=kq+String.valueOf(arr[i]);
			}
			
			System.out.println(kq);
		}
		else{
			System.out.println("Ban phai nhap 4 chu so!");
		}
	}

}
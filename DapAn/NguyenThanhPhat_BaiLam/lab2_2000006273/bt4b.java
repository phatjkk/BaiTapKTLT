import java.util.Scanner;

public class bt4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,chuSo,tam;
		String kq="";
		int[]arr={0,0,0,0} ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma 4 so:");
		num = sc.nextInt();
		if(String.valueOf(num).length()==4){
			for(int i = 0; i<4;i++){
				chuSo=num%10;
				num=num/10;
				arr[i] = chuSo;
			}
			tam = arr[2];
			arr[2]=arr[0];
			arr[0]=tam;
			tam = arr[1];
			arr[1]=arr[3];
			arr[3]=tam;
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
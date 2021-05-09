
public class bt5c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;//nhap n
		int x=2;//nhap x
		double e_x=1;
		for (int i = 1; i <= n; i++) {
			e_x += (TinhLuyThua(x,i))/TinhGiaiThua(i);
		}
		System.out.println(e_x);
	}
	public static int TinhLuyThua(int n,int mu) {
		int luyThua = n;
		for (int i = 1; i < mu; i++) {
			luyThua*=n;
		}
		return luyThua;
	}
	public static double TinhGiaiThua(int n) {
		int giaiThua = 1;
		for (int i = 1; i < n; i++) {
			giaiThua = giaiThua*(n-i);
		}
		return giaiThua*n;
	}
}

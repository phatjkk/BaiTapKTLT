
public class bt5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;//nhap n
		float e=1;
		for (int i = 1; i <= n; i++) {
			e += 1/TinhGiaiThua(i);
		}
		System.out.println(e);
	}
	public static float TinhGiaiThua(int n) {
		int giaiThua = 1;
		for (int i = 1; i < n; i++) {
			giaiThua = giaiThua*(n-i);
		}
		return giaiThua*n;
	}
}

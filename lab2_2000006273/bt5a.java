public class bt5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;//nhap n
		int giaiThua = 1;
		for (int i = 1; i < n; i++) {
			giaiThua = giaiThua*(n-i);
		}
		giaiThua = giaiThua*n;
		System.out.println(giaiThua);
	}

}

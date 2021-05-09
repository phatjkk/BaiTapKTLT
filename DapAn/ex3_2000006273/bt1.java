class SanPham {
	private String ten = "";
	private float gia;
	private float tiLeGiam;
	float TinhThueNhap() {
		return (float)0.01*gia;
	}
	void output() {
		System.out.println("Ten:"+ten); 
		System.out.println("Don gia:"+gia); 
		System.out.println("Ti le giam gia:"+tiLeGiam); 
		System.out.println("Thue nhap:"+TinhThueNhap()); 
	}
}

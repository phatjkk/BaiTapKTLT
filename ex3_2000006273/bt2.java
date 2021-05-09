class HinhVuong {
	private float dai;
	private float rong;
	float TinhChuVi() {
		return (dai+rong)*2;
	}
	float TinhDienTich() {
		return dai*rong;
	}
	void output() {
		System.out.println("Chieu rong:"+rong); 
		System.out.println("Chieu dai:"+dai); 
		System.out.println("Chu Vi:"+TinhChuVi()); 
		System.out.println("Dien Tich:"+TinhDienTich()); 
	}
}
class HinhTron {
	private float r;
	float TinhChuVi() {
		return (float)3.14*r*2;
	}
	float TinhDienTich() {
		return (float)3.14*r*r;
	}
	void output() {
		System.out.println("Ban kin:"+r); 
		System.out.println("Chu Vi:"+TinhChuVi()); 
		System.out.println("Dien Tich:"+TinhDienTich()); 
	}
}
class HinhChuNhat {
	private float doDaiCanh;
	float TinhChuVi() {
		return doDaiCanh*4;
	}
	float TinhDienTich() {
		return doDaiCanh*doDaiCanh;
	}
	void output() {
		System.out.println("Chieu dai canh:"+doDaiCanh); 
		System.out.println("Chu Vi:"+TinhChuVi()); 
		System.out.println("Dien Tich:"+TinhDienTich()); 
	}
}
class TamGiac {
	private float a,b,c;
	float TinhChuVi() {
		return a+b+c;
	}
	float TinhDienTich() {
		float nuaChuVi = (float)(a+b+c)/2;
		return (float)Math.sqrt(nuaChuVi*(nuaChuVi-a)*(nuaChuVi-b)*(nuaChuVi-c));
	}
	void output() {
		System.out.println("Chieu dai canh a:"+a); 
		System.out.println("Chieu dai canh b:"+b); 
		System.out.println("Chieu dai canh c:"+c); 
		System.out.println("Chu Vi:"+TinhChuVi()); 
		System.out.println("Dien Tich:"+TinhDienTich()); 
	}
}

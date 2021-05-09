class Date{
	int ngay,thang,nam;
	int[] arr_Month = {30,28,31,30,31,30,31,31,30,31,30,31};
	Date(){
		ngay = 1;
		thang = 1;
		nam = 2020;
	}
	Date(int _ngay){
		if(_ngay <1 || _ngay >30) {
			ngay = 1;
			thang = 1;
			nam = 2020;
		}
		else {
			ngay = _ngay;
			thang = 1;
			nam = 2020;
		}
	}
	Date(int _ngay,int _thang){
		if(_ngay <1 || _ngay >31 || _thang < 1 || _thang > 12) {
			ngay = 1;
			thang = 1;
			nam = 2020;
		}
		else {
			if(_ngay<=arr_Month[_thang]) { // check ngay hop le voi thang hay khong
				ngay = _ngay;
				thang = _thang;
				nam = 2020;
			}
			else {
				ngay = 1;
				thang = 1;
				nam = 2020;
			}
		}
	}
	Date(int _ngay,int _thang,int _nam){
		if(_ngay <1 || _ngay >31 || _thang < 1 || _thang > 12) {
			ngay = 1;
			thang = 1;
			nam = 2020;
		}
		else {
			if(_ngay<=arr_Month[_thang]) { // check ngay hop le voi thang hay khong
				if(_thang == 2) {
					if(_ngay == 29) { // check ngay 29 hop le voi nam nhuan hay khong
						if(CheckNamNhuan(_nam)==true){
							ngay = _ngay;
							thang = _thang;
							nam = _nam;
						}
						else {
							ngay = 1;
							thang = 1;
							nam = 2020;
						}
					}
					else {
						ngay = _ngay;
						thang = _thang;
						nam = _nam;
					}
				}
				else {
					ngay = _ngay;
					thang = _thang;
					nam = _nam;
				}
			}
			else {
				ngay = 1;
				thang = 1;
				nam = 2020;
			}
		}
	}
	boolean CheckNamNhuan(int y) {
		
    	if((y%4==0) && (y%100!=0) || (y%400==0)) {
    		return true;
    	}
    	else {
    		return false;
    	}
}
	int GetNgay() {
		return this.ngay;
	}
	int GetThang() {
		return this.thang;
	}
	int GetNam() {
		return this.nam;
	}
	void SetNgay(int _ngay) {
		this.ngay = _ngay;
	}
	void SetThang(int _thang) {
		this.thang = _thang;
	}
	void SetNam(int _nam) {
		this.nam = _nam;
	}
	void display() {
		System.out.println(this.ngay+"/"+this.thang+"/"+this.nam);
	}
	
}
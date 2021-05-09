class Date{
	int ngay,thang,nam;
	Date(int _ngay,int _thang,int _nam){
		ngay = _ngay;
		thang = _thang;
		nam = _nam;
	}
	int[] arr_Month = {0,30,28,31,30,31,30,31,31,30,31,30,31};
	String NgayTruoc() {
		int ngayTr,thangTr,namTr;
		thangTr = thang;
		if(ngay == 1) {
			if(thang == 1) {
				ngayTr = 31;
				thangTr = 12;
				namTr = nam-1;
			}
			else {
				if(thang == 3) {
					namTr = nam;
					thangTr = thang-1;
					if(CheckNamNhuan(nam)) {
						ngayTr = 29;
					}
					else {
						ngayTr = 28;
					}
					
				}
				else {
					ngayTr = arr_Month[thang]-1;
					thangTr = thang-1;
					namTr = nam;
				}
			}
			
			
		}
		else {
			ngayTr = ngay-1;
			namTr = nam;
		}
		String day = "";
		day = day + (ngayTr<10 ? "0"+ngayTr :ngayTr)+ "/";
		day = day + (thangTr<10 ? "0" + thangTr: thangTr)+ "/";
		day = day + namTr;
		return day;
	}
	String NgaySau() {
		int ngaySa,thangSa,namSa;
		if(ngay == arr_Month[thang]) {
			if(thang == 12) {
				ngaySa = 1;
				thangSa = 1;
				namSa = nam+1;
			}
			else {
				if(thang == 2 && ngay == 28) {
					namSa = nam;
					
					if(CheckNamNhuan(nam)) {
						ngaySa = 29;
						thangSa = thang;
						namSa = nam;
					}
					else {
						ngaySa = 1;
						thangSa = thang+1;
						namSa = nam;
					}
					
				}
				else{
					ngaySa = 1;
					thangSa = thang+1;
					namSa = nam;
				}
				
			}

		}
		else {
			ngaySa = ngay+1;
			thangSa = thang;
			namSa = nam;
		}
		String day = "";
		day = day + (ngaySa<10 ? "0"+ ngaySa : ngaySa )+ "/";
		day = day + (thangSa<10 ? "0"+ thangSa : thangSa)+ "/";
		day = day + namSa;
		return day;
	}
	boolean CheckNamNhuan(int y) {
		
	    	if((y%4==0) && (y%100!=0) || (y%400==0)) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	}
}


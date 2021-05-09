public class lab5 {
	public static void main (String[] args ) {
		Time A = new Time(22,30,50);
		A.incrementSecond(-55);
		A.outTime();
	}
}
class Time {
	private int hour;
	private int min;
	private int sec;
	public Time(){
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}
	public Time(int _hour,int _min){
		this.hour = _hour;
		this.min = _min;
		this.sec = 0;
	}
	public Time(int _hour,int _min,int _sec){
		this.hour = _hour;
		this.min = _min;
		this.sec = _sec;
	}
	public int getHour(){
		return this.hour;
	}
	public void setHour(int _hour){
		this.hour = _hour;
	}
	public int getMin(){
		return this.min;
	}
	public void setMin(int _min){
		this.min = _min;
	}
	public int getSec(){
		return this.sec;
	}
	public void setSec(int _sec){
		this.sec = _sec;
	}
	public void incrementHour(int _hour){
		this.hour = (this.hour+_hour)%24;
		if(this.hour<0){
			this.hour = this.hour+24;
		}
	}
	public void incrementMinute(int _min){
		while(_min>= 60){
			_min = _min - 60;
			incrementHour(1);
		}
		//Xu ly du lieu am
		while(_min <= -60){
			_min = _min + 60;
			incrementHour(-1);
		}
		this.min += _min;
		if(this.min<0) {
			incrementHour(-1);
			this.min += 60;
		}

		if(this.min>= 60){
			this.min = this.min - 60;
			incrementHour(1);
		}
	}
	public void incrementSecond(int _sec) {
		
		while(_sec>= 60){
			_sec = _sec - 60;
			incrementMinute(1);
		}
		//Xu ly du lieu am
		while(_sec <= -60){
			_sec = _sec + 60;
			incrementMinute(-1);
		}
		
		this.sec += _sec;
		if(this.sec<0) {
			incrementMinute(-1);
			this.sec +=60; 
		}
		if(this.sec>= 60){
			this.sec = this.sec - 60;
			incrementMinute(1);
		}
	}
	public void outTime() {
		String fullTime = "";
		fullTime = fullTime + (this.hour<10 ? "0"+this.hour: this.hour)+":";
		fullTime = fullTime + (this.min<10 ? "0"+ this.min : this.min)+ ":";
		fullTime = fullTime + (this.sec<10 ? "0"+ this.sec : this.sec);
		System.out.println(fullTime);
	}

}
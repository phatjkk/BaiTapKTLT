class IntegerSet{
	boolean[] soNguyen ;
	IntegerSet(){
		soNguyen = new boolean[101];
		for(int i = 0; i<=100;i++){
			soNguyen[i] = false;
		}
	}
	void union(IntegerSet set){
		for(int i = 0; i<=100;i++){
			this.soNguyen[i]=(set.soNguyen[i] || this.soNguyen[i]);
		}
	}
	void intersection(IntegerSet set){
		for(int i = 0; i<=100;i++){
			this.soNguyen[i]=(set.soNguyen[i] && this.soNguyen[i]);
		}
	}
	void insertElement(int e) {
		this.soNguyen[e] = true;
	}
	void deleteElement(int e) {
		this.soNguyen[e] = false;
	}
	boolean isEqual(IntegerSet set) {
		for(int i = 0; i<=100;i++){
			if(set.soNguyen[i]!=this.soNguyen[i]) {
				return false;
			}
		}
		return true;
	}
	void display() {
		for(int i = 0; i<=100;i++){
			System.out.print(this.soNguyen[i]+ " ");
		}
	}
}
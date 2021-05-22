
class Point{
	
	private double x,y;
	Point(double dx,double dy){
		x=dx;
		y=dy;
	}
	
	boolean equals(Point A){
		if((A.x == x) && (A.y == y)){
			return true;
		}
		else{
			return false;
		}
	}
	void translate(double dx,double dy){
		x+=(dx-x);
		y+=(dy-y);
	}
	void rotate(double theta){
		theta = Math.toRadians(theta);
		x = x*Math.sin(theta) - y*Math.cos(theta);
		y = x*Math.sin(theta) + y*Math.cos(theta);
	}
	double distance(Point A){
		return Math.sqrt((A.x-x)*(A.x-x)+(A.y-y)*(A.y-y));
	}
	double getX(){
		return x;
	}
	double getY(){
		return y;
	}
	void setX(double dx){
		 x=dx;
	}
	void setY(double dy){
		y = dy;
	}
	
}
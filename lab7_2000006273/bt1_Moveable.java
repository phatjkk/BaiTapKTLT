interface Moveable{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}
class MoveablePoint implements Moveable{
	private int x,y,xSpeed,ySpeed;
	MoveablePoint(int _x,int _y, int _xSpeed,int _ySpeed){
		this.x = _x;
		this.y = _y;
		this.xSpeed = _xSpeed;
		this.ySpeed = _ySpeed;
	}
	public String toString() {
		return"MoveablePoint[x = "+this.x+",y = "+this.y+", xSpeed = "+this.xSpeed+", ySpeed = "+this.ySpeed+"]";
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.y += this.ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.y -= this.ySpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		this.x += this.xSpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.x -= this.xSpeed;
	}
	
}
class MoveableCircle implements Moveable{
	private int radius;
	private MoveablePoint center;
	MoveableCircle(MoveablePoint _point,int _radius){
		this.radius = _radius;
		this.center = _point;
	}
	//getter setter
	int getRadius() {
		return this.radius;
	}
	void setRadius(int _radius) {
		this.radius = _radius;
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.center.moveUp();
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.center.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		this.center.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.center.moveRight();
	}
	
	
}
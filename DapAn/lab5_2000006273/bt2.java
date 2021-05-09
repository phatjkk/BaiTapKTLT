class Shape {
	protected String color;
	protected boolean filled;
	Shape(){
		this.color = "red";
		this.filled = true;
	}
	Shape(String _color,boolean _filled){
		this.filled = _filled;
		this.color = _color;
	}
	String getColor(){
		return this.color;
	}
	void SetColor(String _color){
		this.color = _color;
	}
	boolean isFilled(){
		return filled;
	}
	void setFilled(boolean _filled){
		this.filled = _filled;
	}
	public String toString(){
		return "Shape[color="+this.color+",filled="+this.filled+"]";
	}
}
class Circle extends Shape{
	protected double radius;
	Circle(){
		this.radius = 1.0;
	}
	Circle(double _radius){
		this.radius = _radius;
	}
	Circle(double _radius, String _color, boolean _filled){
		this.radius = _radius;
		this.color = _color;
		this.filled = _filled;
	}
	double getRadius(){
		return this.radius;
	}
	void setRadius(double _radius){
		this.radius = _radius;
	}
	double getArea(){
		return this.radius*this.radius*3.14;
	}
	double getPerimeter(){
		return 2*this.radius*3.14;
	}
	public String toString(){
		return "Circle[Shape[color="+this.color+",filled="+this.filled+"],radius="+this.radius+"]";
	}
}
class Rectangle extends Shape{
	protected double width;
	protected double length;
	Rectangle(){
		this.width = 1.0;
		this.length = 1.0;
	}
	Rectangle(double _width,double _lenght){
		this.width = _width;
		this.length = _lenght;
	}
	Rectangle(double _width,double _lenght, String _color, boolean _filled){
		this.width = _width;
		this.length = _lenght;
		this.color = _color;
		this.filled = _filled;
	}
	double getWidth(){
		return this.width;
	}
	void setWidth(double _width){
		this.width = _width;
	}
	double getLenght(){
		return this.length;
	}
	void setLength(double _length){
		this.length = _length;
	}
	double getArea(){
		return this.length*this.width;
	}
	double getPerimeter(){
		return 2*(this.length+this.width);
	}
	public String toString(){
		return "Rectangle[Shape[color="+this.color+",filled="+this.filled+"],width="+this.width+",length="+this.length+"]";
	}
}
class Square extends Rectangle{
	Square(){
		this.width = 1.0;
		this.length = 1.0;
	}
	Square(double _size){
		this.width = _size;
		this.length = _size;
	}
	Square(double _size, String _color, boolean _filled){
		this.width = _size;
		this.length = _size;
		this.color = _color;
		this.filled = _filled;
	}
	double getSize(){
		return this.width;
	}
	void setSize(double _size){
		this.width = _size;
		this.length= _size;
	}
	double getArea(){
		return this.length*this.width;
	}
	double getPerimeter(){
		return 4*(this.width);
	}
	public String toString(){
		return "Square[Rectangle[Shape[color="+this.color+",filled="+this.filled+"],width="+this.width+",length="+this.length+"]]";
	}
}
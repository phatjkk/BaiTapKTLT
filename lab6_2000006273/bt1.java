
abstract class Shape{
	protected String color;
	protected boolean filled;
	Shape(){
		this.color = "";
		this.filled = false; 
	}
	Shape(String _color, boolean _filled){
		this.color = _color;
		this.filled = _filled; 
	}
	String getColor() {
		return this.color;
	}
	void setColor(String _color) {
		this.color = _color;
	}
	void setFilled(boolean _filled) {
		this.filled = _filled;
	}
	boolean isFilled() {
		return this.filled;
	}
	abstract double getArea();
	abstract double getPerimeter();
	public String toString() {
		return "Shape[color="+this.color+",filled="+this.filled+"]";
	}
}

class Circle extends Shape{
	private double radius;
	private double pi = 3.14;
	Circle(){
		this.radius = 1;
	}
	Circle(double _radius){
		this.radius = _radius;
	}
	Circle(double _radius, String _color, boolean _filled){
		this.radius = _radius;
		this.color = _color;
		this.filled = _filled;
	}
	double getRadius() {
		return this.radius;
	}
	void setRadius(double _radius) {
		this.radius = _radius;
	}
	@Override
	double getArea() {
		return pi*this.radius*this.radius;
	}

	@Override
	double getPerimeter() {
		return 2*pi*this.radius;
	}

	@Override
	public String toString() {
		return "Circle[color="+this.color+",filled="+this.filled+",radius="+this.radius+"]";
	}
}
class Rectangle extends Shape{
	protected double length;
	protected double width;
	Rectangle(){
		this.length = 1;
		this.width = 1;
	}
	Rectangle(double _width,double _length){
		this.length = _length;
		this.width = _width;
	}
	Rectangle(double _width,double _length,String _color, boolean _filled){
		this.length = _length;
		this.width = _width;
		this.color = _color;
		this.filled = _filled;
	}
	double getWidth() {
		return this.width;
	}
	void setWidth(double _width){
		this.width = _width;
	}
	double getLength() {
		return this.length;
	}
	void setLength(double _length){
		this.length = _length;
	}
	@Override
	double getArea() {
		return this.length*this.width;
	}

	@Override
	double getPerimeter() {
		return (this.length+this.width)*2;
	}
	@Override
	public String toString() {
		return "Rectangle[color="+this.color+",filled="+this.filled+",length="+this.length+",width="+this.width+"]";
	}
}
class Square extends Rectangle{
	Square(){
		this.width = 1;
		this.length = 1;
	}
	Square(double _side){
		this.width = _side;
		this.length = _side;
	}
	Square(double _side, String _color, boolean _filled){
		this.width = _side;
		this.length = _side;
		this.color = _color;
		this.filled = _filled;
	}
	double getSide() {
		return this.width;
	}
	void getSide(double _side) {
		this.width = _side;
		this.length = _side;
	}
	@Override
	void setWidth(double _side){
		this.width = _side;
		this.length = _side;
	}
	@Override
	void setLength(double _side){
		this.width = _side;
		this.length = _side;
	}
	
	@Override
	public String toString() {
		return "Square[color="+this.color+",filled="+this.filled+",side="+this.length+"]";
	}
}

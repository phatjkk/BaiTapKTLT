package lab7;

public class bt2_Octagon {

	public static void main(String[] args) {
		// Octagon A
		Octagon  octagonA = new Octagon(5);
		// Octagon B
		Octagon  octagonB = octagonA.clone();
		// Compare
		int result = octagonA.compareTo(octagonB);
		if(result == 0) {
			System.out.println("octagonA == octagonB");
		}
		else if(result == 1){
			System.out.println("octagonA > octagonB");
		}
		else {
			System.out.println("octagonA < octagonB");
		}
	}

}
abstract class GeometricObject{
	private String color;
	private boolean filled;
	java.util.Date dateCreated;
	GeometricObject(){
		this.color = "";
		this.filled = false;
		this.dateCreated = new java.util.Date();
	}
	GeometricObject(String _color, boolean _filled){
		this.color = _color;
		this.filled = _filled;
		this.dateCreated = new java.util.Date();
	}
	String getColor(){
		return this.color;
	}
	void setColor(String _color) {
		this.color = _color;
	}
	boolean isFilled() {
		return this.filled;
	}
	void setFilled(boolean _filled) {
		this.filled = _filled;
	}
	java.util.Date getDateCreated(){
		return this.dateCreated;
	}
	public String toString() {
		return "GeometricObject[color="+this.color+", filled = "+this.filled+", dateCreated = “"+this.dateCreated+"”])";
	}
	abstract double getArea();
	abstract double getPerimeter();
}
class Octagon extends GeometricObject implements Cloneable,Comparable<Octagon>{
	private double side;
	Octagon(){
		this.side = 1;
	}
	Octagon(double _side){
		this.side =_side;
	}
	double getSide(){
		return this.side;
	}
	void setSize(double _side){
		this.side=_side;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (2+4*Math.sqrt(2))*this.side*this.side;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return this.side*8;
	}

	@Override
	public Octagon clone() {
		// TODO Auto-generated method stub
		Octagon clone = new Octagon(this.side);
		return clone;
	}

	@Override
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
		if(this.getArea()==o.getArea()) {
			return 0;
		}
		else {
			if(this.getArea()>o.getArea()) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}

	
}
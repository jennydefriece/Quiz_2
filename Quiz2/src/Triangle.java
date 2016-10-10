public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	

public Triangle() {
	this(1,1,1);
	
}

public Triangle(double side1, double side2, double side3){
	this.side1=side1;
	this.side2=side2;
	this.side3=side3;
	
}
public double accessSide1(){
	return side1;
	
}
public double accessSide2(){
	return side2;
}

public double accesSide3(){
	return side3;
	
	
}

public double getArea(){
	double x=getPerimeter()/2;
	double Area=Math.sqrt(x+(x-side1)*(x-side2)*(x-side3));
	return Area;
	
}
public double getPerimeter(){
	return side1+side2+side3;
	
}
public String toString(){
	return ("Triangle with side lengths " + side1 + ","+ side2 +"," + side3 + "has a perimeter equal to"+ getPerimeter() + "and an area of" + getArea());
	
}



}
package nontestcases;

abstract class Shape {
abstract double calculateArea();
abstract double calculatePerimeter();
}
       
       class Circle extends Shape {
    	   
       private double radius;

       public Circle(double radius) {
             this.radius = radius;
         }
    @Override double
    calculateArea() { return
    Math.PI * radius * radius;
    }
@Override double
calculatePerimeter() {
return 2 * Math.PI * radius;
}
}
class Triangle extends Shape {
private double sideA;
private double sideB;
private double sideC;

public Triangle(double sideA, double sideB,
double sideC) {
this.sideA = sideA;
this.sideB = sideB;
this.sideC = sideC;
}
@Override double calculateArea() {
// Using Heron's formula to calculate the area of a triangle
double s = (sideA + sideB + sideC) / 2; return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
}
@Override double
calculatePerimeter() {
return sideA + sideB + sideC;
}
}

public class abstrakt
{ public static void main(String[] args) {
Circle c = new Circle(12.0);
System.out.println("Aishwarya Shirodkar RBCA22113");
System.out.println("Circle Area: " + c.calculateArea());
System.out.println("Circle Perimeter: " + c.calculatePerimeter());

Triangle triangle = new Triangle(2.0, 2.0, 2.0);
System.out.println("Triangle Area: " + triangle.calculateArea());
System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
}
}
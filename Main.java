package Shape;

import Shape.Square;
import Shape.Cube;
import Shape.triangle;
//import Shape.Area;
import Shape.Sphere;
import Shape.Rectangle;

public class Main {

	public static void main(String[] args) {
		Square s=new Square();
		Rectangle R=new Rectangle();
		Cube C=new Cube();
		Sphere SP=new Sphere();
		triangle T=new triangle();
		s.Sarea(4);
		R.rarea(3,4);
		C.carea(3);
		SP.sparea(4);
		T.getdata1(2,4);
		System.out.println("Area of triangle:"+T.calculate());
		//doSomething(T);
		
		System.out.println("Area of Square:"+s.calculate2());
		//doSomething(s);
		
		System.out.println("Area of Rectangle:"+R.calculate3());
		//doSomething(R);
	
		System.out.println("Area of Cube:"+C.calculate4());
		//doSomething(C);
		
		System.out.println("Area of Sphere:"+SP.calculate5());
		//doSomething(SP);
		
		
		
		

	}
	

}

package code6015_space;

public class Code6015Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area1, area2;
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		rect1.length = 15;
		rect1.breadth = 10;
		
	area1 = rect1.length * rect1.breadth;
	
	rect2.getdata(30, 20);
	
	area2 = rect2.rectArea();
	
	System.out.println("Area1 = "+ area1);
	System.out.println("Area2 = "+ area2);
	
	
		
		
		
		float a = MathOperation.mul(4.0f, 5.0f);
		float b = MathOperation.divide(a, 2.0f);
		
  System.out.println("b="+ b);
	}

}

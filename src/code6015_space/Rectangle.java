package code6015_space;

public class Rectangle {
	
	int length ,breadth;
	
	void getdata(int x, int y)
	{
		length = x;
		breadth = y;
	
	}
	
	int rectArea()
	{
		int area = length * breadth;
		return(area);
	}

}

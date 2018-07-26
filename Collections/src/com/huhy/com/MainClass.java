package com.huhy.com;

class Point<T>{
	private T x;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	private T y;
	
}
public class MainClass {
public static void main(String[] args) {
	Point<Float> point1= new Point<Float>();
	point1.setX(10f);
	point1.setY(9.8f);
	
	System.out.println(point1.getX()+" "+point1.getY());
	
  Point<Integer> point4 = new Point<Integer>();
  		point4.setX(10);
  		point4.setY(8);
  		
  		double d = (double)point4.getX();
  		
  		System.out.println(point4.getX()+" "+point4.getY());

}
}


public class CircleArea {
	public static void main(String[] args) {
		double radius = 13;
		System.out.println(area(radius));
		
	}
	
	public static double area(double radius) {
		double area;
		area = 2*Math.PI*Math.pow(radius, 2);
		return area;
	}
}

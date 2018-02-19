
public class CircleArea {
	public static void main(String[] args) {
		double radius = 13;
		System.out.println(area(radius));
		
		System.out.println(area(radius)/2);
	}
	
	public static double area(double radius) {
		double area;
		area = 2*Math.PI*Math.pow(radius, 2);
		return area;
	}
}

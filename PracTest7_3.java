
public class PracTest7_3 {

	public static void main(String[] args) {
		

		Circle c1 = new Circle(5);
		System.out.println("area: " + c1.area());
		System.out.println("round: " + c1.round());
	}

}

class Circle{
	private int radius;
	
	public Circle(int R) {
		this.radius = R;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int R) {
		this.radius = R;
	}
	
	
	public double area() {
		return 3.14 * getRadius() * getRadius();
	}
	
	public double round() {
		return 3.14 * getRadius() * 2;
	}
}
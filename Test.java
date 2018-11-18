package homework;
public class Test {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setLength(5.4f);
		rectangle1.setWidth(2.3f);
		System.out.println("长方形1:(5.4,2.3)");
		rectangle1.circum(rectangle1.getLength(), rectangle1.getWidth());
		rectangle1.area(rectangle1.getLength(), rectangle1.getWidth());
		System.out.println("------------");
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setLength(88);
		rectangle2.setWidth(55);
		System.out.println("长方形2:(88,55)");
		rectangle2.circum(rectangle2.getLength(), rectangle2.getWidth());
		rectangle2.area(rectangle2.getLength(), rectangle2.getWidth());
	}	
}

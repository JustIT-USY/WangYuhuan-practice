package homework;
class Rectangle {
	private float length; 
	private float width;
	public float getLength() {
		return length;
	}
	public void setLength(float a) {
		length = a;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float b) {
		width = b;
	}
	public float circum(float a, float b) {
		System.out.println("周长：" + 2 * (a + b));
		return 2 * (a + b);
	}
	public float area(float a, float b) {
		System.out.println("面积：" + a * b);
		return a * b;
	}
}

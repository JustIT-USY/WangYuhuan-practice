package homework;
class Phone {
	String brand;
	String colour;
	int price;
	public void call(String a, String b) {
		System.out.println(a + "用手机(" + brand + "," + colour + "," + price + ")给" + b + "打电话");
		System.out.println("拨号-------接通-------通话:");
	}
	public void answer(String a, String b) {
		System.out.println(a + "用手机(" + brand + "," + colour + "," + price + ")接到" + b + "打来的电话");
		System.out.println("接通-------通话:");
	}
	public void hangup(String a, String b) {
		System.out.println(a + "挂断了" + b + "的电话");
		System.out.println("通话结束");
	}
	public void sentMessage(String a, String b, String message) {
		System.out.println(a + "给" + b + "发信息");
		System.out.println("内容为：" + message);
		System.out.println("发送成功！");
	}
}

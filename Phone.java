package homework;
class Phone {
	String brand;
	String colour;
	int price;
	public void call(String a, String b) {
		System.out.println(a + "���ֻ�(" + brand + "," + colour + "," + price + ")��" + b + "��绰");
		System.out.println("����-------��ͨ-------ͨ��:");
	}
	public void answer(String a, String b) {
		System.out.println(a + "���ֻ�(" + brand + "," + colour + "," + price + ")�ӵ�" + b + "�����ĵ绰");
		System.out.println("��ͨ-------ͨ��:");
	}
	public void hangup(String a, String b) {
		System.out.println(a + "�Ҷ���" + b + "�ĵ绰");
		System.out.println("ͨ������");
	}
	public void sentMessage(String a, String b, String message) {
		System.out.println(a + "��" + b + "����Ϣ");
		System.out.println("����Ϊ��" + message);
		System.out.println("���ͳɹ���");
	}
}

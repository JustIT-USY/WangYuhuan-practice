package homework;
public class AcallB {
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();		
		a.name = "a";a.age = 18;a.sex = "��";
		b.name = "b";b.age = 18;b.sex = "Ů";
		Phone aPhone = new Phone();
		Phone bPhone = new Phone();
		aPhone.brand = "��Ϊ";aPhone.colour = "��ɫ";aPhone.price = 6999;
		bPhone.brand = "Iphone";bPhone.colour = "��ɫ";bPhone.price = 7999;
		aPhone.call(a.name, b.name);
		bPhone.answer(b.name, a.name);
		a.introduce();
		b.introduce();
		aPhone.hangup(a.name, b.name);		
	}	
}

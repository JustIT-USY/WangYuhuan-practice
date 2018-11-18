package homework;
public class AcallB {
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();		
		a.name = "a";a.age = 18;a.sex = "男";
		b.name = "b";b.age = 18;b.sex = "女";
		Phone aPhone = new Phone();
		Phone bPhone = new Phone();
		aPhone.brand = "华为";aPhone.colour = "黑色";aPhone.price = 6999;
		bPhone.brand = "Iphone";bPhone.colour = "白色";bPhone.price = 7999;
		aPhone.call(a.name, b.name);
		bPhone.answer(b.name, a.name);
		a.introduce();
		b.introduce();
		aPhone.hangup(a.name, b.name);		
	}	
}

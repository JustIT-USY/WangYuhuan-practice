package week4;
import java.util.Random;
import java.util.Scanner;
public class Guess {
	public static void main(String[] args) {
		int randomNumber=new Random().nextInt(10);
	    System.out.println("����������ɣ�");
	    System.out.println("----���������µ����֣�----");
		Scanner sc=new Scanner(System.in);
		int enterNumber=sc.nextInt();
		int count=1;
		while(enterNumber!=randomNumber) {
			if(enterNumber>randomNumber) {
				System.out.println("sorry�����´��ˣ�");
			}else {
				System.out.println("sorry������С�ˣ�");
			}
			System.out.println("----���������µ����֣�----");
			enterNumber=sc.nextInt();
			count++;
		}
		System.out.println("��ϲ��������ˣ�");
	    sc.close();
	    System.out.println("��һ������"+count+"��");
	    if(count==1) {
	    	System.out.println("��������");
	    }else if(count<=3) {
	    	System.out.println("������Ŷ��");
	    }else {
	    	System.out.println("����Ŭ����");
	    }
	}
}

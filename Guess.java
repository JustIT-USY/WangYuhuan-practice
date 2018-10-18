package week4;
import java.util.Random;
import java.util.Scanner;
public class Guess {
	public static void main(String[] args) {
		int randomNumber=new Random().nextInt(10);
	    System.out.println("随机数已生成！");
	    System.out.println("----请输入您猜的数字：----");
		Scanner sc=new Scanner(System.in);
		int enterNumber=sc.nextInt();
		int count=1;
		while(enterNumber!=randomNumber) {
			if(enterNumber>randomNumber) {
				System.out.println("sorry，您猜大了！");
			}else {
				System.out.println("sorry，您猜小了！");
			}
			System.out.println("----请输入您猜的数字：----");
			enterNumber=sc.nextInt();
			count++;
		}
		System.out.println("恭喜您，答对了！");
	    sc.close();
	    System.out.println("您一共用了"+count+"次");
	    if(count==1) {
	    	System.out.println("真厉害！");
	    }else if(count<=3) {
	    	System.out.println("还不错哦！");
	    }else {
	    	System.out.println("还需努力！");
	    }
	}
}

package homework;
import java.util.Random;
import java.util.Scanner;
public class Name {
	public static void main(String[] args) {
		String[][] students = new String[][]{
		 {"������","1711610049","n"},{"��С��","1711610050","n"},{"����",  "1711610051","n"},{"����Զ","1711610053","n"},{"������","1711610054","n"},{"����",  "1711610055","n"},
		 {"���Һ�","1711610056","n"},{"�¾���","1711610057","n"},{"���",  "1711610058","n"},{"Ҷ����","1711610060","n"},{"ʯ�]��","1711610061","n"},{"���ľ�","1711610062","n"},
		 {"���Ừ","1711610063","n"},{"���ݷ�","1711610064","n"},{"����",  "1711610065","n"},{"������","1711610066","n"},{"��ǿ��","1711610067","n"},{"��ں�","1711610068","n"},
		 {"������","1711610069","n"},{"���ڷ�","1711610070","n"},{"�Ž�",  "1711610071","n"},{"������","1711610072","n"},{"������","1711610073","n"},{"������","1711610074","n"},
		 {"��Ӣ��","1711610075","n"},{"����Դ","1711610076","n"},{"���β�","1711610077","n"},{"���ϻ�","1711610078","n"},{"����",  "1711610079","n"},{"������","1711610080","n"},
		 {"���ž�","1711610081","n"},{"������","1711610082","n"},{"������","1711610084","n"},{"������","1711610085","n"},{"��¶",  "1711610086","n"},{"������","1711610087","n"},
		 {"��ѩ�","1711610088","n"},{"����׿","1711610089","n"},{"���޾�","1711610090","n"},{"���ַ�","1711610091","n"},{"��˼��","1711610092","n"},{"��ܿٻ","1711610093","n"},
		 {"����ѩ","1711610095","n"},{"����",  "1711610096","n"},{"����",  "1510711031","n"},{"��Ҧ��","1611610046","n"},{"����",  "1710720041","n"}};
		 printStudent(students);
	}
	static void printStudent(String[][] students) {
		int flag = 1,index = 0,count = 0;
		System.out.println("========�������========"+"\n"+"              ��ʼ����                    "+"\n"+"������ y(����) or n(�˳�):");
		while(flag == 1) {
			if(count == students.length) {
				System.out.println("�����ˣ�");
				break;
			}
			Scanner sc = new Scanner(System.in);
			String inputChar = sc.next();
			index = num(students);
			if(inputChar.equals("y")) {				
				System.out.println("ѧ��������"+students[index][0]);
				System.out.println("ѧ��ѧ�ţ�"+students[index][1]);
				students[index][2] = "y";
				count++;
			}else if(inputChar.equals("n")){
				System.out.println("��������");
				sc.close();
				flag = 0;				
		    }			
		}		
	}
	static int num(String[][] students) {
		int index = new Random().nextInt(students.length);
		while(students[index][2].equals("y")) {
			index = new Random().nextInt(students.length);			
		}
		return index;
	}
}

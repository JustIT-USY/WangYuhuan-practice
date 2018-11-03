package homework;
import java.util.Random;
import java.util.Scanner;
public class Name {
	public static void main(String[] args) {
		String[][] students = new String[][]{
		 {"张磊鑫","1711610049","n"},{"罗小龙","1711610050","n"},{"覃瑞",  "1711610051","n"},{"朱清远","1711610053","n"},{"张永桥","1711610054","n"},{"吕钊",  "1711610055","n"},
		 {"龚家浩","1711610056","n"},{"章军豪","1711610057","n"},{"吴昊",  "1711610058","n"},{"叶钰泽","1711610060","n"},{"石鋆涛","1711610061","n"},{"徐文静","1711610062","n"},
		 {"陈玲华","1711610063","n"},{"许逸峰","1711610064","n"},{"张鑫",  "1711610065","n"},{"林智兴","1711610066","n"},{"钟强国","1711610067","n"},{"杨诤歆","1711610068","n"},
		 {"左凌天","1711610069","n"},{"崔腾飞","1711610070","n"},{"张金",  "1711610071","n"},{"刘丁珲","1711610072","n"},{"尤兴鑫","1711610073","n"},{"刘天勇","1711610074","n"},
		 {"贾英哲","1711610075","n"},{"常家源","1711610076","n"},{"张鑫博","1711610077","n"},{"王煜欢","1711610078","n"},{"梁云",  "1711610079","n"},{"符颂妹","1711610080","n"},
		 {"周雅静","1711610081","n"},{"杨生曼","1711610082","n"},{"宇文婷","1711610084","n"},{"计晓雯","1711610085","n"},{"曹露",  "1711610086","n"},{"孟祥玉","1711610087","n"},
		 {"陈雪姣","1711610088","n"},{"狄治卓","1711610089","n"},{"刘艳菊","1711610090","n"},{"贾林菲","1711610091","n"},{"杨思佳","1711610092","n"},{"李芸倩","1711610093","n"},
		 {"杨梦雪","1711610095","n"},{"洪岩",  "1711610096","n"},{"王浩",  "1510711031","n"},{"任姚诚","1611610046","n"},{"陈磊",  "1710720041","n"}};
		 printStudent(students);
	}
	static void printStudent(String[][] students) {
		int flag = 1,index = 0,count = 0;
		System.out.println("========随机点名========"+"\n"+"              开始点名                    "+"\n"+"请输入 y(点名) or n(退出):");
		while(flag == 1) {
			if(count == students.length) {
				System.out.println("点完了！");
				break;
			}
			Scanner sc = new Scanner(System.in);
			String inputChar = sc.next();
			index = num(students);
			if(inputChar.equals("y")) {				
				System.out.println("学生姓名："+students[index][0]);
				System.out.println("学生学号："+students[index][1]);
				students[index][2] = "y";
				count++;
			}else if(inputChar.equals("n")){
				System.out.println("点名结束");
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

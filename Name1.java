package homework;
import java.util.Random;
public class Name1 {
	public static void main(String[] args) {
		String[][] students = new String[][]{ {"ÕÅÀÚöÎ","1711610049"},{"ÂŞĞ¡Áú","1711610050"},{"ñûÈğ",  "1711610051"}};
		String[] student = getStudentName(students);
		System.out.println(student[0]);
		System.out.println(student[1]);
	}
	static String[] getStudentName(String[][] students){
		int index = new Random().nextInt(students.length);
		String name = students[index][0];
		String number = students[index][1];
		String[] student = new String[]{name, number};
		return student;		
	}
}

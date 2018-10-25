package experiment;
import javax.swing.*;
import java.util.Scanner;
public class Score1 {
	public static void main(String[] args) {
		String[] name = new String[5];
		int[][] score = new int[50][3];
		int[] count = new int[3];
		float[] sum = new float[3];
		int i,j,k=0;
		System.out.println("学生             语文        数学       英语");
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 50; i++) {
			String a = sc.next();
			if(a.equals("-1")) {name[i] = a;
				break;
			}
			for(j = 0; j < 3; j++) {
				int b = sc.nextInt();
				if(b==-1) {
					k=1;
					break;
				}
				score[i][j] = b;
				if(score[i][j] < 60) {
					count[j]++;
				}
			}
			if(k==1) {
				break;
			}
		}
		int number = i;
		sc.close();
		for(i = 0; i < number ; i++) {
			for(j = 0; j < 3; j++) {
				sum[j] += score[i][j];
			}
		}
		String a = "学生             语文        数学       英语";
		String b = "不及格人数"+"     "+count[0]+"             "+count[1]+"            "+count[2];
		String c = "及格人数"+"         "+(number-count[0])+"             "+(number-count[1])+"            "+(number-count[2]);
		String d = "平均分"+"         "+(sum[0]/number)+"         "+(sum[1]/number)+"         "+(sum[2]/number);
		JFrame f = new JFrame("成绩分析");
		f.setSize(400,300);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(f, a+"\n"+b+"\n"+c+"\n"+d); 
	}
}

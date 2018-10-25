package experiment;
import java.util.Random;
public class Score {
	public static void main(String[] args) {
		String[] name = new String[5]; name[0] = "小明";name[1] = "二明";name[2] = "三明";name[3] = "四明";name[4] = "五明";
		int[][] score = new int[5][3];
		int[] count = new int[3];
		float[] sum = new float[3];
		int i,j;
		System.out.println("学生             语文        数学       英语");
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				score[i][j] = (new Random().nextInt(100))+1;
				if(score[i][j] < 60) {
					count[j]++;
				}
			}
			System.out.println(name[i]+"\t    "+score[i][0]+"\t    "+score[i][1]+"\t    "+score[i][2]);
		}
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				sum[j] += score[i][j];
			}
		}
		System.out.println("===============================");
		System.out.println("统计             语文        数学       英语");
		System.out.println("不及格人数"+"     "+count[0]+"\t    "+count[1]+"\t    "+count[2]);
		System.out.println("及格人数"+"\t    "+(5-count[0])+"\t    "+(5-count[1])+"\t    "+(5-count[2]));
		System.out.println("平均分"+"\t    "+(sum[0]/5)+"    "+(sum[1]/5)+"    "+(sum[2]/5));
	}
}

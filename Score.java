package experiment;
import java.util.Random;
public class Score {
	public static void main(String[] args) {
		String[] name = new String[5]; name[0] = "С��";name[1] = "����";name[2] = "����";name[3] = "����";name[4] = "����";
		int[][] score = new int[5][3];
		int[] count = new int[3];
		float[] sum = new float[3];
		int i,j;
		System.out.println("ѧ��             ����        ��ѧ       Ӣ��");
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
		System.out.println("ͳ��             ����        ��ѧ       Ӣ��");
		System.out.println("����������"+"     "+count[0]+"\t    "+count[1]+"\t    "+count[2]);
		System.out.println("��������"+"\t    "+(5-count[0])+"\t    "+(5-count[1])+"\t    "+(5-count[2]));
		System.out.println("ƽ����"+"\t    "+(sum[0]/5)+"    "+(sum[1]/5)+"    "+(sum[2]/5));
	}
}

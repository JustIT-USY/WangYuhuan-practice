package week4_2;

import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
		System.out.println("������ѧ����������1-100��");
		Scanner sc=new Scanner(System.in);
		int grade=sc.nextInt();
		if(grade>=90){
			System.out.println(grade+"��Ӧ�Ŀ��˳ɼ��ǣ�����");
		}else if(grade>=80){
			System.out.println(grade+"��Ӧ�Ŀ��˳ɼ��ǣ�����");
		}else if(grade>=70){
			System.out.println(grade+"��Ӧ�Ŀ��˳ɼ��ǣ�һ��");
		}else if(grade>=60){
			System.out.println(grade+"��Ӧ�Ŀ��˳ɼ��ǣ�����");
		}else{
			System.out.println(grade+"��Ӧ�Ŀ��˳ɼ��ǣ�������");
		}
	}

}

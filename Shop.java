package week4;
public class Shop {
	public static void main(String[] args) {
		String book1Name="�������";
		Long book1Number=9787111444503L;
		String book1Press="��е��ҵ������";
		String book1Author="֣��ε";
		double book1Price=39.00;
		int book1Count=10;
		String book2Name="Java���������̳�";
		Long book2Number=9787115439376L;
		String book2Press="�����ʵ������";
		String book2Author="�������Ա";
		double book2Price=54.00;
		int book2Count=20;
		String book3Name="���ݽṹ";
		Long book3Number=9787302147510L;
		String book3Press="�廪��ѧ������";
		String book3Author="��ε��";
		double book3Price=35.00;
		int book3Count=15;
		String book4Name="�����߼�";
		Long book4Number=9787309069198L;
		String book4Press="������ѧ������";
		String book4Author="�¹���";
		double book4Price=45.00;
		int book4Count=30;
		String book5Name="����ͳ��";
		Long book5Number=9787568104036L;
		String book5Press="����ʦ����ѧ������";
		String book5Author="�׳���";
		double book5Price=29.00;
		int book5Count=0;
		System.out.println("------------------------------------������嵥-----------------------------------");
		System.out.println("        ����                       ���                       ������                       ����               �۸�        �����");
		System.out.println("      "+book1Name+"            "+book1Number+"    "+book1Press+"             "+book1Author+"             "+book1Price+"      "+book1Count);
		System.out.println(book2Name+"    "+book2Number+"    "+book2Press+"             "+book2Author+"      "+book2Price+"      "+book2Count);
		System.out.println("      "+book3Name+"            "+book3Number+"    "+book3Press+"             "+book3Author+"             "+book3Price+"      "+book3Count);
		System.out.println("      "+book4Name+"            "+book4Number+"    "+book4Press+"             "+book4Author+"             "+book4Price+"      "+book4Count);
		System.out.println("      "+book5Name+"            "+book5Number+"    "+book5Press+"      "+book5Author+"             "+book5Price+"       "+book5Count);
		System.out.println("----------------------------------------------------------------------------------");
		int totalCount=book1Count+book2Count+book3Count+book4Count+book5Count;
		double totalMoney=(book1Count*book1Price)+(book2Count*book2Price)+(book3Count*book3Price)+(book4Count*book4Price)+(book5Count*book5Price);
		System.out.println("�鼮�ܿ������"+totalCount);
		System.out.println("����ܽ������"+totalMoney);
	}
}

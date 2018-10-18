package week4;
public class Shop {
	public static void main(String[] args) {
		String book1Name="汇编语言";
		Long book1Number=9787111444503L;
		String book1Press="机械工业出版社";
		String book1Author="郑晓蔚";
		double book1Price=39.00;
		int book1Count=10;
		String book2Name="Java基础案例教程";
		Long book2Number=9787115439376L;
		String book2Press="人民邮电出版社";
		String book2Author="黑马程序员";
		double book2Price=54.00;
		int book2Count=20;
		String book3Name="数据结构";
		Long book3Number=9787302147510L;
		String book3Press="清华大学出版社";
		String book3Author="严蔚敏";
		double book3Price=35.00;
		int book3Count=15;
		String book4Name="数字逻辑";
		Long book4Number=9787309069198L;
		String book4Press="复旦大学出版社";
		String book4Author="陈光梦";
		double book4Price=45.00;
		int book4Count=30;
		String book5Name="概率统计";
		Long book5Number=9787568104036L;
		String book5Press="东北师范大学出版社";
		String book5Author="孔朝莉";
		double book5Price=29.00;
		int book5Count=0;
		System.out.println("------------------------------------书店库存清单-----------------------------------");
		System.out.println("        书名                       书号                       出版社                       作者               价格        库存数");
		System.out.println("      "+book1Name+"            "+book1Number+"    "+book1Press+"             "+book1Author+"             "+book1Price+"      "+book1Count);
		System.out.println(book2Name+"    "+book2Number+"    "+book2Press+"             "+book2Author+"      "+book2Price+"      "+book2Count);
		System.out.println("      "+book3Name+"            "+book3Number+"    "+book3Press+"             "+book3Author+"             "+book3Price+"      "+book3Count);
		System.out.println("      "+book4Name+"            "+book4Number+"    "+book4Press+"             "+book4Author+"             "+book4Price+"      "+book4Count);
		System.out.println("      "+book5Name+"            "+book5Number+"    "+book5Press+"      "+book5Author+"             "+book5Price+"       "+book5Count);
		System.out.println("----------------------------------------------------------------------------------");
		int totalCount=book1Count+book2Count+book3Count+book4Count+book5Count;
		double totalMoney=(book1Count*book1Price)+(book2Count*book2Price)+(book3Count*book3Price)+(book4Count*book4Price)+(book5Count*book5Price);
		System.out.println("书籍总库存数："+totalCount);
		System.out.println("库存总金额数："+totalMoney);
	}
}

package example;
public class Market {//����
	private String marketName;//������
	private Product[] productArr;//���еĲֿ⣬������������Ʒ
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public Product[] getProductArr() {
		return productArr;
	}
	public void setProductArr(Product[] productArr) {
		this.productArr = productArr;
	}
	Product sell(String name) {//������ָ����Ʒ��
		//ѭ�������ֿ���ÿһ����Ʒ
		for (int i = 0; i < productArr.length; i++) {
			//�����Ʒ���ƺ�Ҫ�����Ʒһ��
			if (productArr[i].getProName() == name) {
				return productArr[i];//������Ʒ����
			}
		}
		return null;//ѭ��������û�ҵ���Ʒ������null����û��
	}
}

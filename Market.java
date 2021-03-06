package example;
public class Market {//超市
	private String marketName;//超市名
	private Product[] productArr;//超市的仓库，里面有若干商品
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
	Product sell(String name) {//卖货，指定商品名
		//循环遍历仓库中每一个商品
		for (int i = 0; i < productArr.length; i++) {
			//如果商品名称和要买的商品一致
			if (productArr[i].getProName() == name) {
				return productArr[i];//将该商品返回
			}
		}
		return null;//循环结束后都没找到商品，返回null代表没买到
	}
}

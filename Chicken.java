package experiment;

public class Chicken {
	public static void main(String[] args) {
		int cock, hen, chicken;
		for(cock = 0; cock <= 20; cock++) {
			for(hen = 0; hen <= 33; hen++) {
				chicken = 100 - cock - hen;
				if(cock * 5 + hen * 3 + chicken / 3.0 == 100) {
					System.out.println("cock="+cock+"   hen="+hen+"   chicken="+chicken);
				}
			}
		}
	}
}

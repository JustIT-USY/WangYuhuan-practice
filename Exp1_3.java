package experiment;
public class Exp1_3 {
	public static void main(String[] args) {
		int[] src2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] dest2 = {1, 3, 5, 7, 9};
		System.arraycopy(src2, 7, dest2, 2, 3);
		for(int i : dest2){
			System.out.println(i);
		}	
	}
}

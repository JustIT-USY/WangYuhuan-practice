package experiment;
import java.util.Arrays;
public class Exp1_1 {
	public static void main(String[] args) {
		int[] src1 = {1, 2, 3, 4, 5, 6};
		int[] dest1 = Arrays.copyOf(src1, src1.length);
		for(int i : dest1){
			System.out.println(i);
		}			
	}
}

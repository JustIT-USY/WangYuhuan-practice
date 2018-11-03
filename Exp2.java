package experiment;
import java.util.Arrays;
public class Exp2 {
	public static void main(String[] args) {
		int[] arr = {10, 7, 9, 2, 4, 5, 1, 3, 6, 8};
		Arrays.sort(arr);
		for(int i: arr){
			System.out.println(i);
		}
	}
}

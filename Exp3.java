package experiment;
public class Exp3 {
	public static void main(String[] args) {
		int[] arr = {8, 2, 3, 9, 5, 1};
		for(int i = 0; i < arr.length / 2; i++){
			int t = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = t;
		}
		for(int i: arr){
			System.out.println(i);
		}
	}
}

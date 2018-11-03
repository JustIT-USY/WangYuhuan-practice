package experiment;
public class Exp4 {
	public static void main(String[] args) {
		int[] oldArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
		int count = 0;
		for(int i: oldArr){
			if(i == 0){
				count++;
			}
		}
		int[] newArr = new int[oldArr.length-count];
		for(int i = 0,j = 0; i < oldArr.length; i++){
			if(oldArr[i] != 0){
				newArr[j] = oldArr[i];
				j++;
			}			
		}
		for(int i:newArr){
			System.out.println(i);
		}
	}
}

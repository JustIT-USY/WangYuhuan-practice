package experiment;
import java.util.Random;
public class Exp5 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (new Random().nextInt(100)) + 1;
			System.out.println(arr[i]);
		}		
		System.out.println("���ֵ��"+max(arr)+"\n"+"��Сֵ��"+min(arr)+"\n"+"�ܺͣ�"+sum(arr)+"\n"+"ƽ���֣�"+ever(arr));
	}
	static int max(int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){			
			if(arr[i] > max){
				max = arr[i];
			}			
		}
		return max;
	}
	static int min(int[] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){			
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	static int sum(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];			
		}
		return sum;
	}
	static int ever(int[] arr){
		return sum(arr) / arr.length;
	}
}

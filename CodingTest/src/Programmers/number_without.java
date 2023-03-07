package Programmers;

/*0부터 9까지의 숫자 중 일부가 들어있는 
 * 정수 배열 numbers가 주어집니다. 
 * numbers에서 찾을 수 없는 
 * 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하세요.*/
public class number_without {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] {5,8,4,0,6,7,9};
		int n_sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			n_sum += numbers[i];
		}
		
		// 45 (0~9까지의 합)
		System.out.println("없는 수의 합 : " + (45 - n_sum));
	}

}

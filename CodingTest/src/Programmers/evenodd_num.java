package Programmers;

/*정수가 담긴 리스트 num_list가 주어질 때, 
 * num_list의 원소 중 짝수와 홀수의 개수를 담은 
 * 배열을 return 하세요.*/
public class evenodd_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = new int[] {1,2,3,6,7};
		int[] odd_even = new int[2];
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i]%2 == 0) {
				odd_even[0]++;
			}
			else {
				odd_even[1]++;
			}
		}
		
		System.out.println("짝수 : " + odd_even[0] + ", 홀수 : " + odd_even[1]);
	}

}

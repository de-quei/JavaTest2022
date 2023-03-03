package School_CodingTest;
/*양의 정수 10개를 입력받아 배열에 저장하고
 * 제일 큰 수를 출력하라*/
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 수 : ");
			arr[i] = sc.nextInt();
			if(arr[i] < 0) {
				System.out.print("다시 입력 : ");
				arr[i] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 수 : " + max);
	}

}

package Programmers;
/*중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때
 * 가장 중앙에 위치하는 값을 의미합니다.
 * 정수 배열 array의 중앙값을 return하세요.*/
import java.util.Scanner;
public class Median {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.print("몇 개 입력하실건가요? (정수만 가능) : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		System.out.println("입력종료.");
		
		
		//Bubble sort
		int tmp;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i -1; j++) {
				if(array[j] > array[j+1]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		System.out.println();
		System.out.print("정렬 : ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("중앙값 : " + array[n / 2]);
		
	}

}

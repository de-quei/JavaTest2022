package School_CodingTest;

import java.util.Scanner;
public class SalesVol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		/*2019~2021년 3년 동안의 분기별 판매량을 입력받아
		 * 2차원 배열에 저장한후
		 * 년도별, 분기별 판매량과 연간, 누적 판매량을 출력하는
		 * 프로그램을 작성하시오 */
		
		int[][] arr = new int[3][4]; //분기 별 판매량 저장
		int[] y_sum = new int[3];    //연간판매량
		int sum = 0;
		String[] info = new String[] {"1사분기", "2사분기", "3사분기", "4사분기", "연간판매량", "누적판매량"};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(2019+i + "년도 : ");
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("         ");
		for(int i = 0; i < info.length; i++) {
			System.out.printf("%s ", info[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				y_sum[i] += arr[i][j];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(2019+i + "년도 : ");
			sum += y_sum[i];
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("  %d", arr[i][j]);
			}
			System.out.printf("   %d", y_sum[i]);
			System.out.printf("   %d", sum);
			System.out.println();
		}
		
	}
}
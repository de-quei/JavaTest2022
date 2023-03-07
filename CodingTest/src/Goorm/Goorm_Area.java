package Goorm;

/* 구르미는 하늘을 보면서 구름의 크기를 측정하고 있다. 
 * 구름은 항상 직사각형 모양으로 형성되어 있다. 
 * 구름의 두 변의 크기가 주어졌을 때, 그 크기를 출력하시오.
 * <현대모비스 모의테스트> */
import java.util.Scanner;
public class Goorm_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*첫째 줄에 두 정수가 공백을 두고 주어진다.*/
		int width, height;
		width = sc.nextInt();
		height = sc.nextInt();
		
		System.out.println(width * height);
	}

}

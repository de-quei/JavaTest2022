package Programmers;
/*머쓱이네 옷가게는 10만 원 이상 사면 5%, 
 * 30만 원 이상 사면 10%, 
 * 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 
 * 지불해야 할 금액을 return 하세요.*/
import java.util.Scanner;
public class clothes_discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구입하실 금액을 입력해주세요. : ");
		int price = sc.nextInt();
		
		double sale = 0.0;
		if(price >= 500000) {
	        sale = 0.8;
	    } else if(price >= 300000) {
	        sale = 0.9;
	    } else if(price >= 100000) {
	        sale = 0.95;
	    }
		
		price *= sale;
		System.out.println("지불 금액 : " + price);
	}

}

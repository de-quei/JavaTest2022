package Programmers;
/*머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 
 * 아이스 아메리카노는 한잔에 5,500원입니다. 
 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 
 * 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 
 * 남는 돈을 순서대로 담은 배열을 return하세요*/
public class IceAmericano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int americano = 5500;
		int balance = 12500;       //머쓱이의 돈
		int mussk[] = new int[2];  //아메리카노의 잔 수와 남는 돈의 배열
		
		mussk[0] = balance / americano;
		mussk[1] = balance % americano;
		
		System.out.println("( " + mussk[0] + ", " + mussk[1] + " )");
		
		
	}

}

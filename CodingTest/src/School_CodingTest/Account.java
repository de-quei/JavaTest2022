package School_CodingTest;

import java.util.Scanner;

class Account1{
	String Acc_num;
	int balance;
	Account1(String nextLine){
		this.Acc_num = nextLine;
	}
	void deposit(int d_money) {
		balance += d_money;
	}
	void withdraw(int w_money) {
		if(w_money > this.balance) {
			System.out.println("출금하려는 계좌의 잔액이 부족하여 출금이 불가능합니다.");
		}else {
			this.balance = this.balance - w_money;
		}
	}
	void printResult() {
		System.out.println("계좌번호 " + this.Acc_num + "의 현재 잔액 : " + this.balance +"원");
	}
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Account1[] acc = new Account1[3];
		
		for(int i = 0; i < acc.length; i++) {
			System.out.println("====================");
			System.out.print("계좌번호 입력 : ");
			
			acc[i] = new Account1(sc.next());
			acc[i].printResult();
			
			System.out.println();
			System.out.print("입금할 금액 : ");
			acc[i].deposit(sc.nextInt());
			acc[i].printResult();
			
			System.out.println();
			System.out.print("출금할 금액 : ");   
			acc[i].withdraw(sc.nextInt());
			acc[i].printResult();
		}
	}

}

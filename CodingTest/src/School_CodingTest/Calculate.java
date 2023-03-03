package School_CodingTest;

import java.util.Scanner;

class Calculate1{
	int a;
	int b;
	Calculate1(int n1, int n2){
		a = n1;
		b = n2;
	}
	int Plus() {
		return a + b;
	}
	int Minus() {
		return a - b;
	}
	int Multiply() {
		return a * b;
	}
	double Division() {
		return a / b;
	}
	void printResult() {
		System.out.println("===두 수의 사칙연산 결과===");
		System.out.println(a + " + " + b + " = " + Plus());
		System.out.println(a + " - " + b + " = " + Minus());
		System.out.println(a + " * " + b + " = " + Multiply());
		System.out.println(a + " / " + b + " = " + Division());
	}
}
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int n2 = sc.nextInt();
		
		Calculate1 c1 = new Calculate1(n1, n2);
		c1.printResult();
	}

}

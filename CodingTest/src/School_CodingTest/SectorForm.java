package School_CodingTest;
/*중심각도가 90도인 부채꼴을 위한 클래스를 정의하고,
 * 반지름을 입력받아, 부채꼴을 생성하여
 * 부채꼴의 둘레와 면적을 계산하여 출력하는
 * 프로그램을 작성하시오*/
import java.util.Scanner;

class Sector{
	double PI = 3.14;
	double radius;
	Sector(double r){
		this.radius = r;
	}
	double area() {
		return radius*radius*PI*0.25;
	}
	double circum() {
		return 2*PI*radius*0.25 + 2*radius;
	}
}
public class SectorForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double r;
		
		System.out.print("반지름 입력 : ");
		r = sc.nextDouble();
		
		Sector sec = new Sector(r);
		
		System.out.println("반지름 " + sec.radius + "인 부채꼴의 면적 : " + sec.area() + ", 둘레 : " + sec.circum()) ;
	}

}

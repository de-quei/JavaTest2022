package School_CodingTest;
/*사각형 두 곳의 좌표값을 통해
 * 인스턴스 객체를 생성하고 
 * 좌표값을 출력하고 둘레를 구하며
 * 넓이를 구하는 클래스를 설계하라*/
class Rectangle1{
	int x1;
	int y1;
	int x2;
	int y2;
	int width;   //가로
	int height;  //세로
	
	Rectangle1(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	void showRectangle(){
		System.out.println("사각형의 좌표는 왼쪽 위 (" + x1 + ", " + y1 + ")");
		System.out.println("사각형의 좌표는 오른쪽 아래 (" + x2 + ", " + y2 + ")");
	}
	int getRound(){
		width = x2 - x1;
		height = y2 - y1;
		return 2*width + 2*height;
	}
	int getArea(){
		width = x2 - x1;
		height = y2 - y1;
		return width*height;
	}
}
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle1 t1 = new Rectangle1(1,1,3,3);
		t1.showRectangle();
		
		System.out.println("사각형의 둘레 : " + t1.getRound());
		System.out.println("사각형의 넓이 : " + t1.getArea());
	}

}
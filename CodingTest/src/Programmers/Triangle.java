package Programmers;

/*삼각형의 세 변의 길이가 담긴 배열 sides가 주어집니다. 
 * 세 변으로 삼각형을 만들 수 있다면 1, 
 * 만들 수 없다면 2를 return 하세요.*/
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sides = new int[]{1,3,4};
		int max = 0;
		int sides_sum = 0;
		
		for(int i = 0; i < sides.length; i++) {
			if(max < sides[i]) {
				max = sides[i];
			}
		}
		
		for(int i = 0; i < sides.length; i++) {
			sides_sum += sides[i];
		}
		
		System.out.println("가장 긴 변 : " + max);
		System.out.print("삼각형의 유무 : ");
		if(sides_sum - max <= max) {
			System.out.println("2");
		}
		else {
			System.out.println("1");
		}
	}

}

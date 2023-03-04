package School_CodingTest;
/*학생 수를 입력받아
 * 성적을 처리하시오.*/
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int s_n = sc.nextInt();           //학생 수 변수
		
		int score[][] = new int[s_n][3];  //점수 배열
		int max_s[] = new int[s_n];       //최고점 배열
		int grade[] = new int[s_n];       //평점 배열
		String row[] = new String[]{"순번", "점수1", "점수2", "점수3", "최고점", "평점"};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print("점수 " + (j+1) +" 입력 : ");
				score[i][j] = sc.nextInt();
				
				if(max_s[i] < score[i][j]) {
					max_s[i] = score[i][j];
				}
				switch(max_s[i]/10) {
				case 10, 9:
					grade[i] = 5;
					break;
				case 8:
					grade[i] = 4;
					break;
				case 7:
					grade[i] = 3;
					break;
				case 6:
					grade[i] = 2;
					break;
				default :
					grade[i] = 1;
				}
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		for(int i = 0; i < row.length; i++) {
			System.out.print(row[i] + "\t");
		}
		System.out.println();
		System.out.println("===========================================");
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " \t");
			}
			System.out.print(max_s[i] + "\t");
			System.out.print(grade[i]);
			System.out.println();
		}
		System.out.println("===========================================");
		
	}

}

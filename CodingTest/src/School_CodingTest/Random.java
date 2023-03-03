package School_CodingTest;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] random = new int[4][4];
		
		getRandom(random);
		
	}
	static void getRandom(int random[][]) {
		
		for(int i = 0; i < random.length; i++) {
			for(int j = 0; j < random[i].length; j++) {
				random[i][j] = ((int) Math.random()*10+1);
			}
		}
		
		for(int i = 0; i < random.length; i++) {
			for(int j = 0; j < random[i].length; j++) {
				System.out.print(random[i][j]);
			}
			System.out.println();
		}
	}
	
}

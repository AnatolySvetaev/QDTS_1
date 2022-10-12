package Lesson5;

public class ThreeDirArr {
	public static void main(String[] args) {
		int mass [][][] = new int [4][][];
		int [] m1 = new int[3];
		int [] m2 = new int[6];
		int [] m3 = new int[2];
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}

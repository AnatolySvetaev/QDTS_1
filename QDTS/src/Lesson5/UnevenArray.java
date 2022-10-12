package Lesson5;
// "неровный" двумерный массив
// ! если вместо int указать Integer -> вместо 0-вых значений будут NULL

public class UnevenArray {

	public static void main(String[] args) {
		int mass [][] = new int [3][];		// размерность массива (3 строки, размер каждой не определён
		// задаём размерность строк массива
		int [] m1 = new int[3];				
		int [] m2 = new int[6];
		int [] m3 = new int[2];
		mass[0] = m1;
		mass[1] = m2;
		mass[2] = m3;
		// задаём некоторые значения в ячейки массива
		mass[0][0] = 6;		mass[0][1] = 1;		mass[0][2] = -3; 
		mass[1][0] = 10;	mass[1][1] = -100;	mass[1][2] = 0;		mass[1][5] = 9;
		mass[2][1] = 120;
		
		// циклом внутри цикла выводим на печать все элементы неровного массива
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");		// используем табуляцию для читаемости
			}
			System.out.print("\n");		// используем перенос строки для отделения строк массива
		}
	}
}

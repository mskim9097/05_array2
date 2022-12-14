package edu.kh.array2.practice;

public class Array2Practice {
	
	public void practice1() {
		
		String[][]arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);				
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		
		int num = 1;
		int[][]arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		
		int num = 16;
		int[][]arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}

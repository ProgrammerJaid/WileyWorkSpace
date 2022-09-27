package com.arrays;

public class AntiClockwiseRotationArray {

	static void rotateMatrix(int N, int mat[][], int ar[][]) {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				ar[i][j] = mat[j][N - 1 - i];
		}
	}

	static void displayMatrix(int N, int mat[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + mat[i][j]);

			System.out.print("\n");
		}
		System.out.print("\n");
	}

}

package com.arrays;

public class TestClass {

	public static void main(String[] args) {

		int N = 3;

		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ar[][] = new int[N][N];

		AntiClockwiseRotationArray.rotateMatrix(N, mat, ar);

		AntiClockwiseRotationArray.displayMatrix(N, ar);
	}
}

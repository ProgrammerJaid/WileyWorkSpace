package com.recursion;

import java.util.ArrayList;

public class NRook {

	public void saveboard(char[][] board, ArrayList<ArrayList<String>> allBoards) {
		String row = "";
		ArrayList<String> temp = new ArrayList<>();

		for (int i = 0; i < board.length; i++) {
			row = "";
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'R')
					row += 'R';
				else
					row += '.';
			}
			temp.add(row);
		}
		allBoards.add(temp);
	}

	public boolean issafe(char[][] board, int row, int col) {
		for (int i = 0; i < board.length; i++) {
			if (board[row][i] == 'R')
				return false;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == 'R')
				return false;
		}
		return true;
	}

	public void helper(char[][] board, ArrayList<ArrayList<String>> allBoards, int col) {
		if (col == board.length) {
			saveboard(board, allBoards);
			return;
		}

		for (int row = 0; row < board.length; row++) {
			if (issafe(board, row, col) == true) {
				board[row][col] = 'R';
				helper(board, allBoards, col + 1);
				board[row][col] = '.';
			}
		}
	}

	public static void main(String args[]) {
		ArrayList<ArrayList<String>> allBoards = new ArrayList<>();
		char[][] board = new char[6][6];
		NRook ob = new NRook();
		ob.helper(board, allBoards, 0);
		// System.out.println(allBoards.size());
		System.out.println(allBoards);

	}
}

package com.stack_and_queue;

public class IslandCount {
	char[][] grid;
	int m, n;

	public int numIslands(char[][] grid) {
		this.grid = grid;
		m = grid.length;
		n = grid[0].length;

		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					count++;
					f(i, j);
				}
			}
		}
		return count;
	}

	private void f(int r, int c) {
		if (r < 0 || c < 0 || r == m || c == n)
			return;
		if (grid[r][c] == '0')
			return;
		grid[r][c] = '0';
		f(r - 1, c);
		f(r, c - 1);
		f(r + 1, c);
		f(r, c + 1);
		return;
	}

	public static void main(String[] args) {
		char[][] islands = {{'1','1','0','0','0'},
					{'0','1','0','0','1'},
					{'1','0','0','1','1'},
					{'0','0','0','0','0'},
					{'1','0','1','0','1'}};
		
		IslandCount id = new IslandCount();
		System.out.println(id.numIslands(islands));
	}
}

package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimilarCharacters {

	public void checkSimilarCharacter() {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<String, Integer>();
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			m.putIfAbsent(s.charAt(i) + "", (int) i);
		}
		if (s.length() == m.size()) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		sc.close();
	}
}

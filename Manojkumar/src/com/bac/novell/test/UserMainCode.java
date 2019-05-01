package com.bac.novell.test;

public class UserMainCode {

	public static void main(String[] args) {
		UserMainCode user = new UserMainCode();
		System.out.println(user.numWays(2, 2));
	}

	public String numWays(int input1, int input2) {
		if (input1 == 1 && input2 == 1) {
			return "1";
		} else {
			return numberPaths(input1, input2);
		}
	}

	public String numberPaths(int input1, int input2) {
		int[][] count = new int[input1][input2];
		String output1="";
		for (int i = 0; i < input1; i++) {
			count[i][0] = 1;
		}

		for (int i = 0; i < input2; i++) {
			count[0][i] = 1;
		}
		for (int i = 1; i < input1; i++) {
			for (int j = 1; j < input2; j++) {

				count[i][j] = count[i - 1][j] + count[i][j - 1];
				System.out.println(count[i - 1][j] + count[i][j - 1]);
			}
		}
		Integer.toString(count[input1 - 1][input2 - 1]);
        output1 = Integer.toString(count[input1 - 1][input2 - 1]);
		return output1;
	}

}

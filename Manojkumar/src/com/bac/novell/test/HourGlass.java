package com.bac.novell.test;

import java.util.Arrays;
import java.util.Scanner;

public class HourGlass {
	public static void main(String arg[]) {
		//calculate();
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter the Deails");
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int sum = 0, max = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
				sum += arr[i + 1][j + 1];
				sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (sum > max) {
					max = sum;
				}
			}
			
		}
		System.out.println(max);
		
	}

	public static void calculate() {
		int[] testScores = { 100 ,90, 80, 75, 90, 88, 84, 88, 78, 67};
		Arrays.sort(testScores);
		int count = 0;
		System.out.println("testScores " + testScores.length);
		int leng =testScores.length - 1;
		for (int i = leng; i >= 0; i--) {
			System.out.println("testScores[i]" + testScores[i]);
			count++;
			System.out.println("count" + count);
			if (count == 2) {
				break;
			}

		}
	}
}

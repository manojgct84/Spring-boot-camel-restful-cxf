package com.bac.novell.test;

public class LeastNumber {
	public static String output1;
	public static void main(String[] args) {
		LeastNumber ln = new LeastNumber();
		min_num("19", 1);
	}
	public static void min_num(String input1,int input2){
        output1 = input1;
		while (input2 > 0 && output1.length() > 0) {
			int firstNumber = getDecreasingNumber(output1);
			if (firstNumber >= 0) {
				output1 = removeDigit(output1, firstNumber);
			} else {
				output1 = removeDigit(output1, output1.length() - 1);
			}
			--input2;
		}
      System.out.println(output1);
      //return output1;
      }
  
  public static int getDecreasingNumber(String number) {
		for (int i = 0; i < number.length() - 1; ++i) {
			int curDigit = number.charAt(i) - '0';
			int nextDigit = number.charAt(i + 1) - '0';
			if (curDigit > nextDigit) {
				return i;
			}
		}

		return -1;
	}

	public static String removeDigit(String number, int digitIndex) {
		String result = "";
		if (digitIndex > 0) {
			result = number.substring(0, digitIndex);
		}
		if (digitIndex < number.length() - 1) {
			result += number.substring(digitIndex + 1);
		}
		return result;
	}
}

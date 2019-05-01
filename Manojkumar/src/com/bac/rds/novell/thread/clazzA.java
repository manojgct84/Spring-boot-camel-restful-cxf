package com.bac.rds.novell.thread;

class clazzB {

	private void m() {
	}
}

public class clazzA extends clazzB {

	public void m() {
	}

	public static void main(String args[]) {
		clazzB b = new clazzA();
		b.m();
		clazzB b1 = new clazzB();

	}
}

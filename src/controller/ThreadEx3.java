package controller;

public class ThreadEx3 extends Thread {
	private int[][] m;
	private int l1, l2, l3;

	public ThreadEx3(int[][] m, int l1, int l2, int l3) {
		this.m = m;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		l1 = 0;
		l2 = 0;
		l3 = 0;

	}

	@Override
	public void run() {
		line1();
		line2();
		line3();
	}

	private void line1() {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {

				if (i == 0) {
					l1 += m[i][j];

				}
			}
		}
		System.out.println("A soma da linha 1 é igual a: " + l1);
	}

	private void line2() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {

				if (i == 1) {
					l2 += m[i][j];

				}
			}
		}
		System.out.println("A soma da linha 2 é igual a: " + l2);
	}

	private void line3() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {

				if (i == 2) {
					l3 += m[i][j];

				}
			}
		}
		System.out.println("A soma da linha 3 é igual a: " + l3);
	}

}

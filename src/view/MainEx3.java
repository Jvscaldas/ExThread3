package view;

import java.util.Random;

import controller.ThreadEx3;

public class MainEx3 {
	public static void main(String[] args) {
		int[][] m = new int[3][5];
		Random generator = new Random();
		for (int i = 0; i < m.length; i++) {
			for (int k = 0; k < m.length; k++) {
				m[i][k] = generator.nextInt(10);

			}

		}
		String mostra = "";
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				mostra = mostra + " " + m[i][j];
			}
			mostra = mostra + "\n";
		}
		System.out.println(mostra);

		for (int i = 0; i < 1; i++) {
			Thread thread = new ThreadEx3(m, i,  i, i);
			thread.start();
		}
	}
}

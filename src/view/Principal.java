package view;
import java.util.Random;
import controller.ThreadMatriz;

public class Principal {
	public static void main(String[] args) {

		int i, j;
		int [][] mat = new int[3][5];
		Random aleat = new Random();

		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 5; j++)
			{
				mat[i][j] = aleat.nextInt(10) + 1;
			}
		}

		for (i = 0; i < 3; i++) 
		{
			Thread array = new ThreadMatriz(mat[i]);
			array.run();
		}
	}
}
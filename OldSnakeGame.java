package matrix;

import java.util.Scanner;
import java.util.Random;

public class OldSnakeGame {
	public static void printboard(char[][] board) {
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void cleanboard(char[][] board, int fi, int fj, int si, int sj) {
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '_';
			}
		}
		board[fi][fj] = '$';
		board[si][sj] = 'O';
		printboard(board);
	}
	
	public static void main(String[] args) {
		final char[][] board = new char[10][10];
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '_';
			}
		}
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("---Instructions---");
		System.out.println("Use w for up\nUse a for left\nUse d for right\nUse s for down ");
		int fi = r.nextInt(9), fj = r.nextInt(9);
		int si = fi+1, sj = fj+1;
		char inp;
		int score = 0;
		board[fi][fj] = 'F';
		board[si][sj] = 'S';
		printboard(board);
		while(true) {
			System.out.println("Your Score : " + score);
			System.out.println("Enter Button:");
			printboard(board);
			inp = sc.next().charAt(0);
			try {
				if(Character.toLowerCase(inp) == 'w') {
					board[si][sj] = '_';
					si -= 1;
					board[si][sj] = 'S';
//					cleanboard(board, fi, fj, si, sj+1);
				printboard(board);
				}
				else if(Character.toLowerCase(inp) == 's'){
					board[si][sj] = '_';
					si +=1;
					board[si][sj] = 'S';
//					cleanboard(board, fi, fj, si, sj-1);
				printboard(board);
				}
				else if(Character.toLowerCase(inp) == 'a'){
					board[si][sj] = '_';
					sj -= 1;
					board[si][sj] = 'S';
//					cleanboard(board, fi, fj, si-1, sj-1);
				printboard(board);
				}
				else if(Character.toLowerCase(inp) == 'd'){
					board[si][sj] = '_';
					sj += 1;
					board[si][sj] = 'S';
//					cleanboard(board, fi, fj, si+1, sj+1);
				printboard(board);
				}
				else {
					System.out.println("Enter Valid!");
				}
				
				if(board[si][sj] == board[fi][fj]) {
					board[fi][fj] = '_';
					board[si][sj] = 'S';
					fi = r.nextInt(9);
					fj = r.nextInt(9);
					board[fi][fj] = 'F';
					score++;
					printboard(board);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Snake dashed the wall :(");
				System.out.println("Game Over!");
				break;
			}
		}
	}
}

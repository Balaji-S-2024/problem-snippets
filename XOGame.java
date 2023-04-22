
import java.util.Scanner;

public class XOGame {
	public static void main(String[] args) {
		char board[][] = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j]=' ';
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("GAME STARTS!!!");
		System.out.println("Start Game By Entering X (or) 0 !");
		char player = sc.next().charAt(0);
		boolean gameover=false;
		while(!gameover) {
			printb(board);
			System.out.println("Player "+player+" enter");
			System.out.println("Enter Row [0,1,2] :");
			int row = sc.nextInt();
			System.out.println("Enter Column [0,1,2] :");
			int col = sc.nextInt();
			if (board[row][col] == ' ') {
				board[row][col] = player;
				printb(board);
				if(checkwin(board,player)) {
					gameover=true;
					
				}
				if(player == 'X') {
					player='0';
				}else {
					player='X';			
				}
			}else {
				System.out.println("Wrong Move!");
			}
		}

	}

	private static boolean checkwin(char[][] board, char player) {
		// Column Check
		if(board[0][0] == player && board[1][0] == player && board[2][0] == player) {
			printb(board);
			System.out.println("Player "+player+" Won!");
			return true;
		}
		if(board[0][1] == player && board[1][1] == player && board[2][1] == player) {
			printb(board);
			System.out.println("Player "+player+" Won!");
			return true;
		}
		if(board[0][2] == player && board[1][2] == player && board[2][2] == player) {
			printb(board);
			System.out.println("Player "+player+" Won!");
			return true;
		}

		
		//Row Check
		if(board[0][0] == player && board[0][1] == player && board[0][2] == player) {
			printb(board);
			System.out.println("Player "+player+" Won!");
			return true;
		}
		if(board[1][0] == player && board[1][1] == player && board[1][2] == player) {
			printb(board);
			System.out.println("Player "+player+" Won!");
			return true;
		}
		if(board[2][0] == player && board[2][1] == player && board[2][2] == player) {
			printb(board);
			System.out.println("Player "+player+" Won!");
			System.exit(0);
			return true;
		}
		
		//Diognal Check
		if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			printb(board);
			System.out.println("Player "+player+" Won!");
			return true;
		}
		if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			printb(board);
			System.out.println("Player "+player+" Won!");
			return true;
		}
		return false;
		
	}

	private static void printb(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(" "+board[i][j]+"  |");
			}
			System.out.println();
		}System.out.println();
	}

}

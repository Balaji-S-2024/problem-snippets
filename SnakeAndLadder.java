package matrix;
// *No using Matrix
// Using Hashmap for ladder and snake 
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player 1 Name : ");
		String player1 = sc.next();
		System.out.println("Enter Player 2 Name : ");
		String player2 = sc.next();
		String currentPlayer = "";
		Random r = new Random();
		int v = 1;
		int player1Pos = 0;
		int player2Pos = 0;
		HashMap<Integer, Integer> snakes = new HashMap<Integer, Integer>();
		snakes.put(25, 20);
		snakes.put(99, 89);
		snakes.put(5, 0);
		snakes.put(53, 12);
		snakes.put(66, 49);
		HashMap<Integer, Integer> ladder = new HashMap<Integer, Integer>();
		ladder.put(2, 26);
		ladder.put(20, 43);
		ladder.put(45, 88);
		ladder.put(87, 91);
		ladder.put(37, 56);
		ladder.put(17, 62);
		while (true) {
			int dice = r.nextInt(1, 7);
			if(player1Pos == 100){
				System.out.println(player1 + " wins the game");
				break;
			}
			else if(player2Pos == 100) {
				System.out.println(player2 + " wins the game");
				break;
				
			}
			if(v%2 == 0) {				
				System.out.println(player1 + " rolled a dice! and he gets [ " + dice + " ]");
				player1Pos += dice;
				if(player1Pos > 100) {
					System.out.println("Player can't go further 100");
					player1Pos -= dice;
				}
				System.out.println("Now " + player1 + " position is : " + player1Pos);
				if(snakes.containsKey(player1Pos)) {
					player1Pos = snakes.get(player1Pos);
					System.out.println(":(");
					System.out.println(player1 + " bit by snake his Current Position is " + player1Pos);
				}
				if(ladder.containsKey(player1Pos)) {
					player1Pos = ladder.get(player1Pos);
					System.out.println(";)");
					System.out.println(player1 + " climbed the ladder and his Current Position is " + player1Pos);
				}

			}
			else {				
				System.out.println(player2 + " rolled a dice! and he gets [ " + dice + " ]");
				player2Pos += dice;
				if(player2Pos > 100) {
					System.out.println("Player can't go further 100");
					player2Pos -= dice;
				}
				System.out.println("Now " + player2 + " position is : " + player2Pos);
				if(snakes.containsKey(player2Pos)) {
					player2Pos = snakes.get(player2Pos);
					System.out.println(":(");
					System.out.println(player2 + " bit by snake and his Current Position is " + player2Pos);
				}
				if(ladder.containsKey(player2Pos)) {
					player2Pos = ladder.get(player2Pos);
					System.out.println(";)");
					System.out.println(player2 + " climbed the ladder and his Current Position is " + player2Pos);
				}
			}
			System.out.println("Press enter to continue;");
			sc.nextLine();
			System.out.println();
			v++;
		}
		
	}

}

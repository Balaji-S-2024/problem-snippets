import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row and Column row- col- :");
		int row = sc.nextInt();
		int col = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("* ");
			}System.out.println();
		}

	}

}

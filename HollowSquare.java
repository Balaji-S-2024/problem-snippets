import java.util.Scanner;

public class HollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row and Column row- col- :");
		int row = sc.nextInt();
		int col = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i == 0 || j == col-1 || i == row-1 || j ==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}

	}

}

import java.util.Scanner;

public class RightAngleLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row row- :");
		int row = sc.nextInt();
		int col = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}

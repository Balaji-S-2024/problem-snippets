import java.util.Scanner;
public class RightAngleRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row row- :");
		int row = sc.nextInt();
		int arr[][] = new int[row][row];
		int val = 0;
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < row; j++) {
				if(j >= row-1 - val) {
					arr[i][j] = 1;
				}
			}
			val++;
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr[i][j]+" ");		
			}System.out.println();
		}
		
	}
}

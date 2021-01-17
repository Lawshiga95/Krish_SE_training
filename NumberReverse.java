import java.util.Scanner;

public class NumberReverse {
	public static void main(String args[]) {
		
		System.out.println("Please enter a number to view the reverse of it !");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int number = input;
		
		int count = 0;
		while(input != 0){
			input = input / 10;
			count ++;
		}
		
		// System.out.println("The number of digits in input is " + count);
		
		int divider = (int)(Math.pow(10, count-1));
		
		int x,y=0;
		int[] array = new int[count];
		while(divider != 0) {
			x = number / divider;
			array[y] = x;
			number = number % divider;
			divider = divider/10;
			y++;
		}
		System.out.print("Reversed number :");	
		for(int i=count-1; i>=0; i--) {
			System.out.print(array[i]);
		}
				
	}
}
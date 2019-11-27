import java.util.Scanner;

public class uva10931 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int num = in.nextInt();
			if(num == 0)break;
			String bin = "";
			int onecount = 0;
			while(num > 0) {
				if(num % 2 == 1) {
					onecount++;
					bin = "1" + bin;
				}else
					bin = "0" + bin;
				num /= 2;
			}
			System.out.println("The parity of " + bin + " is " + onecount + " (mod 2).");
		}
		in.close();
	}
}
/*
Sample Input
1
2
10
21
0
Sample Output
The parity of 1 is 1 (mod 2).
The parity of 10 is 1 (mod 2).
The parity of 1010 is 2 (mod 2).
The parity of 10101 is 3 (mod 2).
*/
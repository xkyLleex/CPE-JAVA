import java.util.Scanner;

public class uva10812 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int i=0;i<count;i++) {
			int a = in.nextInt(),b = in.nextInt();
			if((a-b)/2 > 0 && (a+b)/2 > 0 && (a-b)%2 == 0 && (a+b)%2 == 0)
				System.out.println((a+b)/2 + " " +(a-b)/2);
			else
				System.out.println("impossible");
		}
		in.close();
	}
}
/*
Sample Input
2
40 20
20 40
Sample Output
30 10
impossible
 */
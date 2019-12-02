import java.util.Scanner;

public class uva10193 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int cases=1;cases<=count;cases++){
			String str = in.next();
			int num1 = 0,num2 = 0;
			for(int i=str.length()-1;i>=0;i--)
				num1 +=(str.charAt(i) == '1')?Math.pow(2, str.length()-1-i):0;
			str = in.next();
			for(int i=str.length()-1;i>=0;i--)
				num2 +=(str.charAt(i) == '1')?Math.pow(2, str.length()-1-i):0;
			while(num2 != 0){
				int gcd = num2;
				num2 = num1 % num2;
				num1 = gcd;
			}
			if(num1 != 1)
				System.out.println("Pair #" + cases + ": All you need is love!");
			else
				System.out.println("Pair #" + cases + ": Love is not all you need!");
		}
		in.close();
	}
}
/*
Sample Input
5
11011
11000
11011
11001
111111
100
1000000000
110
1010
100
Sample Output
Pair #1: All you need is love!
Pair #2: Love is not all you need!
Pair #3: Love is not all you need!
Pair #4: All you need is love!
Pair #5: All you need is love!
*/
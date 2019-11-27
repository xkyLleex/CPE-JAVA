import java.util.Scanner;

public class uva10019 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int cases = 0;cases < count;cases++) {
			int decbin = in.nextInt();
			System.out.print(dectrans(decbin) + " ");
			int hexbin = 0,hex = 1;
			while(decbin > 0) {
				if(decbin % 10 != 0) 
					hexbin += (decbin % 10) * hex;
				decbin /= 10;
				hex *= 16;
			}
			System.out.println(dectrans(hexbin));
		}
		in.close();
	}
	public static int dectrans(int num) {
		int out = 0;
		while(num > 0) {
			if(num % 2 == 1)
				out++;
			num /= 2;
		}
		return out;
	}
}
/*
265
132 - 1
66 - 0
33 - 0
16 - 1
8 - 0
4 - 0
2 - 0
1 - 0
1
*/
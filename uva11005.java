import java.util.Scanner;

public class uva11005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int cases = 1;cases <= count;cases++){
			System.out.println("Case " + cases + ":");
			int firnum[] = new int[36];
			for(int i=0;i<36;i++)
				firnum[i] = in.nextInt();
			int size = in.nextInt();
			for(int i=0;i<size;i++){
				int secnum = in.nextInt();
				int sum[] = new int[35];//2-36>0-34>35
				for(int j=2;j<37;j++){
					int sumnum = secnum;
					while(sumnum > 0){
						int numlocation = sumnum % j;
						sumnum /= j;
						sum[j-2] += firnum[numlocation];
					}
				}
				int min = sum[0];
				for(int j=1;j<sum.length;j++)
					min = (sum[j] < min)?sum[j]:min;
				System.out.print("Cheapest base(s) for number " + secnum + ":");
				for(int j=0;j<sum.length;j++)
					System.out.print((sum[j] == min)?" " + (j+2):"");
				System.out.println();
			}
			if(count != cases)System.out.println();
		}
		in.close();
	}
}
/*
Sample Input
2
10 8 12 13 15 13 13 16 9
11 18 24 21 23 23 23 13 15
17 33 21 23 27 26 27 19 4
22 18 30 30 24 16 26 21 21
5
98329921
12345
800348
14
873645
1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1
4
0
1
10
100
Sample Output
Case 1:
Cheapest base(s) for number 98329921: 24
Cheapest base(s) for number 12345: 13 31
Cheapest base(s) for number 800348: 31
Cheapest base(s) for number 14: 13
Cheapest base(s) for number 873645: 22
Case 2:
Cheapest base(s) for number 0: 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36
Cheapest base(s) for number 1: 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36
Cheapest base(s) for number 10: 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
26 27 28 29 30 31 32 33 34 35 36
Cheapest base(s) for number 100: 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
26 27 28 29 30 31 32 33 34 35 36
*/

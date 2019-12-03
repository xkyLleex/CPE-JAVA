import java.util.Scanner;

public class uva10050 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int cases = 0;cases < count;cases++){
			int days = in.nextInt();
			int party[] = new int[in.nextInt()];
			for(int i=0;i<party.length;i++)
				party[i] = in.nextInt();
			int sum = 0;
			for(int i=1;i<=days;i++){//0 = sunday
				if((i+1) % 7 != 0 && i % 7 != 0){
					for(int h=0;h<party.length;h++){
						if(i % party[h] == 0){
							sum += 1;
							break;
						}
					}
				}
			}
			System.out.println(sum);
		}	
		in.close();
	}
}
/*
0-sunday 1-monday 2-tuesday 3-wednesday 4-thursday :can strikes
5-friday 6-saturday -can't strikes
Sample Input
2
14
3
3
4
8
100
4
12
15
25
40
Sample Output
5
15
*/

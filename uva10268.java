import java.util.*;

public class uva10268 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {//on cpe need use in.hasNext()
			long x = Integer.valueOf(in.nextLine()),sum = 0;
			if(x==0)break;//jump out
			String line[]= in.nextLine().split(" ");
			for(int i=0;i<line.length-1;i++) {
				long a = (line.length - i - 1) * Long.valueOf(line[i]);
				sum += Math.pow(x, line.length - i - 2) * a;
			}
			System.out.println(sum);
		}
		in.close();
	}
}
/*
Sample Input
7
1 -1
2
1 1 1
Sample Output
1
5
--------------
0 1		= 1 0
0 1 2	= 2 1 0
 */
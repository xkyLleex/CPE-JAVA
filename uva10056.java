import java.util.Scanner;

public class uva10056 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt(),Round = 100;
		for(int i=0;i<count;i++){
			int n = in.nextInt();//people count
			double p = in.nextDouble();//win chance
			int k = in.nextInt();//win people
			double q = 1 - p;//lose chance
			double sum = 0;
			for(int j=1;j<=Round;j++)
				sum += Math.pow(q, (j-1)*n) * Math.pow(q, k-1) * p;
			
			if(p == 0)
				System.out.println("0.0000");
			else
				System.out.printf("%.4f\n",sum);
		}
		in.close();
	}

}
/*
2
2 0.166666 1
2 0.166666 2

0.5455
0.4545
*/
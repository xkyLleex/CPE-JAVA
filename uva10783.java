import java.util.Scanner;

public class uva10783{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int count = in.nextInt();
		for(int i=1;i<=count;i++){
			int a = in.nextInt(),b = in.nextInt(),sum = 0;
			if(a % 2 == 0)a++;
			for(int j=a;j<=b;j+=2)
				sum += j;
			System.out.println("Case " + i + ": " + sum);
		}
		in.close();
	}
}

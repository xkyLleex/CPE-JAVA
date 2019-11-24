import java.util.Scanner;

public class uva11461 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int a = in.nextInt(),b = in.nextInt(),sum = 0;
			if(a==0 && b==0)break;	
			for(int i=a;i<=b;i++){
				if(Math.sqrt(i) % 1 != 0)
					continue;
				else
					sum++;
			}
			System.out.println(sum);
		}
		in.close();
	}
}

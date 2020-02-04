import java.util.Scanner;

public class uva11417 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int num = in.nextInt();
			if(num == 0)break;
			int G = 0;
			for(int i=1;i<num;i++)
				for(int j=i+1;j<=num;j++)
					G += GCD(i,j);
			System.out.println(G);
		}
		in.close();
	}
	public static int GCD(int i,int j){
		if(i == 0)return j;
		if(j == 0)return i;
		if(i > j)return(GCD(i-j , j));
		return(GCD(j-i , i));
	}
}
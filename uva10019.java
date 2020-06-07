import java.util.Scanner;

public class uva10019 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int cases = in.nextInt();
		while((cases--)>0){
			int num = in.nextInt();
			System.out.println(dectobin(num) + " " + dectobin(Integer.parseInt(num+"",16)));
		}
		in.close();
	}
	public static int dectobin(int num){
    	int sum = 0;
    	while(num != 0){
    		if(num % 2 != 0)sum++;
    		num /= 2;
    	}
    	return sum;
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

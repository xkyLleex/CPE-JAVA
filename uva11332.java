import java.util.Scanner;

public class uva11332 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true){
			String num = in.next();
			if(num.equals("0"))break;
			while(num.length() != 1){
				int sum = 0;
				for(int i=0;i<num.length();i++)
					sum += num.charAt(i) - '0';
				num = Integer.toString(sum);
			}
			System.out.println(num);
		}
		in.close();
	}
}

import java.util.Scanner;

public class uva11332 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			String num = in.nextLine();
			if(num.charAt(0) == '0')break;
			while(true){
				int sum = 0;
				for(int i=0;i<num.length();i++)
					sum += num.charAt(i)-48;
				if(sum / 10 == 0){
					System.out.println(sum);
					break;
				}else
				 	num = Integer.toString(sum);
			}
		}
		in.close();
	}
}

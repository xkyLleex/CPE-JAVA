import java.util.Scanner;

public class uva10922 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			String str = in.next(),str2 = str;
			if(str.equals("0"))break;
			int degree = 0;
			while(true){
				int num = 0;
				for(int i=0;i<str2.length();i++)
					num += str2.charAt(i) - '0';
				str2 = num + "";
				if(num % 9 == 0)degree += 1;
				if(num == 9 || num % 9 != 0)break;
			}
			if(degree == 0)
				System.out.println(str + " is not a multiple of 9.");
			else
				System.out.println(str + " is a multiple of 9 and has 9-degree " + degree + ".");
		}
		in.close();
	}

}

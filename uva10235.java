import java.util.Scanner;

public class uva10235 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {//on cpe need use in.hasNext()
			String num = in.next();
			if(num == "")break;//jump out
			String mun = "";
			int check = 0;//0-emirp 1-prime 2-not prime
			for(int i=0;i<num.length();i++) 
				mun += num.charAt(num.length()-i-1);
			if(Integer.parseInt(num) != Integer.parseInt(mun)) {
				for(int i=2;i<Integer.parseInt(mun);i++) {
					if(Integer.parseInt(mun) % i == 0) {
						check = 1;
						break;
					}
				}
			}else
				check = 1;
			for(int i=2;i<Integer.parseInt(num);i++) {
				if(Integer.parseInt(num) % i == 0) {
					check = 2;
					break;
				}
			}
			if(check == 0)
				System.out.println(num + " is emirp.");
			else if(check == 1)
				System.out.println(num + " is prime.");
			else
				System.out.println(num + " is not prime.");
		}
		in.close();
	}
}

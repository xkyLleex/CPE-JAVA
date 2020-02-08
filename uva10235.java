import java.util.Scanner;

public class uva10235 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			String num = in.next(),mun = "";
			if(num == "")break;//jump out
			boolean prime = false,emirp = false;
			prime = prime(Integer.parseInt(num));
			for(int i=num.length()-1;i>=0;i--)
				mun += num.charAt(i);
			emirp = (num.equals(mun))?false:prime(Integer.parseInt(mun));
			if(prime && emirp)
				System.out.println(num + " is emirp.");
			else if(prime && !emirp)
				System.out.println(num + " is prime.");
			else
				System.out.println(num + " is not prime.");
		}
		in.close();
	}
	public static boolean prime(int num){
		if(num != 2 && num % 2 == 0)return false;
		for(int i=3;i<num;i+=2)
			if(num % i == 0)
				return false;
		return true;
	}
}
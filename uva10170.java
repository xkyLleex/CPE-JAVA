import java.util.Scanner;

public class uva10170 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {//on cpe need use in.hasNext()
			long number = in.nextLong();
			if(number == 0)break;//jump out
			long day = in.nextLong(),countday = number;
			while(countday < day){
				number++;
				countday += number;
			}
			System.out.println(number);
		}
		in.close();
	}
}

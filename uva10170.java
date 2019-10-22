import java.util.Scanner;

public class uva10170 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {//on cpe need use in.hasNext()
			int number = in.nextInt();
			if(number == 0)break;//jump out
			int day = in.nextInt(),countday = 0;
			while(true) {
				for(int i=0;i<number;i++) 
					countday += 1;
				if(countday >= day)break;
				number++;
			}
			System.out.println(number);
		}
		in.close();
	}
}
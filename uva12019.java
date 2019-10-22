import java.util.Scanner;

public class uva12019 {
	public static void main(String[] args){//use year 2011
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};//1/1 Saturday
		String week[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		for(int i=0;i<count;i++){
			int in_month = in.nextInt();
			int day = in.nextInt();
			if(in_month != 1){
				for(int j=0;j<in_month-1;j++)
					day += month[j];
			}
			System.out.println(week[(day-1)%7]);
		}
		in.close();
	}
}
/*
8
1 6
2 28
4 5
5 26
8 1
11 1
12 25
12 31
*/
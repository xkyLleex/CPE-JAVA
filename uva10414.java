import java.util.Scanner;

public class uva10414 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    	long num = in.nextLong();
    	count(num);
    	in.close();
	}
	
	public static void count(long num){
		if(num == 0)System.out.print("0");
		if(num / 10000000 != 0){
			count(num / 10000000);
			System.out.print(" kuti ");
			num = num % 10000000;
		}
		if(num / 100000 != 0){
			System.out.print( num / 100000 + " lakh ");
			num = num % 100000;
		}
		if(num / 1000 != 0){
			System.out.print( num / 1000 + " hajar ");
			num = num % 1000;
		}
		if(num / 100 != 0){
			System.out.print( num / 100 + " shata ");
			num = num % 100;
		}
		if(num % 100 != 0){
			System.out.print( num % 100);
		}
	}
}
/*
 23764 --- 3
 45897458973958 --- 8
 ---------- ----------

 23 hajar 7 shata 64
 45 lakh 89 hajar 7 shata 45 kuti 89 lakh 73 hajar 9 shata 58
 
 kuti  10000000
 lakh  100000
 hajar 1000
 shata 100 
*/

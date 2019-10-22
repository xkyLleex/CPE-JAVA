import java.util.*;

public class uva10101{
    public static void main(String[] args) {
        try{
            Scanner in=new Scanner(System.in);
            int number = 0;
            while(true){//on cpe need use in.hasNext()
		    	long num = in.nextLong();
		    	if(num==0)break;//jump out
		    	System.out.printf("%4d.",++number);
		    	count(num);
		    	System.out.println();
	    	}
	    	in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
    public static void count(long num){
		if(num == 0)System.out.print(" 0");
		if(num / 10000000 != 0){
			count(num / 10000000);
			System.out.print(" kuti");
			num = num % 10000000;
		}
		if(num / 100000 != 0){
			System.out.print(" " + num / 100000 + " lakh");
			num = num % 100000;
		}
		if(num / 1000 != 0){
			System.out.print(" " + num / 1000 + " hajar");
			num = num % 1000;
		}
		if(num / 100 != 0){
			System.out.print(" " + num / 100 + " shata");
			num = num % 100;
		}
		if(num % 100 != 0){
			System.out.print(" " + num % 100);
			return;
		}
	}
};

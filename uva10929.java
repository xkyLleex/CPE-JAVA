import java.util.*;

public class uva10929{
    public static void main(String[] args) {
        try{
            Scanner in=new Scanner(System.in);
            while(true){
            	String num=in.next();
            	if(num.equals("0"))break;
            	System.out.print(num + " is ");
            	int sum = 0;
            	for(int i=0;i<num.length();i++){
            		if(i % 2 == 0)sum += num.charAt(i)-48;//odd
            		else sum -= num.charAt(i)-48;//even
            	}
            	if(sum % 11 == 0)
            		System.out.println("a multiple of 11.");
            	else
            		System.out.println("not a multiple of 11.");
            }
            in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
};

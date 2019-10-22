import java.util.*;

public class uva10035{
    public static void main(String[] args) {
        try{
            int a,b,sum,carry;
            Scanner in=new Scanner(System.in);
            while(true){
            	a = in.nextInt();b = in.nextInt();
            	if(a==0&&b==0)break;
            	sum = 0;carry = 0;
            	while(true){
            		int alastnum = a%10;int blastnum = b%10;
            		if(alastnum + blastnum + carry > 9){
            			sum++;
            			carry = 1;
            		}else{
            			carry = 0;
            		}
            		a /= 10;b /= 10;
            		if(a==0&&b==0)break;
            	}
            	if(sum==0)
            		System.out.println("No carry operation.");
            	else if(sum==1)
            		System.out.println("1 carry operation.");
            	else
            		System.out.println(sum + " carry operations.");
            }
            in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
};

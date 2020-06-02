import java.util.*;

public class uva10035{
    public static void main(String[] args) {
        try{
            Scanner in=new Scanner(System.in);
            while(true){
            	int a=in.nextInt(),b=in.nextInt();
            	if(a == 0 && b == 0)break;
            	int carry = 0,carrycount = 0;
            	while(a != 0 || b != 0){
            		int amod = a % 10,bmod = b % 10;
            		if((carry + amod + bmod) > 9){
            			carry = 1;
            			carrycount++;
            		}else{
            			carry = 0;
            		}
            		a /= 10;b /= 10;
            	}
            	if(carrycount == 0){System.out.println("No carry operation.");}
            	else if(carrycount == 1){System.out.println("1 carry operation.");}
            	else{System.out.println(carrycount + " carry operations.");}
            }
            in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
};

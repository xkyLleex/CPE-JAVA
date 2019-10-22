import java.util.*;
public class uva10055{
    public static void main(String[] args) {
        try{
            Scanner in=new Scanner(System.in);
            while(true){//on cpe need use in.hasNext()
            	long a=in.nextLong();
            	long b=in.nextLong();
            	if(a==0&&b==0)break;//jump out
            	System.out.println(Math.abs(a-b));
            }in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
};

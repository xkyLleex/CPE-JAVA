import java.util.*;

public class uva100{
    public static void main(String[] args) {
        try{
            Scanner in=new Scanner(System.in);
            while(true){//on cpe need use in.hasNext()
            	int a = in.nextInt();int b = in.nextInt();
            	if(a==0&&b==0)break;//JUMP OUT
            	System.out.print(a + " " + b);
            	if(a>b){
            		int change = a;
            		a = b;
            		b = change;
            	}
            	int bigsum = 0;
            	for(int i=a;i<=b;i++){
            		int num = i,sum = 1;
            		while(num!=1){
            			sum++;
            			if(num % 2 != 0)num = 3 * num + 1;
            			else num /= 2;
            		}
            		if(bigsum < sum)bigsum = sum;
            	}
            	System.out.println(" " + bigsum);
            }
            in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
};

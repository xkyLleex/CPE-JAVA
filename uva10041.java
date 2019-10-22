import java.util.*;

public class uva10041{
    public static void main(String[] args) {
        try{
            int a,b;
            Scanner in=new Scanner(System.in);
            a=in.nextInt();
            for(int i=0;i<a;i++){
            	b = in.nextInt();
            	int numlist[] = new int[b];
            	for(int j=0;j<b;j++)
            		numlist[j] = in.nextInt();
            	int sum = 0;
            	for(int j=0;j<b;j++){
            		int sumbefore = 0;
            		for(int k=0;k<b;k++){
            			if(j==k)continue;
            			sumbefore += Math.abs(numlist[j]-numlist[k]); 
            		}
            		if(sum==0)
            			sum = sumbefore;
            		if(sumbefore < sum)
            			sum = sumbefore;
            	}
            	System.out.println(sum);
            }
            in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
};
import java.util.*;

public class uva10041{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            while((count--)>0){
            	int numlist [] = new int[sc.nextInt()];
            	for(int i=0;i<numlist.length;i++)
            		numlist[i] = sc.nextInt();
            	int min = 0,num = 0;
            	for(int i=0;i<numlist.length;i++){
            		int sum = 0;
            		for(int j=0;j<numlist.length;j++){
            			if(i==j)continue;
            			sum += Math.abs(numlist[i]-numlist[j]);
            		}
            		if(i==0)min=sum;
            		if(min > sum){
            			min = sum;
            			num = i;
            		}
            	}
            	System.out.println(min);
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
};

import java.util.*;

public class uva11321{
    public static void main(String[] args) {
        try{
            int n,m;
            Scanner in=new Scanner(System.in);
            while(true){
            	n=in.nextInt();m=in.nextInt();
            	if((n==0)&&(m==0))break;
            	System.out.println(n + " " + m);
            	int intlist[] = new int[n];
            	for(int i=0;i<n;i++)
            		intlist[i] = in.nextInt();
            	for(int i=0;i<n-1;i++){
            		if(intlist[i] % m > intlist[i+1] % m){
            			i = listchange(i,intlist);
            		}else if(intlist[i] % m == intlist[i+1] % m){
            			if((intlist[i] % 2==0)&&(intlist[i+1] % 2==0)){//even even
            				if(intlist[i] > intlist[i+1])
            					i = listchange(i,intlist);
            			}else if((intlist[i] % 2!=0)&&(intlist[i+1] % 2!=0)){//odd odd
            				if(intlist[i] < intlist[i+1])
            					i = listchange(i,intlist);
            			}else{
            				if(intlist[i] % 2==0)//even,odd to odd,even
            					i = listchange(i,intlist);
            			}
            		}
            	}
            	for(int i=0;i<n;i++)
            		System.out.println(intlist[i]);
            }
            in.close();
        }catch(Exception e){
            System.out.println("Input error!");
        }
    }
    public static int listchange(int a,int numlist[]){
    	int change = numlist[a];
    	numlist[a] = numlist[a+1];
    	numlist[a+1] = change;
    	return -1;
    }
};

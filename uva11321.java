import java.util.*;

public class uva11321{
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
           	while(true){
           		int numlist []= new int[in.nextInt()],modnum = in.nextInt();
           		System.out.println(numlist.length + " " + modnum);
           		if(numlist.length == 0 && modnum == 0)break;
           		int minmod = 0;
           		for(int i=0;i<numlist.length;i++){
           			numlist[i] = in.nextInt();
           			minmod = (numlist[i]%modnum<minmod)?numlist[i]%modnum:minmod;
           		}
           		Arrays.sort(numlist);
           		for(int j=minmod;j<modnum;j++){
	           		for(int i=numlist.length-1;i>=0;i--){//odd
	           			if(numlist[i] % modnum == j && numlist[i] % 2 != 0)
	           				System.out.println(numlist[i]);
	           		}
	           		for(int i=0;i<numlist.length;i++){//even
	           			if(numlist[i] % modnum == j && numlist[i] % 2 == 0)
	           				System.out.println(numlist[i]);
	           		}
	           	}
           	}
           	in.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
};

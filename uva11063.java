import java.util.Scanner;

public class uva11063 {
	public static void main(String[] args) {//不確定是否正確!!
		Scanner in = new Scanner(System.in);
		int countcase = 0;
		while(true){//on cpe need use in.hasNext()
			int count = in.nextInt(),sum = 0;
			if(count == 0)break;//jump out
			int num[] = new int[count];
			for(int i=0;i<num.length;i++){
				num[i] = in.nextInt();
				sum += i+1;
			}
			int numsum[] = new int[sum];
			for(int i=0;i<count;i++){
				for(int j=i;j<count;j++)
					numsum[--sum] = num[i] + num[j]; 
			}
			boolean check = false;
			for(int i=0;i<numsum.length;i++){
				for(int j=i+1;j<numsum.length;j++){
					if(numsum[i] == numsum[j]){
						check = true;
						break;
					}
				}
				if(check)break;
			}
			if(check)
				System.out.println("Case #" + (++countcase) + ": It is not a B2-Sequence");
			else
				System.out.println("Case #" + (++countcase) + ": It is a B2-Sequence");
		}
		in.close();
	}
}

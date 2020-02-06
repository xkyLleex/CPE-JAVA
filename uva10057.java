import java.util.Scanner;
import java.util.Arrays;

public class uva10057 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			int count = in.nextInt(),temp = 0;
			if(count == 0)break;//jump out
			int num[] = new int[count];
			for(int i=0;i<count;i++)
				num[i] = in.nextInt();
			Arrays.sort(num);
			int mid = num[(count-1)/2];//if odd mid=mid2
			int	mid2 = num[count/2];
			for(int i=0;i<count;i++)
				if(num[i] == mid)
					temp++;
			int poss = mid2-mid+1;
			System.out.println(mid + " " + temp + " " + poss);
		}
		in.close();
	}
}

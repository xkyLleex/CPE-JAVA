import java.util.Scanner;

public class uva10642 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int count=1;count<=cases;count++){
			int step = 0,loc[] = new int[4];
			for(int i=0;i<4;i++)
				loc[i] = in.nextInt();
			while(loc[0] != loc[2] || loc[1] != loc[3]){
				if(loc[1] == 0){
					loc[1] = loc[0]+1;
					loc[0] = 0;
				}else{
					loc[1] -= 1;
					loc[0] += 1;
				}
				step++;
			}
			System.out.println("Case " + count + ": " + step);
		}
		in.close();
	}
}

import java.util.Scanner;
import java.util.ArrayList;

public class uva948 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int casec = 0;casec < count;casec++){
			int num = in.nextInt();
			System.out.print(num + " = ");
			ArrayList<Integer> fibs = new ArrayList<Integer>();
			fibs.add(1);fibs.add(2);
			int n = 0,sum = 1;
			while(num > sum){
				sum += fibs.get(n+1);
				fibs.add(fibs.get(n) + fibs.get((n++)+1));
			}
			String outstr = "";
			for(int i=fibs.size()-1;i>=0;i--){
				if(fibs.get(i) <= num){
					outstr += "1";
					num -= fibs.get(i);
				}else
					outstr += (outstr != "")?"0":"";
			}
			System.out.println(outstr + " (fib)");
		}
		in.close();
	}
}

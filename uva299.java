import java.util.Scanner;

public class uva299 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		while((cases--)!=0){
			int data = in.nextInt();
			int num[] = new int[data];
			for(int i=0;i<data;i++)
				num[i] = in.nextInt();
			int swaps = 0;
			for(int i=0;i<data-1;i++){
				if(num[i] > num[i+1]){
					int temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
					swaps++;
					i = -1;
				}
			}
			System.out.println("Optimal train swapping takes " + swaps + " swaps.");
		}
		in.close();
	}

}

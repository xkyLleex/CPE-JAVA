import java.util.Scanner;

public class uva11349 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = Integer.valueOf(in.nextLine());
		for(int testcase=1;testcase<=count;testcase++){
			in.next();in.next();
			int num = Integer.parseInt(in.next());
			int matrix[] = new int[num*num];
			boolean check = false;
			for(int i=0;i<matrix.length;i++)
				matrix[i] = in.nextInt();
			for(int i=0;i<matrix.length/2;i++){
				if(matrix[i] < 0 || matrix[matrix.length-i-1] < 0 || matrix[i] != matrix[matrix.length-i-1]){
					check = true;
					break;
				}
			}
			if(check)
				System.out.println("Test #" + testcase + ": Non-symmetric.");
			else
				System.out.println("Test #" + testcase + ": Symmetric.");
		}
		in.close();
	}

}

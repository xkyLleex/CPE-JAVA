import java.util.Scanner;

public class uva10038 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){//on cpe need use in.hasNext()
			int count = in.nextInt();
			if(count == 0)break;//jump out
			int num[] = new int[count];
			boolean check[] = new boolean[count-1];
			for(int i=0;i<count;i++)
				num[i] = in.nextInt();
			for(int i=1;i<count;i++)
				if(Math.abs(num[i-1]-num[i]) < count && Math.abs(num[i-1]-num[i]) != 0)
					check[Math.abs(num[i-1]-num[i])-1] = true;
			boolean checkJolly = true;
			for(int i=0;i<count-1;i++)
				if(count != 1 && !(check[i]))
			checkJolly = false;
			if(checkJolly)System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
		in.close();
	}
}
/*
5 1 4 2 -1 6
4 1 4 2 3
第一個數字為資料量
判斷前後數字相減，如果相減後家絕對值會變成1 2 3 4 5...或5 4 3 2 1(不一定按照順序！)
會輸出Jolly，若不是，則輸出Not jolly
E.g.:	5 1 4 2 -1 6 =>|1-4|=3 ,|4-2|=2 ,|2-(-1)|=3 ...
	因3->2->3...違反jolly原則，所以輸出Not jolly
	
	4 1 4 2 3 =>|1-4|=3 ,|4-2|=2 ,|2-3|=1
	因3->2->1，所以符合jolly原則，輸出Jolly
*/

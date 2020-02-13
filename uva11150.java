import java.util.Scanner;

public class uva11150 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			int num = in.nextInt(),max = 0;
			if(num == -1)break;
			for(int i=0;i<3;i++){//i = friend's empty cola
				int cola = num,empty = cola+i,sum = 0;
				sum += cola;//first you have
				while(empty > 2){//with friend empty cola
					cola = empty / 3;
					empty = empty % 3 + cola;
					sum += cola;
				}
				if(empty >= i)
					if(max < sum)max = sum;
			}
			System.out.println(max);
		}
		in.close();
	}
}
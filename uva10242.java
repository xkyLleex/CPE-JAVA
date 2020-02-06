import java.util.Scanner;

public class uva10242 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			float loc[] = new float[8];
			for(int i=0;i<8;i++)
				loc[i] = in.nextFloat();
			if(loc[0] == 10000)break;//jump out
			float ax = 0,ay = 0;
			boolean check = true;
			for(int i=0;i<8;i+=2){
				ax += loc[i];
				ay += loc[i+1];
				for(int j=i+2;j<8 && check;j+=2){
					if(loc[i] == loc[j] && loc[i+1] == loc[j+1]){
						ax -= loc[i]*3;
						ay -= loc[i+1]*3;
						check = false;
						break;
					}
				}
			}
			System.out.printf("%.3f %.3f\r\n",ax,ay);
		}
		in.close();
	}
}
//CPE測資:2 5 2 1 2 1 2 5無法通過
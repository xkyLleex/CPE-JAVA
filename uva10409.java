import java.util.Scanner;

public class uva10409 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int cases = in.nextInt();
			if(cases == 0)break;
			int dice[] = new int[5];
			for(int i=0;i<5;i++)
				dice[i] = i+1;
			while((cases--)!=0){
				String command = in.next();
				int temp = dice[0];
				if(command.equals("north")){
					dice[0] = dice[4];//n
					dice[4] = 7-temp;
					dice[1] = temp;
				}else if(command.equals("south")){
					dice[0] = dice[1];//s
					dice[1] = 7-temp;
					dice[4] = temp;
				}else if(command.equals("east")){
					dice[0] = dice[2];//e
					dice[2] = 7-temp;
					dice[3] = temp;
				}else if(command.equals("west")){
					dice[0] = dice[3];//w
					dice[3] = 7-temp;
					dice[2] = temp;
				}
			}
			System.out.println(dice[0]);
		}		
		in.close();
	}
}
/*
0 ­ì¦ì
1 S
2 E
3 W
4 N
*/
import java.util.Scanner;

public class uva118 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int weight = in.nextInt()+1,height = in.nextInt()+1;
		boolean fall[][] = new boolean[height+2][weight+2];//x=fallx-1 y=fally-1
		while(true){//on cpe need use in.hasNext()
			int x = in.nextInt(),y = in.nextInt();
			char dir = in.next().charAt(0);
			if(dir == 'Z')break;//jump out
			String str = in.next();
			boolean lost = true;
			for(int i=0;i<str.length() && lost;i++){
				if(str.charAt(i) == 'F'){
					if(dir == 'N' && !fall[y+2][x+1]){
						if(y+1 == height){
							fall[y+2][x+1] = true;
							lost = false;
						}else
							y += 1;
					}else if(dir == 'E' && !fall[y+1][x+2]){
						if(x+1 == weight){
							fall[y+1][x+2] = true;
							lost = false;
						}else
							x += 1;
					}else if(dir == 'S' && !fall[y][x+1]){
						if(y-1 == -1){
							fall[y][x+1] = true;
							lost = false;
						}else
							y -= 1;
					}else if(dir == 'W' && !fall[y+1][x]){
						if(x-1 == -1){
							fall[y+1][x] = true;
							lost = false;
						}else
							x -= 1;
					}
				}else if(str.charAt(i) == 'L'){
					if(dir == 'N')dir = 'W';
					else if(dir == 'E')dir = 'N';
					else if(dir == 'S')dir = 'E';
					else if(dir == 'W')dir = 'S';
				}else if(str.charAt(i) == 'R'){
					if(dir == 'N')dir = 'E';
					else if(dir == 'E')dir = 'S';
					else if(dir == 'S')dir = 'W';
					else if(dir == 'W')dir = 'N';
				}
			}
			System.out.printf("%d %d %c%s\r\n",x,y,dir,(lost)?"":" LOST");
		}
		in.close();
	}
}

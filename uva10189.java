import java.util.Scanner;

public class uva10189 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h,w,cases = 0;
		while((h = in.nextInt()) != 0 && (w = in.nextInt()) != 0){
			//int h = in.nextInt(),w = in.nextInt();
			//if(h == 0 && w == 0)break;
			if(cases != 0)System.out.println();
			char pattern [][] = new char[h][w];
			for(int i=0;i<h;i++){
				String temp = in.next();
				for(int j=0;j<w;j++)
					pattern[i][j] = temp.charAt(j);
			}
			int patternCount[][] = new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(pattern[i][j] == '*'){
						for(int k=-1;k<=1;k++)
							for(int l=-1;l<=1;l++)//CheckAround
								if(i+k >= 0 && j+l >= 0 && i+k < h && j+l < w && pattern[i+k][j+l] != '*')
									patternCount[i+k][j+l]++;
					}	
				}
			}
			System.out.println("Field #" + (++cases) + ":");
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(pattern[i][j] == '*')
						System.out.print('*');
					else
						System.out.print(patternCount[i][j]);
				}
				System.out.println();
			}
		}
		in.close();
	}
}
import java.util.Scanner;

public class uva10908 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int count=0;count<cases;count++){
			int m = in.nextInt(),n = in.nextInt(),q = in.nextInt();
			char square[][] = new char [m][n];
			for(int i=0;i<m;i++){
				String chars = in.next();
				for(int j=0;j<n;j++)
					square[i][j] = chars.charAt(j);
			}
			System.out.println(m + " " + n + " " + q);
			for(int test=0;test<q;test++){
				int r = in.nextInt(),c = in.nextInt();
				int slength = 0;
				char charloc = square[r][c];
				boolean check = true;
				while(check){
					for(int i=r-slength;i<=r+slength && check;i++){
						for(int j=c-slength;j<=c+slength && check;j++){
							if(i > m-1 || j > n-1 || i < 0 || j < 0 || charloc != square[i][j])
								check = false;
						}
					}
					if(check)slength++;
					else slength--;
				}
				System.out.println(2*slength+1);
			}
		}
		in.close();
	}
}

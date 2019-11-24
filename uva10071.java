import java.util.Scanner;
public class uva10071 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			int v = in.nextInt(),t = in.nextInt();
			if(v == t && v == -1)break;//jump out
			System.out.println(2*v*t);
		}
		in.close();
	}

}

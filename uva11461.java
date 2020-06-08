import java.util.Scanner;

public class uva11461 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int a,b;
	    while((a = in.nextInt()) != 0 && (b = in.nextInt()) != 0)
			System.out.println((int)(Math.sqrt(b) - Math.ceil(Math.sqrt(a))) + 1);
		in.close();
	}
}

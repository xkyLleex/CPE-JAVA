import java.util.Scanner;

public class uva10222 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String keyboard = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		while(in.hasNext()){
			String code = in.nextLine().toLowerCase();
			for(int i=0;i<code.length();i++){
				for(int j=0;j<keyboard.length();j++){
					if(keyboard.charAt(j) == code.charAt(i)){
						System.out.print(keyboard.charAt(j-2));
						break;
					}else if(j == keyboard.length()-1)
						System.out.print(code.charAt(i));
				}
			}
			System.out.println();
		}
		in.close();
	}
}

import java.util.Scanner;

public class uva10223 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String keyboard = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";//多一個\是因為編譯問題
		String word = "";
		String code = in.nextLine().toLowerCase();
		for(int i=0;i<code.length();i++){
			for(int j=0;j<keyboard.length();j++){
				if(keyboard.charAt(j) == code.charAt(i)){
					if(j-2<0)
						word += keyboard.charAt(j-2+keyboard.length());
					else
						word += keyboard.charAt(j-2);
					break;
				}
				if(j == keyboard.length()-1)
					word += code.charAt(i);
			}
		}
		System.out.println(word);
		in.close();
	}

}

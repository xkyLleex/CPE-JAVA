import java.util.Scanner;
import java.util.Arrays;

public class uva10252 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			String text1 = in.nextLine();
			String text2 = in.nextLine();
			if(text1.charAt(0) == '0' && text2.charAt(0) == '0')break;//jump out
			int count1[] = new int[26];
			int count2[] = new int[26];
			Arrays.fill(count1, 0);
			Arrays.fill(count2, 0);
			for(int i=0;i<text1.length();i++){
				if(text1.charAt(i)>96&&text1.charAt(i)<123)
					count1[text1.charAt(i)-97] += 1; 
			}
			for(int i=0;i<text2.length();i++){
				if(text2.charAt(i)>96&&text2.charAt(i)<123)
					count2[text2.charAt(i)-97] += 1;	
			}
			for(int i=0;i<26;i++){
				int min = Math.min(count1[i], count2[i]);
				for(int j=0;j<min;j++)
					System.out.print((char)(i+97));
			}
			System.out.println();
		}
		in.close();
	}
}

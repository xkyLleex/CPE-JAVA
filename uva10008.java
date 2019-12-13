import java.util.Scanner;

public class uva10008 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String String_line[] = new String[in.nextInt()];
		in.nextLine();
		for(int i=0;i<String_line.length;i++)
			String_line[i] = in.nextLine();
		int charcount[] = new int[26];//a-z 0-25
		int bignum = 0;
		for(int i=0;i<String_line.length;i++){
			for(int j=0;j<String_line[i].length();j++){
				if(String_line[i].charAt(j) > 64 && String_line[i].charAt(j) < 91){
					charcount[String_line[i].charAt(j)-65] += 1;
					if(bignum < charcount[String_line[i].charAt(j)-65])
						bignum = charcount[String_line[i].charAt(j)-65];
				}else if(String_line[i].charAt(j) > 96 && String_line[i].charAt(j) < 123){
					charcount[String_line[i].charAt(j)-97] += 1;
					if(bignum < charcount[String_line[i].charAt(j)-97])
						bignum = charcount[String_line[i].charAt(j)-97];
				}else
					continue;
			}
		}
		while(bignum != 0){
			for(int i=0;i<26;i++){
				if(bignum == charcount[i])
					System.out.println((char)(65+i) + " " +bignum);
			}
			bignum--;
		}
		in.close();
	}
}

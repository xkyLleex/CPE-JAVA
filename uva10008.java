import java.util.Scanner;

public class uva10008 {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cases = in.nextInt();in.nextLine();
        int bet[] = new int[26];
        while((cases--)>0){
            String str = in.nextLine();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) > 64 && str.charAt(i) < 91)
                    bet[str.charAt(i)-65]++;
                else if(str.charAt(i) > 96 && str.charAt(i) < 123)
                    bet[str.charAt(i)-97]++;
            }
        }
        int max = 0;
        for(int i=0;i<26;i++)max=(bet[i] > max)?bet[i]:max;
        while((max--)>0){
            for(int i=0;i<26;i++)
                if(bet[i] == max+1)
                    System.out.println((char)(65+i) + " " + (max+1));
        }
        in.close();
	}
}

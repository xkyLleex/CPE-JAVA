import java.util.Scanner;

public class uva10415 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		String allfinger[] = {
				"0111001111",//c
				"0111001110",//d
				"0111001100",//e
				"0111001000",//f
				"0111000000",//g
				"0110000000",//a
				"0100000000",//b
				"0010000000",//C
				"1111001110",//D
				"1111001100",//E
				"1111001000",//F
				"1111000000",//G
				"1110000000",//A
				"1100000000"//B
		};
		String numfinger = "cdefgabCDEFGAB";
		while((cases--) != 0){
			String song = in.next();
			String nowfinger = "0000000000";
			int finger[] = new int[10];
			for(int i=0;i<song.length();i++){
				for(int j=0;j<numfinger.length();j++){
					if(song.charAt(i) == numfinger.charAt(j)){
						for(int k=0;k<10;k++){
							if(nowfinger.charAt(k) != allfinger[j].charAt(k) && nowfinger.charAt(k) == '0')
									finger[k]++;
						}
						nowfinger = allfinger[j];
						break;
					}
				}
			}
			for(int i=0;i<10;i++)
				System.out.print(finger[i] + ((i!=9)?" ":""));
			System.out.println();
		}
		in.close();
	}
}

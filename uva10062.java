import java.util.Scanner;

public class uva10062 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			String str = in.nextLine();
			if(str == "")break;//jump out
			int max = 0,ascii[] = new int[96];
			for(int i=0;i<str.length();i++){
				ascii[str.charAt(i)-32]++;
				if(max < ascii[str.charAt(i)-32])
					max = ascii[str.charAt(i)-32];
			}
			for(int i=1;i<=max;i++){
				for(int j=ascii.length-1;j>=0;j--){
					if(ascii[j] == i)
						System.out.println((j+32) + " " + i);
				}
			}
			//if(in.hasNext())//cpe上需使用左列判斷
				System.out.println();
		}
		in.close();
	}
}

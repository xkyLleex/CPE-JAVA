import java.util.Scanner;

public class uva272 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean check = true;
		while(true){//on cpe need use in.hasNext()
			String str = in.nextLine();
			if(str.charAt(0) == '0')break;//jump out
			for(int i=0;i<str.length();i++){				
				if(str.charAt(i) == '"'){
					if(check){
						System.out.print("``");
						check = false;
					}else{
						System.out.print("''");
						check = true;
					}
				}else
					System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		in.close();
	}
}
/*
"To be or not to be," quoth the Bard, "that
is the question".
The programming contestant replied: "I must disagree.
To `C' or not to `C', that is The Question!"
*/
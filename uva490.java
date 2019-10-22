import java.util.Scanner;

public class uva490 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str[] = new String[100];
		int line = 0,max = 0;
		while(true){//on cpe need use in.hasNext()
			String text = in.nextLine();
			if(text.charAt(0) == '0')break;//jump out
			max = (max<text.length())?text.length():max;
			str[line++] = text;
		}
		for(int i=0;i<max;i++){
			boolean check = false;
			for(int j=line-1;j>=0;j--){
				if(str[j].length()>i){
					System.out.print(str[j].charAt(i));
					check = true;
				}else{
					if(check)
						continue;
					else
						System.out.print(" ");	
				}
			}
			System.out.println();
		}
		in.close();
	}
}
/*
sdljl gsl ls dlg
    sjldgj ldsj glsjd glsdlsa 
    glsd lg dslg sl gdsl 
    jdsl sdlkgjl 
-----
Rene Decartes once said,
"I think, therefore I am."
*/
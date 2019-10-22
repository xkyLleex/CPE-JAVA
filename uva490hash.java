import java.util.*;

public class uva490hash {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer,String> hashmap = new HashMap<>();//key value
		int size = 0,max = 0;
		while(true){
			String str = in.nextLine();
			if(str.charAt(0) == '0')break;
			hashmap.put(size++, str);
			max = (max<str.length())?str.length():max;
		}
		for(int i=0;i<max;i++){
			boolean check = false;
			for(String text:hashmap.values()){
				if(text.length()>i){
					System.out.print(text.charAt(i));
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
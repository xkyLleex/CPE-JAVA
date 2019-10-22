import java.util.*;

public class uva10420 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String String_line[] = new String[in.nextInt()];
		in.nextLine();
		for(int i=0;i<String_line.length;i++)
			String_line[i] = in.nextLine().split(" ")[0];
		Arrays.sort(String_line);
		int sum = 1;
		for(int i=0;i<String_line.length;i++){
			if(i==String_line.length-1){
				System.out.println(String_line[i] + " " +sum);
			}else if(String_line[i].equals(String_line[i+1])){
				sum++;
			}else{
				System.out.println(String_line[i] + " " +sum);
				sum = 1;
			}
		}
		in.close();
	}
}

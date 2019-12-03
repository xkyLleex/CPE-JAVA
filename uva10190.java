import java.util.Scanner;

public class uva10190 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num1 = in.nextInt(),num2 = in.nextInt();
			int num3 = num1;
			boolean check = true;
			do{
				if(num2 == 1 || num3 % num2 != 0){
					check = false;
					break;
				}
				num3 /= num2;
			}while(num3 != 1);
			if(check){
				while(num1 != 1){
					System.out.print(num1 + " ");
					num1 /= num2;
				}
				System.out.println("1");
			}else
				System.out.println("Boring!");
		}
		in.close();
	}
}

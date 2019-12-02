import java.util.Scanner;

public class uva10190 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			int num1 = in.nextInt(),num2 = in.nextInt(),num3;
			if(num1 == 0 && num2 == 0)break;//jump out
			num3 = num1;
			boolean check = true;
			while(num3 != 1){
				if(num3 % num2 != 0){
					check = false;
					break;
				}
				num3 /= num2;
			}
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

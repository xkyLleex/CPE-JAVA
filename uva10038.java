import java.util.Scanner;

public class uva10038 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			while(true){//on cpe need use in.hasNext()
				int count = in.nextInt();
				if(count == 0)break;//jump out
				int num[] = new int[count];
				for(int i=0;i<count;i++)
					num[i] = in.nextInt();
				boolean jolly = false;//true is Not jolly
				int x = 1;//USE���k
				for(int i=2;i<count;i++)
					x *= i;
				if(count != 1){
					for(int i=0;i<count-1;i++)
						x /= (Math.abs(num[i] - num[i+1]) != 0)?Math.abs(num[i] - num[i+1]):1;
					jolly = (x == 1)? false:true;
				}
				if(jolly)
					System.out.println("Not jolly");
				else
					System.out.println("Jolly");
			}
			in.close();
	}
}
/*
5 1 4 2 -1 6
4 1 4 2 3
�Ĥ@�ӼƦr����ƶq
�P�_�e��Ʀr�۴�A�p�G�۴��a����ȷ|�ܦ�1 2 3 4 5...��5 4 3 2 1
�|��XJolly�A�Y���O�A�h��XNot jolly
ex:	5 1 4 2 -1 6 =>|1-4|=3 ,|4-2|=2 ,|2-(-1)|=3 ...
	�]3->2->3...�H��jolly��h�A�ҥH��XNot jolly
	
	4 1 4 2 3 =>|1-4|=3 ,|4-2|=2 ,|2-3|=1
	�]3->2->1�A�ҥH�ŦXjolly��h�A��XJolly
*/
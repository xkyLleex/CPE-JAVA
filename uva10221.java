import java.util.Scanner;

public class uva10221 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = 6440;
		while(true){//on cpe need use in.hasNext()
			int s = in.nextInt();
			if(s == 0)break;//jump out
			double angle = in.nextDouble();
			String type = in.next();
			if(type.equals("min"))//弧分
				angle /= 60;
			else
				angle = Math.min(angle, 360-angle);
			//直徑*徑度/2=弧長
			double cir = 2*(r+s)*angle*Math.PI/180/2;
			//餘弦定理:a^2+b^2-2abcos(c)=c^2 =>a=b=>2a^2-2a^2cos(c)=2a^2(1-cos(c))=c^2
			double tripath = Math.sqrt(2*Math.pow(r+s,2)*(1-Math.cos(angle*Math.PI/180)));
			System.out.printf("%.6f %.6f\n",cir,tripath);
		}
		in.close();
	}

}

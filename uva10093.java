import java.util.Scanner;

public class uva10093 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){//on cpe need use in.hasNext()
			String num = in.next();
			if(num.charAt(0) == '0')break;//jump out
			int sum = 0,max = 1;
			for(int i=0;i<num.length();i++){
				int trans = 0;
				if(num.charAt(i) > 47 && num.charAt(i) < 58)
					trans = num.charAt(i) - 48;
				else if(num.charAt(i) > 64 && num.charAt(i) < 91)
					trans = num.charAt(i) - 55;//-65+10 => A = 10
				else if(num.charAt(i) > 96 && num.charAt(i) < 123)
					trans = num.charAt(i) - 61;//-97+36 => a = 36
				sum += trans;
				max = (max < trans)?trans:max;
			}
			for(int i=max;i<=62;i++){
				if(sum % i == 0){
					System.out.println(i+1);
					break;
				}
				if(i==62)System.out.println("such number is impossible!");
			}
		}
		in.close();
	}
}
/*
3
+5
-A
4964654623232355454546554546546545464564564565465465454654600655460
-005444554f546554654A5445656466
00000q123
1
0
q12345
10
----------
4 3(4)-->3/(4-1)=1
6 5(6)-->5/(6-1)=1
11 10(11)-->10/(11-1)=1
62 4964654623232355454546554546546545464564564565465465454654600655460(62)-->/(62-1)=?
60 005444554f546554654A5445656466(60)-->/(60-1)=?
59 00000q123(59)-->/(59-1)=?
2 1(2)-->1/(2-1)=1
2 0(2)-->0/(2-1)=0
such number is impossible!
2 10(2)-->2/(2-1)=2
 */

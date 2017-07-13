package first.Boss;

import java.util.Scanner;
public class Hello {
	public static void main(String[] args){
		Scanner one=new Scanner(System.in);
		int x,sum;
		x=one.nextInt();
		one.close();
		sum=sum(x);
		System.out.println(sum);
	}

public static int sum(int x)
{
	int i,sum=1;
	for(i=1;i<=x;i++)
		sum*=i;
	return sum;
}

}
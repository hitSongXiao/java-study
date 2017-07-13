package edu.hit1160300527.experiment1;
import java.util.Scanner;
public class ControlStrcutureTest {
	public static void main(String args[]){
		int year[]={220, 618, 960, 1271, 1368, 1644, 1912, 1949, 2000, 2017, 2020};
		for(int i=0;i<year.length;i++)
		{
			System.out.printf("%d is a leap year:%b%n",year[i],checkLeapYear(year[i]));
		}
		int first=printLeapYears(2001,2050);
		System.out.println("the first leap year is:"+first);
		//guessNumber();
		firstDraw(9);
		System.out.printf("%n%n");
		secondDraw(9);
		ChineseTrangle(11);
	}
	public static boolean checkLeapYear(int year){
		if(year%4==0&&year%100!=0||year%400==0)
			return true;
		else 
			return false;
	}
	public static int printLeapYears(int begin,int end)
	{
		boolean flag=true;
		int first=0;
		for(int i=begin;i<=end;i++)
		{
			if(checkLeapYear(i))
			{
				if(flag)
				{
					first=i;
					flag=false;
				}
				System.out.println(i);
			}
		}
		return first;
	}
	public static void guessNumber (){ 
		System.out.println("给你一个1至100之间的整数,请猜测这个数");
		int realNumber=(int)(Math.random()*100)+1;
		int yourGuess=0; //你猜的数
		Scanner in=new Scanner(System.in);     
		System.out.println("输入您的猜测:");
		yourGuess=in.nextInt();//从键盘键入你猜的数
		while (yourGuess!=realNumber)
		{
		if (yourGuess>realNumber){
		System.out.println("大了,请再猜:");
		yourGuess=in.nextInt();//从键盘键入你猜的数
		}
		else if(yourGuess<realNumber){
		System.out.println("猜小了,请再猜:");
		yourGuess=in.nextInt();//从键盘键入你猜的数
		}
		}
		System.out.println("恭喜！猜对了!");
		in.close();
		}
	public static void firstDraw(int n){
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.print("  ");
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.print("  ");
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void secondDraw(int n){
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.print("  ");
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.print("  ");
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void ChineseTrangle(int N){
		int theArray[][]=new int[N][N];//已经初始化为0
		for(int i=0;i<N;i++)
		{
			for(int k=1;k<2*(N-i);k++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
				if(j==0||j==i)
				{
					theArray[i][j]=1;
				}
				else
					theArray[i][j]=theArray[i-1][j-1]+theArray[i-1][j];
				System.out.printf("%4d",theArray[i][j]);
			}
			System.out.println("");
		}	
	}
}
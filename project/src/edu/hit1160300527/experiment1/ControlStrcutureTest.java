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
		System.out.println("����һ��1��100֮�������,��²������");
		int realNumber=(int)(Math.random()*100)+1;
		int yourGuess=0; //��µ���
		Scanner in=new Scanner(System.in);     
		System.out.println("�������Ĳ²�:");
		yourGuess=in.nextInt();//�Ӽ��̼�����µ���
		while (yourGuess!=realNumber)
		{
		if (yourGuess>realNumber){
		System.out.println("����,���ٲ�:");
		yourGuess=in.nextInt();//�Ӽ��̼�����µ���
		}
		else if(yourGuess<realNumber){
		System.out.println("��С��,���ٲ�:");
		yourGuess=in.nextInt();//�Ӽ��̼�����µ���
		}
		}
		System.out.println("��ϲ���¶���!");
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
		int theArray[][]=new int[N][N];//�Ѿ���ʼ��Ϊ0
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
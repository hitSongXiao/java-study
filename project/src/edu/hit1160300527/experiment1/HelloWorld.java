package edu.hit1160300527.experiment1;
import java.util.Random;
public class HelloWorld {
	public static void main(String args[]){
		System.out.println("HelloWorld");
		Random x=new Random();
		for(int i=0;i<10;i++)
		{
			int m=x.nextInt(100);
			System.out.println(m);	
		}
		int n=(int)(Math.random()*100)+5;
		System.out.println(n);
	}
}

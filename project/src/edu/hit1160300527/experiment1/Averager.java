package edu.hit1160300527.experiment1;
import java.util.Scanner;
public class Averager {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		float a=in.nextFloat();
		float b=in.nextFloat();
		float ave=Ave(a,b);
		System.out.printf("%.2f",ave);
		in.close();
	}
	public static float Ave(float a,float b){
		return (a+b)/2;
	}
}
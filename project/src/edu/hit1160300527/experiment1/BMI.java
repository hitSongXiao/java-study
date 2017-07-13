package edu.hit1160300527.experiment1;
import java.util.Scanner;
public class BMI {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String order;
		int n;
		int idsIndex[],namesIndex[],heightsIndex[],weightsIndex[],bmisIndex[];
		String[] ids;
		String[] names;
		float[] heights;
		float[] weights;
		float[] bmis;
		System.out.println("Please input the number of students");
		n=in.nextInt();
		ids=new String[n];
		names=new String[n];
		heights=new float[n];
		weights=new float[n];
		bmis=new float[n];
		idsIndex=new int[n];
		namesIndex=new int[n];
		heightsIndex=new int[n];
		weightsIndex=new int[n];
		bmisIndex=new int[n];
		input(n,ids,names,heights,weights,bmis);
		idsIndex=sortString(ids,n);
		namesIndex=sortString(names,n);
		heightsIndex=sortFloat(heights,n);
		weightsIndex=sortFloat(weights,n);
		bmisIndex=sortFloat(bmis,n);
		order="ids";
		printStudents(order,idsIndex,n,ids,names,heights,weights,bmis,false);
		printStudents(order,idsIndex,n,ids,names,heights,weights,bmis,true);
		order="names";
		printStudents(order,namesIndex,n,ids,names,heights,weights,bmis,true);
		order="heights";
		printStudents(order,heightsIndex,n,ids,names,heights,weights,bmis,true);
		order="weights";
		printStudents(order,weightsIndex,n,ids,names,heights,weights,bmis,true);
		order="bmis";
		printStudents(order,bmisIndex,n,ids,names,heights,weights,bmis,true);

		in.close();
	}
	public static void input(int n,String[] ids,String[] names,float[] heights,float[] weights,float[] bmis){
		String answer;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.printf("第%d个：%n",i+1);
			System.out.println("Please input the id");
			ids[i]=in.nextLine();
			System.out.println("Please input the name");
			names[i]=in.nextLine();
			System.out.println("Please input the height(cm)");
			heights[i]=in.nextFloat();
			in.nextLine();
			System.out.println("Please input the weight(kg)");
			weights[i]=in.nextFloat();
			in.nextLine();
			bmis[i]=weights[i]/(float)(Math.pow(heights[i]/100,2));
			System.out.printf("%d:学号：%s，姓名：%s，身高：%.1f厘米，体重：%.1f斤，BMI：%.2f%n",i+1,ids[i],names[i],heights[i],weights[i]*2,bmis[i]);
			answer=checkHealth(bmis[i]);
			System.out.println(answer);
		}
		in.close();
	}
	public static String checkHealth(double bmi){
		String answer;
		if(bmi<18.5)
		{
			answer="UnderWeight";
		}
		else if(bmi<23)
		{
			answer="Normal Range";
		}
		else if(bmi<25)
		{
			answer="Overweight-At Risk";
		}
		else if(bmi<30)
		{
			answer="Overweight-Moderately Obese";
		}
		else
		{
			answer="Overweight-Severely Obese";
		}
		return answer;
	}
	public static int[] sortString(String str[],int n)
	{
		int sortedIndex[]=new int[n],minIndex,maxIndex=0;
		boolean flag[]=new boolean[n];
		String max=str[0],min;
		for(int i=0;i<n;i++)
		{
			if(max.compareTo(str[i])<0)
			{
				max=str[i];
				maxIndex=i;
			}
		}
		for(int i=0;i<n;i++)
		{
			min=max;
			minIndex=maxIndex;
			for(int j=0;j<n;j++)
			{
				if(str[j].compareTo(min)<0&&!flag[j])
				{
					min=str[j];
					minIndex=j;
				}
			}
			sortedIndex[i]=minIndex;
			flag[minIndex]=true;
			
		}
		return sortedIndex;
	}
	public static int[] sortFloat(float num[],int n)
	{
		int sortedIndex[]=new int[n],minIndex,maxIndex=0;
		boolean flag[]=new boolean[n];
		float max=num[0],min;
		for(int i=0;i<n;i++)
		{
			if(max<num[i])
			{
				max=num[i];
				maxIndex=i;
			}
		}
		for(int i=0;i<n;i++)
		{
			min=max;
			minIndex=maxIndex;
			for(int j=0;j<n;j++)
			{
				if(min>num[j]&&!flag[j])
				{
					min=num[j];
					minIndex=j;
				}
			}
			sortedIndex[i]=minIndex;
			flag[minIndex]=true;
		}
		return sortedIndex;
	}
	public static void printStudents(String order,int[]sortedIndex,int n,String[] ids,String[] names,float[] heights,float[] weights,float[] bmis,boolean flag)
	{
		if(!flag)
		{
			System.out.println("not sorted:");
		}
		if(flag)
		System.out.println("sorted by "+order+":");
		for(int i=0;i<n;i++)
		{
			int x= flag? sortedIndex[i]:i;
			System.out.printf("%s\t%s\t%.1f\t%.1f\t%.1f\n",ids[x],names[x],heights[x],weights[x],bmis[x]);
		}
	}
}

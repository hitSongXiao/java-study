package edu.hit1160300527.experiment1; 
import java.util.Scanner; 
public class Conversion{    
    public static void main(String[] args) {
     	System.out.println("Hi, I��m Jack, What��s your name?");
     	String myName;
     	Scanner in=new Scanner(System.in);//�����׼�������
     	myName=in.nextLine();			  //���� �������
     	in.close();
      	System.out.printf("My name is %s, Nice to meet you!%n", myName);
}
}

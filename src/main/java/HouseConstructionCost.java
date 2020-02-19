import java.io.*;
import java.util.Scanner;

public class HouseConstructionCost {
	 public static void main(String args[]) {
		 Scanner in=new Scanner(System.in);
		 System.out.printf("Press 1 to Calculate Interest along with calculate House Construction Cost else press 2\n");
		 int z=in.nextInt();
		 if(z==1) {
			 System.out.printf("Enter Principle,Rate of Interest,Time in Years\n");
			 int principle=in.nextInt();
			 int rate=in.nextInt();
			 int time=in.nextInt();
			 Interest a=new Interest();
			 a.SimpleAndCompoundInterest(principle,rate,time);
		 }
		 System.out.println("Enter area of House in Integer\n");
		 int area=in.nextInt();
		 System.out.printf("Choice for Construction Cost per Square Area\n");
		 System.out.printf("Choice '1' for 1200INR if you want to use Standard Material\n");
		 System.out.printf("Choice '2' for 1500INR if you want to use Above Standard Material\n");
		 System.out.printf("Choice '3' for 1800INR if you want to use High Standard Material\n");
		 System.out.printf("Choice '4' for 2000INR if you want to use High Standard Material And Fully Automated Home\n");
		 int cost=in.nextInt();
		 Cost a=new Cost();
		 a.MaterialCost(cost,area);
	 }
}

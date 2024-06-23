package student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String name=sc.nextLine();
		System.out.println("ENTER THE NUMBER OF SUBJECTS");
		int n=sc.nextInt();
		int marks[]=new int[n];
		int total=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER THE MARK OF SUBJECT "+(i+1));
			marks[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			total+=marks[i];
		}
		float avg=(float)total/n;
		String grade="";
		if(avg==100)
		{
			grade="O";
		}
		else if (avg >= 90) 
		{
            grade = "A";
        } 
		else if (avg >= 80) 
        {
            grade = "B";
        } 
        else if (avg >= 70) 
        {
            grade = "C";
        } 
        else if (avg>= 60) 
        {
            grade = "D";
        } 
        else {
            grade = "F";
        }
		System.out.println("Name: "+name);
		System.out.println("Total marks: "+total+"/"+(n*100));
		System.out.println("Avg: "+avg);
		System.out.println("Grade: "+grade);

	}

}

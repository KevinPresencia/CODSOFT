package task1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int min=1;
		int max=100;
		int n=(int)Math.random()*(max-min+1)+min;
		int attempts=0;
		boolean guess=false;
		System.out.println(n);
		while(true)
		{
			
			System.out.println("Enter your guessed number between 1 and 100");
			int num=sc.nextInt();
			if(num==n)
			{
				System.out.println("YOU HAVE GUESSED IT RIGHT(ATTEMPTS DONE: "+attempts);
				guess=true;
				break;
			}
			else
			{
				if(num<n)
				{
					System.out.println("YOUR GUESS IS LOW");
				}
				else
				{
					System.out.println("YOUR GUESS IS HIGH");
				}
			}
			attempts++;
			if(attempts==4)
			{
				break;
			}
		}
		if(!guess)
		{
			System.out.println("YOU HAVE RAN OUT OF GUESSES,WANNA PLAY AGAIN?");
		}	

	}

}


// run status :

import java.util.Scanner;


class FindAge
{
	public static void main(String[] args) {
		
		int ramu, raju, raghu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		ramu = sc.nextInt();
		raju = sc.nextInt();
		raghu = sc.nextInt();
        
        if(ramu <= 0||raju<=0||raghu <=0)
        {
        	System.out.println("invalid age");
        }
        //else if(ramu == raju|| raju== raghu)
		else if(ramu<raju&&ramu<raghu)
		{
			System.out.println("age of ramu : "+ramu);
		}
		else if(raju<raghu)
		{
			System.out.println("age of raju is : "+ raju);
		}
		else{
			System.out.println("Age of raghu is : "+raghu);
		}
	}
}
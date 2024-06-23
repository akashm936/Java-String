// run status :true

//22-06-2024


import java.util.Scanner;

class VoteEligibility
{
	 static Scanner sc = new Scanner(System.in);

	public String checkEligibility()
	{
		System.out.println("Enter a Age : ");
		int age = sc.nextInt();

		if(age>=18&&age<=100)
		{
			return "you are eligible to vote ";
		}
		else{
			return "you are not eligible to vote ";
		}

	}
	public static void main(String[] args) {
		

		VoteEligibility obj = new VoteEligibility();
		System.out.println(obj.checkEligibility());
		
	}
}
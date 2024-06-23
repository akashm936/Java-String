// run status : true
// 22-06-2024

import java.util.Scanner;

// compare which element is smaller

class FindMinElement
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if(num1<num2)
		{
			System.out.println("the smallest number is : " +num1);
		}
		else{
			System.out.println("the smallest number is : " +num2);
		}
	}
}
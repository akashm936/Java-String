// run status : true

//22-06-2024

import java.util.Arrays;
import java.util.Scanner;

class StringExample
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//System.out.println("Enter four number : ");
		// int num1 = sc.nextInt();
		// int num2 = sc.nextInt();
		// int num3 = sc.nextInt();
		// int num4 = sc.nextInt();

		// if(num1>num2)
		// {
		// 	System.out.println("the smallest element is : "+ num1);
		// 	if(num2>num3)
		// 	{
		// 		System.out.println("the smallest element is : "+num2);
		// 		if(num3>num4)
		// 		{
		// 			System.out.println("the smallest element is : "+ num3 );
		//         }
		//         else {
		//         	System.out.println("the smallest element is : "+ num4 );
		//         }
		        
		//     }
		//     else{
		//     	System.out.println("the smallest element is : "+ num2 );
		//     }

		// }
		// else{
		// 	System.out.println("the smallest number is : "+num4);
		// }

//---------------------------------------------------------------------------------------------

		System.out.println("enter a number : ");
		int num = sc.nextInt();
        int []arr = new int[num];

        int min=0;
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("the smallest element is : "+ min);
	}
}
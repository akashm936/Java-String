// run status : true

import java.util.Scanner;

class Findlargest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int num1,num2,num3,num4;
		System.out.println("Enter number : ");
         num1= sc.nextInt();
         num2 =sc.nextInt();
         num3 =sc.nextInt();
         num4=sc.nextInt();

         if(num1>num2&&num2>num3&&num3>num4)
         {
         	System.out.println("the largest element is : "+num1);
         }
         else if(num2>num3&&num2>num4)
         {
         	System.out.println("he largest element is : "+num2);
         }
         else if(num3>num4)
         {
         	System.out.println("he largest element is : "+num3);
         }
         else
         {
         	System.out.println("he largest element is : "+num4);
         }
	}
}
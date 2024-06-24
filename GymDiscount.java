// run status  : true

// some function is reamining
import java.util.Scanner;

class GymDiscount
{
	  static  int weight ,fees;
	  static float discountfees;
      static  float height;

      static  float discount;
      static  float bmi; 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

    
		System.out.println("Enter A weight : ");
		weight =sc.nextInt();

		System.out.println("Enter a height ( meter) :");
		height = sc.nextFloat();

		System.out.println("Enter fees of Gyms");
		fees = sc.nextInt();

		bmi = weight/(height*height);

		System.out.println(bmi);

        if(bmi>18.5)
        {
        	underweight();
        }
        else if(bmi <18.5 && bmi <24.9 )
        {
        	normalweight();
        }
        else if(bmi <18.5 && bmi <24.9 )
        {
        	overweight();
        }
        else if(bmi >= 30)
        {
        	obesity();
        }

		// switch(bmi)
		// {
		// case bmi < 18.5:{
			// discount = (15/100)*fees;
			// System.out.println(discount);
		// }
		//}
	}

	public  static void underweight()
	{
		discount = fees*15/100;
		discountfees = fees-discount;
		System.out.println(discountfees);
	}
	public  static void normalweight()
	{
		discount = 10/100*fees;
		discountfees = fees-discount;
		System.out.println(discountfees);
	}
	public static void overweight()
	{
		//discount = 5/100*fees;
		discount = fees*15/100;
		discountfees = fees-discount;
		System.out.println(discountfees);

	}
	public  static void obesity()
	{
		System.out.println("No discount");

	}

}
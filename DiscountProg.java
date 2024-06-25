import java.util.Scanner;

class DiscountProg
{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        double total_price = input.nextDouble();
        double price_after_discount = total_price;

		if(age >= 13 && age <=19)
		{
			// basic 5% discount
			price_after_discount = total_price - (total_price *0.05);
		     
		    if(price_after_discount > 5000)
		    {
		    	// extra 5% discount
		    	price_after_discount = price_after_discount -(price_after_discount * 0.05);

		    }
		}
		else if(age >= 20 && age <=29){
             // basic 6% discount
		 	price_after_discount = total_price - (total_price*0.06);
          
			if(price_after_discount > 4000){
				// extra 6% discount
				price_after_discount = price_after_discount-(price_after_discount*0.06);
			}
		}

		else if(age > 29){
			// for 15% discount
			price_after_discount = total_price - (total_price * 0.15);
		}

        //1 --> total price
		System.out.println(total_price);
        // 2 -->total price after discount
        System.out.println(price_after_discount);
        // 3 ---> discounted amount

        System.out.println(total_price - price_after_discount);




	}
}
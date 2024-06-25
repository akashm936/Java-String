import java.util.Scanner;

class EndsWith
{
	static String str;
	static String str1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		str = sc.nextLine();

		System.out.print("Enter String to check : ");
		str1 = sc.next();
		System.out.println("Enter a index : ");
		int searchIndx = sc.nextInt();

		boolean op = userStartWith(str1,searchIndx);
		System.out.println(str+" : "+ op);
	}

	public static boolean userStartWith(String str1)
	{
		boolean flag =true;
        for(int i=str1.length();i<0;i++)
        {
        	char ch = str1.charAt(i);
        	if(ch!= str1.charAt(i))
        	{
        		flag = false;
        		break;
        	}
        }
		return flag;
	}

	public static boolean userStartWith(String str1, int startIndx)
	{
		if(startIndx<0 && startIndx>str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong indx "+ startIndx);
		}
		boolean flag = true;
		for(int i=startIndx;i<str1.length();i++)
		{
			char ch= str1.charAt(i);
			if(ch!=str.charAt(i))
			{
				flag= false;
				break;
			}
		}
		return flag;
	}

}
import java.util.*;

class TrimMethod
{
	static String str;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		str = sc.nextLine();

		String str1 = userTrim();
		System.out.println(str + " : "+str.length());
		System.out.println(str1 + " : "+ str1.length());
	}

	public static String userTrim()
	{
		for(int i=0;i<str.length();i++)
		{
			if(str==" ")
			{
				
			}
		}
	}
}
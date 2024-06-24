// run Status : True

//24-06-2024

// this program is uswd string method codePointAt(int indx);

class UserCodePointAt
{
	static String str = new String("ABCDEFGHJ");
	public static void main(String[] args) {

		int indx = userCodePointAt(0);   // method
		System.out.println(str+ " : "+indx);

	}
	public static int userCodePointAt(int indx)
	{
		if(indx<0 || indx> str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("Wrong Index : "+indx);

		}
		return str.charAt(indx);
	}
}
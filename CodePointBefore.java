// run status : true

// 24-06-2024

// String method CodePointBefore


class CodePointBefore
{
	static String str = new String("ABCD");
	public static void main(String[] args) {
		
		int indx = userCodePointBefore(3);
		System.out.println("str"+ " : "+indx);
	}

	public static int userCodePointBefore(int indx)
	{
		if(indx<1 || indx>str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong Index  :"+ indx);
		}
		return str.charAt(indx-1);
	}
}
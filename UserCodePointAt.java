class UserCodePointAt
{
	static String str = new String("ABCDEFGHJ");
	public static void main(String[] args) {

		int indx = userCodePointAt(0);
		System.out.println(str+ " : "+indx);

	}
	public static int UserCodePointAt(int indx)
	{
		if(indx<0 || indx> str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("Wrong Index : "+indx);

		}
		return str.charAt(indx);
	}
}
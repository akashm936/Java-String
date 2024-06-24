// run status : true

// 24-06-2024

// String method CodePointCount(int startindex, int endIndex);

class CodePointCount
{
	static String str = new String("ABCDEFGHI");
	public static void main(String[] args) {
		
		int indx = userCodePointCount(-3,3);
		System.out.println(str+ " : "+indx);
	}
	public static int userCodePointCount(int startIndx, int endIndx)
	{
		if(startIndx>endIndx )  //   (endIndx>0)&&(endIndx<=indx.length()) (endIndx>0)&&(endIndx<=indx.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong index : "+"{"+startIndx+","+endIndx+"}");
		}
		return endIndx-startIndx;
	}
}
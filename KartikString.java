

class Karthik
{
	String gf1;
	String gf2;
	String gf3;

	Karthik(String gf1,String gf2, String gf3)
	{
		this.gf1=gf1;
		this.gf2=gf2;
		this.gf3=gf3;
	}

	//overriding Equals ()
	@Override
	public boolean equals(Object obj){
		Karthik k=(Karthik)obj;  //downcasting //
		return this.gf1==k.gf1 && this.gf2==k.gf2 && this.gf3==k.gf3;

	}

	Karthik(String gf1)
	{
		this.gf1=gf1;
	}


	public static void main(String[] args) {
		
		Karthik k1=new Karthik("Kanchana","Kamla","Kangana");
		Karthik k2 =new Karthik("Kanchana","Kamla","Kangana");

		Karthik k3 = new Karthik("Kachadi");
		Karthik k4=new Karthik("Kachadi");

		System.out.println(k1.equals(k2));   //true
		System.out.println(k3.equals(k4));   //false
	}
}
// run status : true

// 22-06-2024

import java.util.Scanner;


class StringMethod
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String ");
        String name = sc.nextLine();

		String s = new String(name);
		System.out.println("length of String : "+ s.length());  // method 1 length()
		for(int i=0;i<name.length();i++)
		{
			System.out.println(s.charAt(i)+ " ");                 // Method 2 charAt()
		}
		System.out.println(s.concat(" Morwal"));                  // method 3 concate() 
`
		System.out.println(s);
	}
}
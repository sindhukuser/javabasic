package If;

public class sring_demmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Hi guys";
		String s2= "welcome all";
		
		String s3= s1+s2;
		System.out.println(s3);
		
		int s4= s1.length();
		System.out.println(s4);
		
		String s5= s1.replace(" ","_");
		System.out.println(s5);
		
		char c=s3.charAt(4);
		System.out.println(c);
		
		if (s1.contentEquals(s2))
		{
			String s6= s1=s2;
			System.out.println(s6);
		}
		

	}

}

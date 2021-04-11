package If;

public class reverse_demmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Hi guys welcome";
		String rev =" ";
		String [] ar= s.split(" ");
		String rev1 = " ";
		
		for (int i=0; i<ar.length; i++)
		{
			String st= ar[i];
			if (st.equals("Hi"))
			{
		for (int j=st.length()-1; j>=0; j--)
		{
			char c = st.charAt(j);
			rev1 = rev1 + c;
		}}
		else 
		{
			rev = rev1 +st;
		}
		}
		System.out.println(rev);
		}
	}
		

	


package If;

public class encapstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapstest obj = new encapstest();
		obj.setB(5);
		System.out.println(obj.getB());
	}
    int a=1;
	private int b;
	public void setB(int b)
	{
	this.b=b;
	}
	public int getB()
	{
		return b;
	}
}

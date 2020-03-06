import java.io.*;
class arr
{
	int a[],n;
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getSize()
	{
		try
		{
			System.out.print("Enter ele no: ");
			n=Integer.parseInt(ad.readLine());
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		if (n>0)
		a=new int[n];
	}
	public void getData()
	{
		System.out.println("Enter numbers:-");
		for(int i=0;i<a.length;i++)
		{
			try
			{
				
				a[i]=Integer.parseInt(ad.readLine());
			}
			catch(Exception e)
			{
				System.err.println(e);
				i--;
			}
		}
	}
	public void showData()
	{
		System.out.println("Entered numbers are:-");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
	class test
	{
		public static void main(String[]args)
		{
			arr ob=new arr();
			ob.getSize();
			ob.getData();
			ob.showData();
		}
	}
import java.util.*;

class LSearch {

	
	public static void main(String arg[])
	{
		int a[],item;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		a =new int[sc.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the item to be searched:");
		item =sc.nextInt();
		LSearch s =new LSearch();
		
		// for linear search
		s.linear(a,item);
		
		
	}	


	public void linear(int[] a,int item)
	{
		int count=0;
		int flag=0;
		while(count<a.length)
		{
			if(a[count]== item)
			{
				flag++;
				break;
			}
			count++;
		}
		if (flag==0)
			System.out.println("Item not found");
		else
			System.out.println("Item found at index= "+count);
	}
	
}
import java.util.*;

class BSearch {

	
	public static void main(String arg[])
	{
		int a[],item;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		a =new int[sc.nextInt()];
		System.out.println("Enter the elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the item to be searched: ");
		item =sc.nextInt();
		BSearch s =new BSearch();
		

		// for binary search
		
		s.binary(a,item);
		
		
		
	}
	
	public void binary(int a[],int item )
	{
		
		binary(a,0,a.length-1,item);
	}

	public void binary(int a[],int start,int end,int item)
	{
		if(end < start)
		{
			System.out.println("Item is not present.");
			return;
		}	
		int mid =(start+end)/2;
		if(a[mid]== item)
			System.out.println("Item is present at index :  "+ mid);
		else if(a[mid] > item)
			binary(a,start,mid-1,item);
		else
			binary(a,mid+1,end,item);
		
	}
}

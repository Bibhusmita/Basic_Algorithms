import java.util.*;


class LSearchRec 
{ 
	static void linear(int arr[],int x)
	{
		int index = recSearch(arr, 0, arr.length-1, x); 

        if (index != -1) 

			System.out.println("Element " + x + " is present at index " +  

							   index); 

        else

            System.out.println("Element " + x + " is not present"); 
	}

	/* Recursive Method to search x in arr[l..r] */

	static int recSearch(int arr[], int l, int r, int x) 

	{ 

		if (r < l) 

			return -1; 

		if (arr[l] == x) 

			return l; 

		if (arr[r] == x) 

			return r; 

		return recSearch(arr, l+1, r-1, x); 

	} 



	// Driver method 

	public static void main(String[] args)  

	{ 

        int arr[],x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		arr =new int[sc.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the item to be searched");
		x=sc.nextInt();
		linear(arr,x);
		
     

	} 

}

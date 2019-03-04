import java.util.*;
class MergeSort
{

	void merge(int a[], int low, int mid, int high)
	{

		int n = mid - low + 1+1;
		int m = high - mid+1;
		int i,j,k;
		int A[] = new int [n]; 
		int B[] = new int [m];
		for (i = 0; i < n-1; ++i)
			A[i] = a[low + i];
		for (i = 0; i < m-1; ++i)
			B[i] = a[mid + 1 + i];
		A[n-1] = Integer.MAX_VALUE;
		B[m-1] = Integer.MAX_VALUE;
		i = 0;
		j = 0;
		for(k = low; k <= high; ++k) {
			if (A[i] <= B[j]) {
				a[k] = A[i];
				++i;
			}
			else {
				a[k] = B[j];
				++j;
			}
		}
	}

	void sort(int a[], int low, int high)
	{
		if (low < high) 
		{
			int mid = (low + high)/2;
			sort(a, low, mid);
			sort(a, mid+1, high);
			merge(a, low, mid, high);
		}
	}

	static void printArray(int a[]) 
	{ 
		int n = a.length;
        
        for (int i=0; i<n; ++i)
        	System.out.print(a[i]+" "); 

        System.out.println();
    } 

	public static void main(String args[]) 
    { 
        int n,i=0,a[];
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a= new int[n];
        System.out.println("Enter the elements:");
        for (i=0;i<n ;i++) 
            a[i]=sc.nextInt(); 

		MergeSort ob = new MergeSort(); 
        ob.sort(a, 0, a.length-1); 

        System.out.println("\nSorted array:");
        printArray(a); 
        

    } 
}

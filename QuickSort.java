import java.util.*;
class QuickSort 
{ 

    
    int partition(int a[], int p, int r) 
    { 
        int pivot = a[r];  
	    int i = (p-1); 
        for (int j=p; j<r; j++) 
        { 
            if (a[j] <= pivot)
            { 
                i++; 
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp; 
            } 
        }

        int temp = a[i+1];
        a[i+1] = a[r]; 
        a[r] = temp; 
        return i+1; 

    } 

    void sort(int a[], int p, int r) 
    { 
        if (p < r) 
        { 
            int pi = partition(a, p, r);
            sort(a, p, pi-1); 
            sort(a, pi+1, r); 

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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
        int a[] = new int[sc.nextInt()]; 
		System.out.println("Enter the elements:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        QuickSort ob = new QuickSort(); 
		
		System.out.println("Sorted array:"); 
        
		ob.sort(a, 0, a.length-1); 
		
		printArray(a); 
		
    } 
} 

import java.util.*;

class HeapSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entyer the size of element ");
		int a[]= new int[sc.nextInt()];
		System.out.println("enter the elements: ");
		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();
		}
		HeapSort q= new HeapSort();
		long startTime = System.nanoTime();
		q.heapsort(a);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("the sorted array is: ");
		for (int i=0;i<a.length ;i++ ) {
			System.out.print(a[i]+" ");	
		}	
		System.out.println("time consumed in nano sec : "+totalTime);

	}
	int left(int i){
		return 2*i+1;
	}
	int right(int i){
		return 2*i+2;
	}
	int parent(int i){
		return i/2;
	}
	void max_heapify(int A[],int i,int n){
		int s;
		int largest=i;
		int l=left(i);
		int r= right(i);
		//int n=A.length;
		if (l<n && A[l]>A[largest]) {
			largest=l;
			
		}
		if (r<n && A[r]>A[largest]) {
			largest=r;
			
		}
		if(largest !=i ){
			s=A[i];
			A[i]=A[largest];
			A[largest]=s;
			n--;
			max_heapify(A,i,n);
		}

	}
	void build_max_heap(int A[]){
		for (int i=A.length/2-1;i>=0 ; i--) {
			max_heapify(A,i,A.length);
			
		}
	}
	void heapsort(int A[]){
		int n=A.length;
		build_max_heap(A);
		for (int i=n-1;i>=0 ;i-- ) {
			int temp=A[0];
			A[0]=A[i];
			A[i]=temp;
			max_heapify(A,0,i);
			
		}
	}
}
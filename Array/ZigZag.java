package array;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[] = {4,3,7,8,6,2,1};
int n = ar.length;
for(int i=0;i<n-1;i++) {
//	for even index we check that element should be less than next element
	if(i%2==0) {
		if(ar[i]<ar[i+1])
			continue;
		else {
			int temp = ar[i];
			ar[i] = ar[i+1];
			ar[i+1] = temp;
		}
	}
//	for odd index we check that element should be greater than the next element
	else {
		if(ar[i]>ar[i+1])
			continue;
		else {
			int temp = ar[i];
			ar[i] = ar[i+1];
			ar[i+1] = temp;
		}
	}
}
for(int a:ar)
	System.out.print(a+" ");
	}

}

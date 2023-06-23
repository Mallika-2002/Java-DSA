package array;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {1,2,3,4,5};
		int n = 5;
int start =0,end = n-1;
while(start<end) {
	int temp = ar[start];
	ar[start]= ar[end];
	ar[end] = temp;
	start++;
	end--;
}
for(int a:ar)
	System.out.print(a+" ");
	}

}

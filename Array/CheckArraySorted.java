package array;

public class CheckArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {1,2,6,4,5};
		boolean flag = true;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>ar[i+1]) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.print("sorted");
		else
			System.out.print("not sorted");
			}
	}


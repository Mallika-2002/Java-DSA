package pattern_recursion;
//1
//2 3
//4 5 6
//7 8 9 10
public class NumberCharPattern {
	public static void printstar(int col , int val) {
		if(col==0)return;
		System.out.print(val+" ");
		printstar(col-1,val+1);
	}
	public static void printline(int line,int col,int val) {
		if(line==0)
			return;
		printstar(col,val);
		System.out.println();
		printline(line-1,col+1,val+col);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printline(5,1,1);
	}
}

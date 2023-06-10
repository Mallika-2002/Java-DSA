package pattern_recursion;

public class SecondaryDiagonal {
	public static void printstar(int line,int star) {
		if(star==0)
			return ;
		if(line==star)
		System.out.print("*");
		else
			System.out.print(" ");
		printstar(line , star-1);
	}
	public static void printline(int line,int star) {
		if(line==0)
			return ;
		printline(line-1,star);
		printstar(line,star);
		System.out.println();
		
	}
	public static void main(String[] args) {
		printline(5,5);
	}
}

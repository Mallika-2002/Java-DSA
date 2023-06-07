package recusrion;

public class SecondaryDiagonal {
		public static void printline(int line) {
			if(line==0)
				return ;
			printspace(line-1);
			System.out.print("*");;
			System.out.println();
			printline(line-1);
		}
		public static void printspace(int sp) {
			if(sp==0)return;
			System.out.print("  ");
			printspace(sp-1);
		}
		public static void main(String[] args) {
	printline(5);
		}
	}


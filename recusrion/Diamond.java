package recusrion;

public class Diamond {
		public static void printstar(int star) {
			if(star==0)
				return ;
			System.out.print("*");
			printstar(star-1);
		}
		public static void printline(int line,int star) {
			if(line==0)
				return ;
			printspace(line-1);
			printstar(2*star-1);
			System.out.println();
			printline(line-1,star+1);
		}
		public static void printspace(int sp) {
			if(sp==0)return;
			System.out.print(" ");
			printspace(sp-1);
		}
		public static void main(String[] args) {
	printline(5,1);
		}
	}


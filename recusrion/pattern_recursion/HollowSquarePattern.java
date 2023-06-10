package pattern_recursion;
public class HollowSquarePattern {
	 static void printStarsOrSpaces(int rows , int star){
	        if(star == 0){
	            return;
	        }
	        
	        printStarsOrSpaces( rows , star-1);
	        if(rows == 1||rows==5){
	            System.out.print("* ");
	        }

	        else if(star==1||star==5  ){
	            System.out.print("* ");
	        }

	        else{
	            System.out.print("  ");
	        }

	    }

	    static void printLines(int rows , int starOrSpaces){
	        if(rows == 0){
	            return;
	        }
	        printLines(rows -1 ,  starOrSpaces);
	        printStarsOrSpaces(rows, starOrSpaces);
	       
	       
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // int n = 5 2rows - 1;
	        printLines(5 , 5);
	    }
	}

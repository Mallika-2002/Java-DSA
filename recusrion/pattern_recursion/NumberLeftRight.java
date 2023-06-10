package pattern_recursion;
//1        1
//12      21
//123    321
//1234  4321
//1233554321
public class NumberLeftRight {
    static void printLeftNums(int nums){
        if(nums == 0){
            return;
        }

        printLeftNums(nums - 1);
        System.out.print(nums+" ");
    }

    static void printSpaces(int spaces){
        if(spaces == 0){
            return;
        }

        System.out.print("  ");
        printSpaces(spaces - 1);
    }

    static void printRightNums(int nums){
        if(nums == 0){
            return;
        }

        System.out.print(nums+" ");
        printRightNums(nums - 1);
    }
    static void printLines(int lines , int spaces){
        if(lines == 0){
            return;
        }

        printLines(lines - 1 , spaces + 1);
        printLeftNums(lines);
        printSpaces(spaces);
        printSpaces(spaces);
        printRightNums(lines);
        System.out.println();
        
    }

    public static void main(String[] args) {
        printLines(5 , 0);
    }
}

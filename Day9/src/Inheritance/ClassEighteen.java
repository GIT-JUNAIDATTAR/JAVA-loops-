package Inheritance;

public class ClassEighteen extends ClassNineteen {

	   public static void patternSolidSquare(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) System.out.print("* ");
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        patternSolidSquare(5);
	    }
}

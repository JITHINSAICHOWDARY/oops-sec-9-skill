package wrapper;

public class Unboxing {
	    public static void main(String[] args) {
	        Integer boxedNum = Integer.valueOf(100);

	        int num = boxedNum.intValue();

	        System.out.println("Unboxed int: " + num);
	    }

}
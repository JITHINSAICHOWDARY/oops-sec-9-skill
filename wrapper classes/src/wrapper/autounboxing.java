package wrapper;

public class autounboxing {
    public static void main(String[] args) {
        Integer boxedNum = 200; 

        int num = boxedNum;

        System.out.println("Auto-unboxed int: " + num);
    }

}
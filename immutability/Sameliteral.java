package immutability;
public class Sameliteral {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java"; 
//changing variables value
        str1 = "Python"; 
        System.out.println("string-1:" + str1);
        System.out.println("string-2: " + str2);
    }
}
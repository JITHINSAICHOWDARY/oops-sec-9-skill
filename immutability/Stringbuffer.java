package immutability;
public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");     
        sb.insert(4, " Language");      
        sb.replace(5, 14, "Code");        
        sb.delete(5, 9);                  
        sb.reverse();                    
        sb.setCharAt(0, 'X');             
        sb.ensureCapacity(50);            
        sb.trimToSize();                  

        System.out.println("Final StringBuffer: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}

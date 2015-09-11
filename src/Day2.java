import TerminalIO.*;
public class Day2 {

    public static void main(String[] args) {
       KeyboardReader r=new KeyboardReader();
       int size;
       size=r.readInt("How big are you? ");
       size++;
        System.out.println(size+": This is how big you are if you were one bigger.");
    }
    
}

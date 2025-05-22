import Strings.DupChar;
import Strings.RemoveSC;
import Strings.RemvBlnkS;
import Strings.ReverseString;
public class Main {

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.reverse_string("hello");
        RemoveSC sc = new RemoveSC();
        sc.rsc("j£a$v*a");
        System.out.println();
        DupChar dc = new DupChar();
        dc.dup("programming");
        RemvBlnkS rom = new RemvBlnkS();
        rom.romv("j   a     y  a");
    }
}
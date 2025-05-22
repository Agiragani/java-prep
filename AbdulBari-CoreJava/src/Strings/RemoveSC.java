package Strings;

public class RemoveSC {
    public void rsc(String str ){
     String replaced = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.print(replaced);
    }
}

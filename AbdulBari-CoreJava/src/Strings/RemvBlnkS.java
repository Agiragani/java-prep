package Strings;

public class RemvBlnkS {
    public void romv(String str) {
        String str1 = str.replaceAll("\\s", "");
        System.out.println(str1);
    }
}

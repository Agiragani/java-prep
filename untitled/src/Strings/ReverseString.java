package Strings;

public class Strings {
    public void reverse_string(String str) {

        char[] chArr = str.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }
        System.out.println("   approach 1");
        System.out.println("");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        ;
        System.out.println("   approach 2");
        System.out.println("");
        StringBuffer st = new StringBuffer(str);
        System.out.print(st);
        System.out.println("   approach 3");
    }


}


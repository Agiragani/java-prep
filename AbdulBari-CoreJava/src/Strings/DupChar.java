package Strings;

public class DupChar {

    public void dup( String str){
        char arr[] = str.toCharArray();
        char sb = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j =  (i+1); j <arr.length; j++){
                if(arr[i]==arr[j]){
                   sb = arr[i];
                   break;
                }
            }
        }
        System.out.println(sb);
    }
}

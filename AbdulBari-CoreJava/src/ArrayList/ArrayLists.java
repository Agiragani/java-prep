package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists{
    public static void main(String[] args){

        int array[] = {11,12,13,14,15};

        for(int i=0;i<array.length;i++){
            System.out.print( array[i] + " ");
        }
        System.out.println("");

        for(int x:array){
            System.out.print(x + " ");
        }
        System.out.println( " " );

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            arrayList.add(array[i]);
        }
        System.out.print(arrayList + " ");
        System.out.println(" ");

        for(int x : array){
            arrayList2.add(x);
        }
        System.out.print(arrayList2);
    }

}
package LinkedList;

import java.util.LinkedList;

public class FindMidNode {
    public static void main(String[] args){
        int arr[] = {1,2,3,7,9,8,9};
        LinkedList<Integer> ll = new LinkedList<>();

        for(int x : arr){
            ll.add(x);
        }
        System.out.println("Linked List = "+ ll);

        int  temp= arr.length/2;
        System.out.println("Mid Index = " +temp);

        int mid =ll.get(temp);
        System.out.println("Mid Node = "+mid);
    }
}

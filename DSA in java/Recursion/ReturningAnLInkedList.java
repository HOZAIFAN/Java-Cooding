package DSA.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReturningAnLInkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        ArrayList<Integer> list =  MultipleOccurence(arr, 4, 0, new ArrayList<>());
        System.out.println(list);

    }
    static ArrayList<Integer> MultipleOccurence (int[] arr ,int target , int index , ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if (arr[index]==target ){
             list.add(index);
        }
        return MultipleOccurence(arr, target,index+1,list);
    }

}

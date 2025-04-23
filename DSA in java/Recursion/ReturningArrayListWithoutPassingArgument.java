package DSA.Recursion;

import java.util.ArrayList;

class ReturningArrayListWithoutPassingArgument{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        System.out.println(CheckOcurrence(arr,4,0));

    }
    static ArrayList<Integer> CheckOcurrence(int[] arr,int target,int index){
        if(index==arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> list=CheckOcurrence(arr, target, index+1);
        if (arr[index]==target) {
            list.add(index);
            return list;
        }
        return list;
    }

}

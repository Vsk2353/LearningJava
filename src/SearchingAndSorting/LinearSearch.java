package SearchingAndSorting;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,45,5,6,7,8};
        int target = 45;
        System.out.println(linearsearch(arr,target));
    }
    //search in the array: return the index if item found, else return -1

    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
        }
        }

        return -1;
    }
}

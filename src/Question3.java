public class Question3 {
    //    Given an array, reverse entire array.
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.print("Array Before Reverse : ");
        for(int k=0;k< array.length;k++) {
            System.out.print(" "+array[k]);
        }
        reverseArray(array);
        System.out.print("\nArray After Reverse : ");
        for(int k=0;k< array.length;k++) {
            System.out.print(" "+array[k]);
        }
    }
    static void swapArrayEle(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void reverseArray(int[] array){
        int i=0;
        int j= array.length-1;
        while(i<j){
            swapArrayEle(array,i,j);
            i++;
            j--;
        }
    }
}

public class Question5 {
//    Given N array elements, rotate array from last to first by k times. (sc:O(1))
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int k=15;
        rotateKTimes(array,k);
        for(int i=0;i< array.length;i++) {
            System.out.print(" "+array[i]);
        }
    }
    static void rotateKTimes(int[] array,int k){
        if(array.length<k)
        {
            k=k%array.length;
        }
        Question3.reverseArray(array);
        Question4.reverseStoE(array,0,k-1);
        Question4.reverseStoE(array,k, array.length-1);
    }
}

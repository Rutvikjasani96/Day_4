public class Question4 {
//    Given N array elements & [s,e], reverse array from [s,e]. Note : s <= e
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Array Before Reverse : ");
        for(int k=0;k< array.length;k++) {
            System.out.print(" "+array[k]);
        }
        int s=3;
        int e=7;
        reverseStoE(array,s,e);
        System.out.print("\nArray After Reverse :  ");
        for(int k=0;k< array.length;k++) {
            System.out.print(" "+array[k]);
        }
    }
    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void reverseStoE(int[] array,int s,int e){
        while(s<e){
            swap(array,s,e);
            s++;
            e--;
        }
    }
}

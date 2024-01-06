public class Question2 {
//    Given N array elements check if their exist a pair i,j such that arr[i]+arr[j]==k & i!=j.
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int k = 30;
        boolean ans = checkpair(array,k);
        System.out.println("Ans : "+ans);
        boolean ansLowerTriangle = checkPairLw(array,k);
        System.out.println("Ans Using Lower Triangle : "+ansLowerTriangle);
        boolean ansUpperTriangle = checkPairUp(array,k);
        System.out.println("Ans Using Upper Triangle : "+ansUpperTriangle);

    }
    static boolean checkpair(int[] array,int k){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i!=j){
                    if(array[i]+array[j]==k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean checkPairLw(int[] array,int k){
//        using Lower Triangle
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]+array[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean checkPairUp(int[] array,int k){
        for(int i=1;i< array.length;i++)
        {
            for(int j=0;j<i;j++){
                if(array[i]+array[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}

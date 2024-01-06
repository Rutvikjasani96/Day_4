public class Question1 {
//    Given N array elements, count no. of elements having atleast 1 element greater than itself.
    public static void main(String[] args) {
        int[] array = {-3,-2,6,8,4,8,5};
        int ans = solution(array);

        System.out.println("Answer : "+ans);

    }
    static int solution(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        int count=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==max){
                count++;
            }
        }
        return array.length-count;
    }
}

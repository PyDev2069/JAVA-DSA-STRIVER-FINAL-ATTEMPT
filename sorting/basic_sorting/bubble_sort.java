public class bubble_sort {
    public static void main(String [] args){
        int[] arr = {13,46,24,52,20,9};
        for(int i=arr.length-1; i>=1; i--){
            int didSwap = 0; //*optimization flag gives o(n) time complexity */
            for(int j=0; j<=i-1; j++){
                //*swapper */
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break; //* optimizer for the sorted array o(n) time complexity */
            }
        }
        //*print the array */
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//* time complexity O(n^2)WORST,AVERAGE */


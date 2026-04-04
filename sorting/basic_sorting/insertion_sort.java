public class insertion_sort {
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        for(int i=1; i<=arr.length-1; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                //*swapper */
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        //*print the array */
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//* Worst case and average case time complexity is O(n^2) */
//* Best case {1,2,3,4,5}  for o(n) time complexity*/

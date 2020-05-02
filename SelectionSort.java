public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};
        //selection sort this 
        for(int lastUnsortedIndex=array.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int largest = 0;//letting the first element of the unsorted list to be the largest
                            //then start comparing and swapping to find the largest
            for(int i=1; i<=lastUnsortedIndex; i++){
                if(array[i]>array[largest]){
                    largest=i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
        //printing the array out
        for(int i=0; i<array.length; i++){
            System.out.print(" "+array[i]);
        }
    }

    //method to swap
    public static void swap(int[] arr, int i, int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
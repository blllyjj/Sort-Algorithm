public class InsertionSort {
    public static void main(String[] args) {
        int[] array={20,35,-15,7,55,1,-22};
        //sort this array by insertion
        //assume the first number of array[0] is the first sortest list
        //compare with the nextUnsortedNumber 
        //decides where to insert the nextUnsortedNumber

        for(int lastUnsortedNumber=1; lastUnsortedNumber<array.length; lastUnsortedNumber++){
            //this loops indicates the expansion of the sorted list
            int temp=array[lastUnsortedNumber];//use a temperary variable to store the 
                                                //array for comparison
            int i;
            for(i=lastUnsortedNumber; i>0 && temp<array[i-1]; i--){
                //shrifting
                array[i]=array[i-1];//the greater number shifts from left to right
            }
            array[i]=temp;//insertion of the lastUnsortedNumber into the index where the it found the insertion pause point

        }

        //printing out the sorted array
        for(int i=0; i<array.length; i++){
            System.out.print(" "+array[i]);
        }
    }
}
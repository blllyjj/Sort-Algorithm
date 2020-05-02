class BubbleSort{
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        //bubble sorts this array
        for(int lastUnsortedIndex=intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i=0; i<lastUnsortedIndex; i++){
                if( intArray[i]>intArray[i+1] ){
                    swap(intArray, i, i+1);
                }
            }
        }

        for(int j=0; j<intArray.length; j++){
            System.out.print(" "+intArray[j]);
        }

    }

    public static void swap(int[] array, int i, int j){
        //swapping
        if(i==j){
            return;
        }
        int temp;
        temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
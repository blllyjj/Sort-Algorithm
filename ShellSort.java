class ShellSort {
    public static void main(String[] args) {
      int[] array = {20,35,-15,7,55,1,-22};
      //sort by shell sorting method
      for(int gap=array.length/2; gap>0; gap/=2){
        for(int lastUnsortedIndex=gap; lastUnsortedIndex<array.length; lastUnsortedIndex++){
          int temp=array[lastUnsortedIndex];
          int j;
          for(j=lastUnsortedIndex; j>0 && array[j-gap]>temp; j=j-gap){
            //shifting
            array[j]=array[j-gap];
          }
          array[j]=temp;
        }
      }
  
      System.out.println("Optimization of Insertion Sort by Shell Sort");
      //printing out the sorted array
      for(int i=0; i<array.length; i++){
        System.out.print(" "+array[i]);
      }
  
  
    }
  }
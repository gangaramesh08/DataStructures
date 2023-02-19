package arrays;

import java.util.Arrays;

public class ArrayListImpl {

    private static final int MAX_SIZE = 5;
    int array[];
    int curIndex;
    int sizeCounter;
     public ArrayListImpl(){
         this.array = new int[MAX_SIZE];
         curIndex = 0;
         sizeCounter = 0;
     }

     public void add(int num){
         if(sizeCounter==MAX_SIZE-1){
             int tempArray[] = Arrays.copyOf(array, array.length);
             array = new int[curIndex+MAX_SIZE];
             for(int i=0;i< curIndex;i++) {
                 array[i] = tempArray[i];
             }
             sizeCounter=0;
         }
         array[curIndex++] = num;
         sizeCounter++;

     }

     public void printList(ArrayListImpl aList) {
         for( int i=0; i<curIndex;i++){
             System.out.print(aList.array[i] + " ");
         }
         System.out.println();
     }

     public void remove( int index) {
         if(index>=curIndex) {
             System.out.println("Index OutOfBounds");
         } else {
             for(int i=index;i< curIndex;i++){
                 array[i] = array[i+1];
             }
             curIndex--;
         }

     }

}
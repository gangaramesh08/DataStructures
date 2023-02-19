package arrays;

public class ArraysMain {
    public static void main(String args[]) {
        ArrayListImpl aList = new ArrayListImpl();
        aList.add(5);
        aList.add(6);
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(8);
        aList.printList(aList);
        aList.remove(3);
        aList.printList(aList);
        aList.remove(6);


    }
}

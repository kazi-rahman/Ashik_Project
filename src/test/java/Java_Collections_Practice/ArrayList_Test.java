package Java_Collections_Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Test {
    public static void main(String[] args) {


    List<Integer> arrlst= new ArrayList<Integer>();
    // adding integer value in the arraylist
    arrlst.add(10);
    arrlst.add(20);
    arrlst.add(30);
    arrlst.add(40);
    arrlst.add(50);

        System.out.println("The size of the array list is  :  "+arrlst.size());
        System.out.println("The total arraylist is  :  "+arrlst);
        System.out.println("The value of specific index is :  "+arrlst.get(2));
        System.out.println("The index number of expected value is :  "+arrlst.indexOf(50));

    arrlst.remove(2);
        System.out.println("The size of the array list is  :  "+arrlst.size());
        System.out.println("The total arraylist is  :  "+arrlst);

        arrlst.set(3,70);
        System.out.println("The size of the array list is  :  "+arrlst.size());
        System.out.println("The total arraylist is  :  "+arrlst);

        //adding a new element in the arraylist
        arrlst.add(0,100);
        System.out.println(arrlst);
        System.out.println("The size of the array list is  :  "+arrlst.size());
}
}
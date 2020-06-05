package Java_Collections_Practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Link_List_Test {
    public static void main(String[] args) {
        List<String>  lnkList1= new LinkedList<String>();
        lnkList1.add("Shafiq");
        lnkList1.add("Rafiq");
        lnkList1.add("Towfiq");
        lnkList1.add("Ashfaq");
        lnkList1.add("Mushfiq");


        //printing the size of the linked list
        System.out.println(lnkList1.size());
        //printing the linked list
        System.out.println(lnkList1);


        //taking the print of the linked list through iterator
        Iterator<String> itr= lnkList1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //adding new value in an expected index
        lnkList1.add(0,"Afridi");
        System.out.println(lnkList1);


    }



}

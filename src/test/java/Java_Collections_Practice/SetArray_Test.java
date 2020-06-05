package Java_Collections_Practice;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetArray_Test {

    // adding a set of information in a set of code
    int id;
    String name,author;
    int quantity;

    public SetArray_Test(int id,String name,String author, int quantity){
        this.id=id;
        this.name=name;
        this.author = author;
        this.quantity=quantity;


    }

    public static void main(String[] args) {
    //HashSet stores the elements by using a mechanism called hashing.
    //HashSet contains unique elements only.
    //HashSet allows null value
    //HashSet class is non Synchronised
    //HashSet is the best approach for search operation
        //HashSet doesn't maintain the insertion order.
        // Here, elements are inserted on the basis of their hashcode.
        // the initial default capacity of Hashset is 16

        Set<String>  hshSet1= new HashSet<String>();
        hshSet1.add("Raihan");
        hshSet1.add("Mahbub");
        hshSet1.add("Hasib");
        hshSet1.add("Alom");
        hshSet1.add("Shashoto");

        System.out.println(hshSet1);

        Iterator<String> itr1= hshSet1.iterator();
      while(itr1.hasNext()){
          System.out.println(itr1.next());
      }

        SetArray_Test s1=new SetArray_Test(01,"Java","Anis",10);
        SetArray_Test s2=new SetArray_Test(02,"QTP","Anis",15);
        SetArray_Test s3=new SetArray_Test(03,"Selenium","Anis",20);
        SetArray_Test s4=new SetArray_Test(04,"SQL","Anis",25);

      Set <SetArray_Test> setBook=new HashSet<SetArray_Test>();
      setBook.add(s1);
      setBook.add(s2);
      setBook.add(s3);
      setBook.add(s4);

       // System.out.println(s1);
        for(SetArray_Test b:setBook){
            System.out.println(b.id+" "+b.name+"  "+b.author+"  "+b.quantity);
        }




    }
}

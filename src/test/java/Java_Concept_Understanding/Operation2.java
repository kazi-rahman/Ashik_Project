package Java_Concept_Understanding;

public class Operation2 {


    //example of Call by Value in java

    int data = 50;

    void change(Operation2 op) {
        op.data = op.data + 100;//changes will be in the instance variable
    }


    public static void main(String args[]) {
        Operation2 op = new Operation2();

        System.out.println("The value of data Before change " + op.data);

        op.change(op);//passing object
        System.out.println("The value of data After change " + op.data);


    }
}
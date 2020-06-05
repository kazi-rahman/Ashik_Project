package Java_Concept_Understanding;

public class Operation {

    int data=60;
    void change(int data){
        data=data+100;

    }


}

class test_Operation{



    public static void main(String[] args) {

        Operation op=new Operation();
        System.out.println(op.data);
        op.change(500);
        System.out.println(op.data);
    }

}

package Java_Concept_Understanding;

public class Method_OverRiding {
    class Bank{
        int interestRate(){
            return 0;
        }
    }

    class JAMUNA{
        int interestRate(){
            return 3;
        }
    }


    class Krishi{
        int interestRate(){
            return 5;
        }
    }


    public static void main(String[] args) {
        //JAMUNA  j1=new JAMUNA();
        //j1.interestRate();
    }
}

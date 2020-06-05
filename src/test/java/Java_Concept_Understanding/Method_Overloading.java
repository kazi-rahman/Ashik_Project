package Java_Concept_Understanding;

public class Method_Overloading {
    //method overloading increases the readability of the program
// two ways we can achieve the method overloading ---
    //by changing number of arguments and
    // by changing the data types

    static int  add (int a, int b ){
        return a + b;
    }

    static double add (double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(Method_Overloading.add(5,6));
    }


}

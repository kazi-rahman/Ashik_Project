package Java_Concept_Understanding;

public class Java_Constructor_Understanding {


    //constructor name must be as class name
    //a constructor must have no explicit return type
    // a java constructor cannot be abstract, static, final and synchronised

    //two types of constructor are there :::   default and parameterised

    // adding a comment to check the git repository


    int id;
    String name;
    String department;



    public Java_Constructor_Understanding(){
        System.out.println("This is a no argument constractor");
        System.out.println("             excuse me       ");
    }



    public Java_Constructor_Understanding(int id, String name, String department){
        this.id=id;
        this.name=name;
        this.department=department;
        System.out.println("This is a three argument constractor");
        }
    void printSample (){
        System.out.println("this is a method inside the class ");
        System.out.println("id is :  "+id + "  name is : "+name+ "   department is:  "+department);
    }

    public static void main(String[] args) {
        new Java_Constructor_Understanding();


//        Java_Constructor_Understanding jcu1 = new Java_Constructor_Understanding(101,"arif","cs");
//        Java_Constructor_Understanding jcu2=new Java_Constructor_Understanding(102,"Towfiq","Java ");
//       jcu1.printSample();
//        jcu2.printSample();
//



    }
}

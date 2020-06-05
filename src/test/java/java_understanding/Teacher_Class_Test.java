package java_understanding;

public class Teacher_Class_Test {

    String designation;
    String department_Name;
    int department_ID;

    public void printTeacher(){
        System.out.println("Department id:  "+department_ID+"designation:  "+designation+"department name is:  "+department_Name);
    }

    Teacher_Class_Test(String department_Name, int department_ID){
        this.department_ID= department_ID;
        this.department_Name= department_Name;
    }


    Teacher_Class_Test(){
        System.out.println("This is the constructor of Teacher class");}
}

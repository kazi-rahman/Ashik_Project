package java_understanding;

public abstract class abstraction_understading {
        abstraction_understading(){
            System.out.println("this is a constractor of abstract main class");
        }
    abstract void draw();
}

    class rectangle extends abstraction_understading {
        void draw() {
            System.out.println("Drawing a rectangle");
        }
    }
    class circle extends abstraction_understading{
            void draw(){
                System.out.println("Drawing circle");
            }
    }
   class Test_Abstraction{
    public static void main(String[] args) {
       abstraction_understading obj_r=new rectangle();

       abstraction_understading obj_c= new circle();

       obj_r.draw();

    }





}

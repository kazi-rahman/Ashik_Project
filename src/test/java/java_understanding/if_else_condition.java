package java_understanding;

import java.util.Scanner;

public class if_else_condition {
    public static void main(String[] args) {


        int num = 89;
        //num =95;

        if (num >= 90 && num <= 100) {
            System.out.println("you got grade A+ marks");
        } else if (num >= 80 && num <= 89) {
            System.out.println("you get grade A  marks ");
        } else {
            System.out.println("you got passed");
        }



        Scanner input = new Scanner(System.in);
        int num1;
        System.out.println("please provide your achieved number");
        num1=input.nextInt();

        if( num1 >=60 && num1 <=80){
            System.out.println("You got grade B");
        }
    }


}

package finalexam;

import java.util.Scanner;

public class QuestionFourGive {
    
    public static void main(String[] args){
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age.");
        age = input.nextInt();
        switch (age) {
        case 6: {
            System.out.println("You get a legos");
            break;
        }
        case 12: {
            System.out.println("You get a bike");
            break;
        }
        case 18: {
            System.out.println("You get a new car");
            break;
        }
        default:
            System.out.println("You get nothing");
            break;
        }
     }


}

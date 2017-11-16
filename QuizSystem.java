
package quizsystem;
import java.util.Scanner;

 class Main {
     Scanner input= new Scanner(System.in);
     protected int choice;
     
     public void ShowMessage(){
     System.out.println("1:Teacher portal");
     System.out.println("2:Student portal");
     
     System.out.println("Enter your choice: ");
     choice=input.nextInt();
     
     switch(choice){
         case 1:
             System.out.println("in progress");
             break;
         case 2:
             System.out.println("1:C++ Tutorials+Quizzes");
             System.out.println("2:java Tutorials+Quizzes");
             System.out.println("3:Html Tutorials+Quizzes");
             System.out.println("4:PHP Tutorials+Quizzes");
             
             System.out.println("Enter your choice: ");
             choice=input.nextInt();
             
             switch(choice){
                 case 1:
             System.out.println("1:OOP");
             System.out.println("2:Constructor");
             System.out.println("3:Destructor");
             System.out.println("4:Inheritance");
             System.out.println("5:Operator Overloading");
             System.out.println("6:Pointer");
             System.out.println("7:Polymerphism");
             
             
                     
             
             }
             
             
     
     }
     
     
     
     }
}




public class QuizSystem {

   
    public static void main(String[] args) {
       
        Main obj=new Main();
        obj.ShowMessage();
    }
    
}

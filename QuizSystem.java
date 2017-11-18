
package quizsystem;
import java.util.Scanner;

 class Main {
     Scanner input= new Scanner(System.in);
     protected int choice;
     public void select(){
     
      System.out.println("Enter your choice: ");
     choice=input.nextInt();
     }
     
     public void ShowMessage(){
     System.out.println("1:Teacher portal");
     System.out.println("2:Student portal");
     
     select();
     switch(choice){
         case 1:
             teacher();
             break;
         case 2:
           student();  
           break;
         
             
     
     }
     
     }
     
    
     
     public void teacher(){
             System.out.println("in progress");
     }
            public void student(){ 
             System.out.println("1:C++ Tutorials+Quizzes");
             System.out.println("2:java Tutorials+Quizzes");
             select();
             
             switch(choice){
                 case 1:
                     cplusplus();
                     break;
                 case 2:
                    // java();
                     break;
             
             }
            }
              
         public void cplusplus(){ 
             
                System.out.println("1:OOP");
                System.out.println("2:Constructor");
                System.out.println("3:Destructor");
                System.out.println("4:Inheritance");
                System.out.println("5:Operator Overloading");
                System.out.println("6:Pointer");
                System.out.println("7:Polymerphism");
             
                select();
                    switch(choice){
                        case 1:
                            oop();
                            break;
                        case 2:
                            constructor();
                            break;
                        case 3:
                              Destructor();
                              break;
                        case 4:
                              Inheritance();
                              break;
                        case 5:
                              OperatorOverloading();
                              break;
                        case 6:
                              Pointer();
                              break;
                        case 7:
                            Polymerphism();
                            break;
                            
                        default:
                            System.out.println("Invalid choice");
                                
             }
         
         }
             
                    public void oop(){
                         System.out.println("1:Tutorials");
                         System.out.println("2:Quiz");
                         select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                                 
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                          
                          
                    public void constructor(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void Destructor(){
                           System.out.println("1:Tutorials");
                           System.out.println("2:Quiz");
                           select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void Inheritance(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                             select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void OperatorOverloading(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void Pointer(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void Polymerphism(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void java(){
                        System.out.println("1:Introduction to java");
                        System.out.println("2:Oporators");
                        System.out.println("3:Methods");
                        System.out.println("4:java oop");
                        System.out.println("5:classes");
                        System.out.println("6:Inheritance+Plymerphism");
                        System.out.println("7:encapsulation");
                        System.out.println("8:Array+Arraylist");

             
                        select();
                    switch(choice){
                        case 1:
                            IntroductionToJava();
                            break;
                        case 2:
                            Oporators();
                            break;
                        case 3:
                              Methods();
                              break;
                        case 4:
                              classes();
                              break;
                        case 5:
                              InheritancePlymerphism();
                              break;
                        case 6:
                              encapsulation();
                              break;
                        case 7:
                            Polymerphism();
                            break;
                        case 8:
                            ArrayArraylist();
                            
                        default:
                            System.out.println("Invalid choice");
                                
             }
        }
                    
                    public void IntroductionToJava(){
                         System.out.println("1:Tutorials");
                         System.out.println("2:Quiz");
                         select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                                 
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                          
                          
                    public void Oporators(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void Methods(){
                           System.out.println("1:Tutorials");
                           System.out.println("2:Quiz");
                           select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void javaOOP(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                             select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void classes(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void InheritancePlymerphism(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    
                    public void encapsulation(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                    public void ArrayArraylist(){
                            System.out.println("1:Tutorials");
                            System.out.println("2:Quiz");
                         
                            select();
                         switch(choice){
                             case 1:
                                 System.out.println("Learn tutorials");
                             case 2:
                                 System.out.println("Test your self");
                             default:
                                 System.out.println("Invalid choice");
                         
                         }
                    }
                            
                      
}




public class QuizSystem {

   
    public static void main(String[] args) {
       
        Main obj=new Main();
        obj.ShowMessage();
    }
    
}

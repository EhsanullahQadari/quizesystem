public class destructor {

    public static void main(String[] args) {
        destructor obj1=new destructor;
        obj1.Destructor();
    }
    public void Destructor(){
        correct=0;
        wrong=0;
        i=1;
        try{
            do{

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnprogramming","root","root");
                Statement stmt=con.createStatement();


                ResultSet rs=stmt.executeQuery("select *from destructor where id ='"+i+"'");
                ResultSetMetaData rsmd=rs.getMetaData();
                int col=rsmd.getColumnCount();

                while(rs.next()){
                    System.out.println("Question No <<<<"+i+">>>>");
                    System.out.println(rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n"+rs.getString(6));
                    System.out.print("Choose the correct answer: ");
                    ch=input.next();
                    if(ch.equalsIgnoreCase(rs.getString(7))){
                        System.out.println("Correct answer");
                        correct++;
                        tcorrect++;

                        score=correct*10;

                    }
                    else{
                        System.out.println("Wrong answer");
                        wrong++;
                        twrong++;
                    }


                }
                System.out.print("Enter [stop/next] ");
                ch=input.next();

                i++;
            }while(ch.equalsIgnoreCase("next"));

            Formatter formater=new Formatter();
//                         
            System.out.println("\n--------------------<Description of-Quize>-----------------------------\n");

            System.out.println(formater.format("%10s%15s%15s%12s","Correct-answers","wrong-answers","total-score","grade"));

            for (int k=0; k<1; k++){
                formater=new Formatter();

                System.out.println(formater.format("%10s%15s%15s%15s",correct,wrong,score,grade));
                System.out.println("\n-----------------------------------------------------------------------");

            }
            System.out.println("Do you want to take another quiz[y/N]");
            ch=input.next();
            if(ch.equalsIgnoreCase("y")){
                cplusplus();
            }
            else {

            }



        }

        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);

        }
    }

}

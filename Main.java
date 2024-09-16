import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Accounts add=new Accounts();
        UserClass User = new UserClass();
        Scanner INput=new Scanner(System.in);
        System.out.println("Welcome TO Fawary System");
        System.out.println("press 1 to signin and 2 to signup" );
        int Choise=INput.nextInt();
        switch(Choise){
            case 1:{
                System.out.println("Please enter your email and Password");
                String Email=INput.next();
                String Password=INput.next();
                User.Signin(Email,Password);
                if(add.CheckUSer(User)){
                    System.out.println("Succesfully signed");
                }
                else {
                    System.out.println("Wrong Username or password");
                }
                break;
            }
            case 2:
                System.out.println("Please enter your email and Password and Username");
                String Email=INput.next();
                String Password=INput.next();
                String USerNAme=INput.next();
                User.Signup(Email,Password,USerNAme);
                if(add.CheckUSer(User)){
                    System.out.println("Username is registered before");
                }
                else{
                    add.addUser(User);
                    System.out.println("Succesfully signed");
                }
                break;
        }
        displayMEnus();
        System.out.println("Please choose option menu");
        int c=INput.nextInt();
        if(c==1){
            System.out.println("enter services you want to pay");
            String Service=INput.next();
            if(Service.equals("Mobile")){
                IService Mobile=new Mobile();
                Mobile.showlist();
                System.out.println("choice service from list");
                String Pservice=INput.next();
                Mobile.ProviderType(Pservice);
                System.out.println("Please choose Payement Option");
                Mobile.showlistofPM();
                String Pay=INput.next();
                Mobile.payType(Pay).pay();
            }
            if(Service.equals("Internet")){
                IService internet=new Internet();
                internet.showlist();
                System.out.println("choice service from list");
                String Pservice=INput.next();
                internet.ProviderType(Pservice);
                System.out.println("Please choose Payement Option");
                Internet.showlistofPM();
                String Pay=INput.next();
                Internet.payType(Pay).pay();
            }
            if(Service.equals("Landline")){
                IService landline=new Landline();
                landline.showlist();
                System.out.println("choice service from list");
                String Pservice=INput.next();
                landline.ProviderType(Pservice);
                System.out.println("Please choose Payement Option");
                landline.showlistofPM();
                String Pay=INput.next();
                landline.payType(Pay).pay();
            }
            if(Service.equals("Donations")){
                IService donations=new Donations();
                donations.showlist();
                System.out.println("choice service from list");
                String Pservice=INput.next();
                donations.ProviderType(Pservice).Form();
                System.out.println("Please choose Payement Option");
                donations.showlistofPM();
                String Pay=INput.next();
                donations.payType(Pay).pay();
            }



        }



    }
    private static void displayMEnus() {
        System.out.println("1)pay service");
        System.out.println("2)Refund");
        System.out.println("3)Check Discount");
    }
}

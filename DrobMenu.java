import java.util.Scanner;

public class DrobMenu implements Field {
    private AbstractForms Form;
    private int Amount;

    public DrobMenu(AbstractForms F){
        Form=F;
    }
    public int getAmount(){
        return Amount;
    }
    public int makeform() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter amount");
        Amount= sc.nextInt();
        return Form.makeform()+ Amount;
    }
}

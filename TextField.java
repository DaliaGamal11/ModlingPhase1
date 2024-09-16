import java.util.Scanner;

public class TextField implements Field {
    private AbstractForms Form;
    private int MobileNo;
    public TextField(AbstractForms F){
        Form=F;
    }
    public int getMobileNo(){
        return MobileNo;
    }
    public void setMobileNo(int m){
        MobileNo=m;
    }
    public int makeform() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Mobile Number");
        MobileNo= sc.nextInt();
        return Form.makeform()+ MobileNo;
    }
}

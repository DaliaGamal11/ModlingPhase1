public class CreditCard implements PaymentMethod{
    public int Balance=1000000;
    @Override
    public void pay() {

        System.out.println("YOu paid via Credit Card");
    }
    public int getBalance(){
        return Balance;
    }
}

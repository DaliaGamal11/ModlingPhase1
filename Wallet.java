public class Wallet implements PaymentMethod{
    private int Balance;
    @Override
    public void pay(){
         Form F;
         System.out.println("You payy via Wallet");
    }
    public void Rechargebalance(int amount){
        CreditCard c = new CreditCard();
        Balance=c.getBalance()-amount;
    }
}

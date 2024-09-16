public class Landline implements IService {
    @Override
    public IProviders ProviderType(String SP) {
        if(SP.equals("Monthly receipt")){
            return new Monthly() ;
        }
        if(SP.equals("Quarter receipt")){
            return new Quarter();
        }
        return null;
    }

    @Override
    public void showlist() {
            System.out.println("1)Monthly");
            System.out.println("1)Quarter");

    }
    @Override
    public PaymentMethod payType(String payType) {
        if(payType.equals("CreditCard")){
            return new CreditCard();
        }
        if(payType.equals("Wallet")){
            return new Wallet();
        }
        if(payType.equals("Cash")){
            return new CshDelivary();
        }
        return null;
    }
    @Override
    public void showlistofPM() {
        System.out.println("1)Cash");
        System.out.println("1)CreditCard");
        System.out.println("1)Wallet");
    }
}

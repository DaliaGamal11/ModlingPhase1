public class Mobile implements IService {
    @Override
    public IProviders ProviderType(String SP) {
        if(SP.equals("Vodafone")){
            return new Vodafone();
        }
        if(SP.equals("Etisalat")){
            return new Etisalat();
        }
        if(SP.equals("Orange")){
            return new Orange();
        }
        if(SP.equals("WE")){
            return new WE();
        }
        return null;
    }

    @Override
    public void showlist() {
        System.out.println("1)Vodafone");
        System.out.println("1)Orange");
        System.out.println("1)WE");
        System.out.println("1)Etisalat");
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

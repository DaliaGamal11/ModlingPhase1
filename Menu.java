public class Menu {
    public Menu (String service){
        if(service.equals("Mobile")){
            System.out.println("1)Vodafone");
            System.out.println("2)Etisalat");
            System.out.println("3)Orange");
            System.out.println("4)We");
        }
        if(service.equals("Interent")){
            System.out.println("1)Vodafone");
            System.out.println("2)Etisalat");
            System.out.println("3)Orange");
            System.out.println("4)We");
        }
        if(service.equals("Landline")){
            System.out.println("1)Monthly");
            System.out.println("2)Quarter");
        }
        if(service.equals("Donations")){
            System.out.println("1)Cancer");
            System.out.println("2)Schools");
            System.out.println("3)Ngo");
        }
    }
}

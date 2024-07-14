import ACCOUNT.CustomerType;

public class Lab10 {
 
    
    public static void main(String[] args) {

        double originalPrice = 20.0;
        double discountMultiplier = 0.3;
        CustomerType customer = CustomerType.COMPANY;
        CustomerType customer2 = CustomerType.CUSTOMER;
        DiscountLevel discountLevel = DiscountLevel.FOUR;
        DiscountLevel customerDiscountLevel = DiscountLevel.ONE;
        double totalDiscountLevel = (customer.ordinal() + 1) * (discountLevel.ordinal() + 1);



        
        double newCost = originalPrice - (totalDiscountLevel * discountMultiplier);
        // System.out.println(customer.ordinal());
        System.out.println("Customer Type: " + customer.toString() + " Discount Level: " +discountLevel);
        System.out.println("Original Price: " + originalPrice + " New Price: " + newCost);

        double[] discountValues = {0.1, 0.2, 0.3, 0.4};
        double baseDiscountPercent = discountValues[discountLevel.ordinal()];
        System.out.println( "Base Discount Percent: "+ baseDiscountPercent);

        double[] customerDiscountValues = {1, 1.2};
        double baseDiscountCustomerPercent = customerDiscountValues[customerDiscountLevel.ordinal()];
        // double 
        System.out.println("BAse Discount " + baseDiscountCustomerPercent);
        
        double finalDiscountPercent = baseDiscountPercent * (customerDiscountValues[customer.ordinal()]);

        System.out.println("Final Discount: " + finalDiscountPercent);
        System.out.println(customer2.toString());


    }
}

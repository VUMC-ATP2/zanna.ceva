package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountRate {
    public static double serviceDiscountPremium = 0.2;
    public static double serviceDiscountGold = 0.15;
    public static double serviceDiscountSilver = 0.1;
    public static double productDiscountPremium = 0.1;
    public static double productDiscountGold = 0.1;
    public static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String memberType) {
        if (memberType == "Premium") {
            return serviceDiscountPremium;
        } else if (memberType == "Gold") {
            return serviceDiscountGold;
        } else if (memberType == "Silver") {
            return serviceDiscountSilver;
        } else
            return 0;
    }

    public static double getProductDiscountRate(String memberType) {
        if (memberType == "Premium") {
            return productDiscountPremium;
        } else if (memberType == "Gold") {
            return productDiscountGold;
        } else if (memberType == "Silver") {
            return productDiscountSilver;
        } else
            return 0;
    }
}


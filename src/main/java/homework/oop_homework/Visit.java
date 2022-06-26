package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@Setter
public class Visit {
    public Customer customer;
    public Date date;
    private double serviceExpense;
    private double productExpense;
    private double totalExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

//    public String getCustomer() {
//        return customer.getName();
//    }

    public double getServiceExpense() {
        return serviceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
    }

    public double getProductExpense() {
        return productExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }

    public double getTotalExpense() {
        return getServiceExpense() + getProductExpense();
    }
}
package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Marta");
        customer1.setMemberType("Silver");
        Date date = new Date();
        Visit visit1 = new Visit(customer1, date);
        visit1.setServiceExpense(20.00);
        visit1.setProductExpense(40.00);
        System.out.println("Customer: " + customer1.getName() + ", visit date/time: " + visit1.getDate());
        System.out.println("Any discounts? " + customer1.isMember());
        System.out.println("Discount card type: " + customer1.getMemberType());
        System.out.println("service expense: " + visit1.getServiceExpense() + " eur");
        System.out.println("product expense: " + visit1.getProductExpense() + " eur");
        System.out.println("total expense: " + visit1.getTotalExpense() + " eur");
        System.out.println("==========================================================");
        Customer customer2 = new Customer("Elza");
        customer2.setMemberType("Premium");
        Visit visit2 = new Visit(customer2, date);
        visit2.setServiceExpense(50.00);
        visit2.setProductExpense(00.00);
        System.out.println("Customer: " + customer2.getName() + ", visit date/time: " + visit2.getDate());
        System.out.println("Any discounts? " + customer2.isMember());
        System.out.println("Discount card type: " + customer2.getMemberType());
        System.out.println("service expense: " + visit2.getServiceExpense() + " eur");
        System.out.println("product expense: " + visit2.getProductExpense() + " eur");
        System.out.println("total expense: " + visit2.getTotalExpense() + " eur");
        System.out.println("==========================================================");
        Customer customer3 = new Customer("Ivonna");
        customer3.setMemberType("None");
        Visit visit3 = new Visit(customer3, date);
        visit3.setServiceExpense(10.00);
        visit3.setProductExpense(50.00);
        System.out.println("Customer: " + customer3.getName() + ", visit date/time: " + visit3.getDate());
        System.out.println("Any discounts? " + customer3.isMember());
        System.out.println("Discount card type: " + customer3.getMemberType());
        System.out.println("service expense: " + visit3.getServiceExpense() + " eur");
        System.out.println("product expense: " + visit3.getProductExpense() + " eur");
        System.out.println("total expense: " + visit3.getTotalExpense() + " eur");
    }
}

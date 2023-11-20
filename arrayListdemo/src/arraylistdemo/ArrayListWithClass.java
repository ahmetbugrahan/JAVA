package arraylistdemo;

import java.util.ArrayList;

class Customer{
    int id;
    String firstName;
    String lastName;
    public Customer(){
        
    }
    public Customer(int id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    
}
public class ArrayListWithClass {
    public static void main(String[] args) {
    ArrayList<Customer> customers=new ArrayList<Customer>();
    customers.add(new Customer(1,"Engin","Demir"));
    customers.add(new Customer(2,"Ahmet","Demiroglu"));
    customers.add(new Customer(2,"Ahmet","Kacar"));
    for(Customer customer:customers){
        System.out.println(customer.firstName);
    }
    }
    
}

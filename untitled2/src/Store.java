import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class Store {


    Scanner in = new  Scanner(System.in);

    private String name;
    ArrayList<Product> Products;
    ArrayList<Customer> customers;
    ArrayList<Employee> employees;

    public Store() {
        this.name = null;
        Products = new ArrayList<Product>();
        customers = new ArrayList<Customer>();
        employees = new ArrayList<Employee>();
    }

    public Store(String name) {
        this.name = name;
        Products = new ArrayList<Product>();
        customers = new ArrayList<Customer>();
        employees = new ArrayList<Employee>();
    }

    public String getName() {
        return this.name;
    }

    public boolean isExist(String pro_name) {
        for (int i = 0; i < Products.size(); i++) {
            if (pro_name.equals(Products.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

    public void addProduct(Product new_product) {
        if (Products.size() == 10000) {
            System.out.println("the store is full");
        } else {
            Products.add(new_product);
        }
    }

    public Product search ()
    {
        System.out.println("Price");
        double Price=in.nextDouble();
        int find=0;
        for (int i = 0; i < Products.size(); i++)
            if(Products.get(i).getPrice()==Price)
                System.out.println("yes Products");

            else
                System.out.println("no Products");

        return   Products.get(0);
    }





    public void removeProduct(String pro_name) {
        if (Products.isEmpty()) {
            System.out.println("the store is empty ");
        } else {
            if (isExist(pro_name)) {
                for (int i = 0; i < Products.size(); i++) {
                    if (pro_name.equals(Products.get(i).getName())) {
                        Products.remove(i);
                    }
                }
            } else {
                System.out.println("this product not exist ");
            }
        }
    }

    public void totalPrice(int customer_id) {
        double total = 0.0;
        double discount = 0.0;
        for (int i = 0; i < customers.size(); i++) {
            if (customer_id == customers.get(i).getID()) {
                total += customers.get(i).getPurchased();
                if (customers.get(i).isSpecial_customer()) {
                    discount = total * (0.25);
                    total -= discount;
                }
            }
        }
        System.out.println("discount: %.2f RS.\n" + discount);
        System.out.println("with total price: %.2f RS .\n" + total);
    }

    public void buy(int cust_id) {
        for (int i = 0; i < customers.size(); i++) {
            if (cust_id == customers.get(i).getID()) {
                for (int j = 0; j < customers.get(i).purchased.size(); j++) {
                    removeProduct(customers.get(i).purchased.get(j).getClass().getName());
                }
            }
        }
    }

    public void print_pro() {
        for (int i = 0; i < Products.size(); i++) {
            System.out.println(Products.get(i).toString());
        }
    }

    public void print_cust() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).toString());
        }
    }

    public void print_emp() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
    }

    public void increce_salary(double prc) {
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).SetNewSalary(prc);
        }
    }

    public boolean check_manager(int id) {
        boolean stat = false;
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getID()) {
                if (employees.get(i).isManager()) {
                    stat = true;
                }
            }
        }
        return stat;
    }

    public void print_special_pro(){
        System.out.println("(In IT)The List of special product");
        for(int i=0; i<Products.size();i++){
            if("IT".equals(Products.get(i).getKind())){
                System.out.println(Products.get(i).toString());
            }
        }
    }
}

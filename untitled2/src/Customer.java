import java.awt.image.ImageProducer;
import java.util.ArrayList;


public class Customer  extends Users {
    private int num_visits;

    private boolean special_customer;
    public ArrayList purchased;

    public Customer(){
        super.setName(null);
        super.setID();
        this.num_visits=0;
        this.special_customer=false;
        purchased=new ArrayList<>();
    }

    public Customer(String name){
        super(name);
        super.setID();
        this.num_visits=0;
        this.special_customer=false;
        purchased=new ArrayList<>();
    }

    @Override
    public void setName(String name) {
        super.name=name;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getID(){
        return super.ID;
    }
    public void setVisits(){
        num_visits++;
    }

    public int getVisits(){
        return this.num_visits;
    }
    public boolean isSpecial_customer(){
        if(num_visits>2){
            this.special_customer=true;
        }
        return this.special_customer;
    }

    public String getTtpeOfCustomer(){
        if(isSpecial_customer()){
            return "Special customer";
        }
        return "New customer";
    }

    public void addPurchased (Product new_purchased){
        purchased.add(new_purchased);
    }

    public double getPurchased(){
        double total=0;
        for(int i=0;i<purchased.size();i++){
            System.out.println(purchased.get(i).toString());
            //  total+=purchased.get(i);
        }
        return total;
    }

    @Override
    public String toString() {
        return getTtpeOfCustomer()+": "+getName()+" ("+getID()+") "+"visits "+getVisits()+" time(s.";
    }

}

public class Product {

    private String pro_name;
    public double price;
    static int ID_start=0;
    private int ID;
    private String kind;

    public Product(){
        this.pro_name=null;
        this.price=0.0;
        this.kind=null;
        this.ID=++ID_start;
    }
    public Product(String name, double price, String kind){
        this.pro_name=name;
        this.price=price;
        this.kind=kind;
        this.ID=ID_start++;
    }
    public void setName(String name){
        this.pro_name=name;
    }

    public String getName(){
        return this.pro_name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setKind(String kind){
        this.kind=kind;
    }
    public String getKind(){
        return this.kind;
    }

    public void setID(){
        this.ID=ID_start;
    }
    public int getID(){
        return this.ID;
    }

    @Override
    public String toString() {
        return "product"+"("+getID()+")"+getName()+" cost"+getPrice()+"RY.";
    }
}

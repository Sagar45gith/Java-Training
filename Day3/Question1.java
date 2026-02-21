class Product{
    String productName;
    double price;
    static{
        System.out.println("Product class Loaded");
    }
    {
        System.out.println("Product object created");
    }
    Product(String productName, double price){
        this.productName = productName;
        this.price=price;
    }
    double calDis(){
        return price;
    }
}

class Electronics extends Product{
    int WarrantyYears;
    Electronics(String pName, double price, int wy){
        super(pName,price);
        this.WarrantyYears = wy;

    }

    @Override
    double calDis(){
        double discount=price/10;
        return price-discount;
    }
}

public class Question1{
    public static void main(String[] args){
        Product p = new Electronics("Laptop", 50000, 5);
        double ff = p.calDis();
        System.out.println("Toal price(w discount) "+ff);
    }
}
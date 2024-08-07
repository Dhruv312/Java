// Scenario 4: Stock Market Analysis
// In a stock market analysis system, define a base class called "Stock" with a method called "getStockData" that returns an instance of the "Stock" class. Implement derived classes like "TechStock" and "PharmaStock" that override the "getStockData" method and return their specific stock data objects.

class Stock{
    protected String name;
    protected double price;

    public Stock(String name,double price){
        this.name=name;
        this.price=price;
    }

    public Stock getStockData(){
        return this;
    }

    public String toString(){
        return "Stock {"+"Name: "+name+" ,Price: "+price+"}";
    }
}

class TechStock extends Stock{
    public TechStock(String name,double price){
        super(name, price);
    }

    public TechStock getStockData(){
        return this;
    }
    public String toString(){
        return "TechStock {"+"Name: "+name+" ,Price: "+price+"}";
    }
}
public class Task4 {
    public static void main(String[] args){
        TechStock t1=new TechStock("AAPL", 150.75);
        System.out.println(t1.getStockData());
    }
}

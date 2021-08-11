public class Products
{
    int id,qty,price;
    String name;
    public void Products()
    {
        //non-parametrised constructor
    }
    public void Products(int id, String name, int price , int qty)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public int getId()
    {
        return id;

    }
    public int getQty()
    {
        return qty;
    }
    public int getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
}

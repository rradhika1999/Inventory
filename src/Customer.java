public class Customer
{
    int id;
    String name;
    Customer()
    {}
    Customer(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}

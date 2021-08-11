import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class Shop
{
    static int total_amount = 0;
    Queue<Customer> customerQueue = new LinkedList<>();
    public static void main(String[] args)throws OutOfStock
    {
        Groceries g1 = new Groceries(101,"oranges",15,10);
        Groceries g2 = new Groceries(105,"rice",1000,10);
        Furniture f1 = new Furniture(101,"Table",15000,10);
        Electronics e1 = new Electronics(709,"Laptop",120000,10);
        Customer c1 = new Customer(110,"Kevin");
        Customer c2 = new Customer(123,"Damon");
        Customer c3 = new Customer(312,"Elijah");
        Customer c4 = new Customer(700,"Katherine");
        Customer c5 = new Customer(529,"Elena");
        Customer c6 = new Customer(809,"Stefen");
        Customer c7 = new Customer(678,"Matt");
        Shop s = new Shop();
        s.purchase(g1,5);
        s.purchase(g2,3);
        s.purchase(f1,4);
        s.purchase(e1,2);
        s.addCust(c1);
        s.addCust(c2);
        s.addCust(c3);
        s.addCust(c4);
        s.addCust(c5);
        s.addCust(c6);
        s.addCust(c7);
        s.Display();
    }
    public void purchase(Products p,int purchase_count) throws OutOfStock
    {
        if(purchase_count <= p.getQty())
        {
            int qty = p.getQty();
            qty -= purchase_count;
            total_amount += p.getPrice()*purchase_count;
        }
        else
        {
            throw new OutOfStock("This item is currently out of stock");
        }
    }
    public void addCust(Customer c)
    {
        if(customerQueue.size() > 5) {
            while (customerQueue.size() >= 5) {
                System.out.println("Already 5 customers waiting");
                break;
            }
        }
        else
        {
            customerQueue.add(c);
            System.out.println(c.name+" is in queue");
        }
    }
    public void Display()
    {
        System.out.println("Purchase Amount: "+total_amount);
    }
}

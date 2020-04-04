class Receipt
{
    List<Item> items;
    
    void Receipt()
    {
        items = new List<Items>();
    }
    
    void addReceipt(String name, double price)
    {
        Item item = new Item(name, price);
        items.add(item);
    }
    
}

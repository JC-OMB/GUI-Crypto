// ShoppingMain provides method main for a simple shopping program.

public class ShoppingMain {
    public static void main(String[] args) {
        Catalog list = new Catalog("CS Gift Catalog");
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 // Total duration: 40 mins //  From Tlalpan to Coyoacan Center ", 200, " yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 // Total duration: 40 mins //  From Tlalpan to Coyoacan Center ", 200, " yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 // Total duration: 40 mins //  From Tlalpan to Coyoacan Center ", 200, " yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 // Total duration: 40 mins //  From Tlalpan to Coyoacan Center ", 200, " yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 // Total duration: 40 mins //  From Tlalpan to Coyoacan Center ", 200, " yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 // Total duration: 40 mins //  From Tlalpan to Coyoacan Center ", 200, " yes"));
        list.add(new Item("Car Model: Toyota  //  Date: May 15  //  Hour: 16:30 // Total duration: 40 mins //  From Tlalpan to Coyoacan Center ", 200, " yes"));
      

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
    }
}

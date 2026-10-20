public class Main{
    public static void main(String[] args){
        Pizza myPizza = new PlainPizza();
        myPizza = new Cheese(myPizza);
        myPizza = new Olives(myPizza);
        myPizza = new Pineapple(myPizza);

        System.out.println("Description: " + myPizza.getDescription());
        System.out.println("Total Cost: " + myPizza.getCost() + "$");
    }
}
class Pineapple extends PizzaDecorator {
    public Pineapple(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Pineapple";
    }
    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}

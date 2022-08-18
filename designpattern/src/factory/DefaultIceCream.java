package factory;

class DefaultIceCream extends IceCream {
    private int price;

    public DefaultIceCream(int price) {

        this.price = price;
    }

    @Override
    public int getPrice() {

        return this.price;
    }
}

package factory;

class StrawberryIceCream extends IceCream {
    private int price;

    public StrawberryIceCream(int price) {

        this.price = price;
    }

    @Override
    public int getPrice() {

        return this.price;
    }
}

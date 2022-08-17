package observer;

public class ObserverTest {

    public static void main(String[] args) {

        Taylor taylor = new Taylor();
        Olivia olivia = new Olivia();
        John john = new John();
        Lucas lucas = new Lucas();

        taylor.attach(olivia);
        taylor.attach(john);
        taylor.attach(lucas);

        taylor.giveHomework();
    }
}

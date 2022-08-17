package observer;

public class Olivia implements Student{
    @Override
    public void update(String message) {
        System.out.println("Olivia 수신 : " + message);
    }
}

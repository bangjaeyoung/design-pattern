package observer;

public class Lucas implements Student{
    @Override
    public void update(String message) {
        System.out.println("Lucas 수신 : " + message);
    }
}

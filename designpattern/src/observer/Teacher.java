package observer;

public interface Teacher {

    void attach(Student student);
    void detach(Student student);
    void notifyStudent(String message);
}
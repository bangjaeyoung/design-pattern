package observer;

import java.util.ArrayList;
import java.util.List;

public class Taylor implements Teacher{

    private List<Student> students = new ArrayList<>();

    public void teachMath() {
        System.out.println("테일러 선생님이 수학을 가르친다.");
        notifyStudent("지금부터 수학가르칠거다~");
    }

    public void startAnnoying() {
        System.out.println("테일러 선생님이 화를 내신다.");
        notifyStudent("혼낸다!");
    }

    public void giveHomework() {
        System.out.println("테일러 선생님이 숙제를 내주신다.");
        notifyStudent("오늘 숙제 내줄거다~!");
    }

    @Override
    public void attach(Student student) {
        students.add(student);
    }

    @Override
    public void detach(Student student) {
        students.remove(student);
    }

    @Override
    public void notifyStudent(String message) {
        students.forEach(student -> student.update(message));
    }
}

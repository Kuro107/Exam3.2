import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws MyException {
        List<Person> guys = new LinkedList<>(); // создаем LinkedList

        //создаем несколько Person

        Person p = new Person("Za", "Za", "Za");
        Person p1 = new Person("Za1", "Za2", "Za3");
        Person p2 = new Person("Za", "Za", "Za");

        //метод для добавления Person в LinkedList
        //не стал изобретать велосипед и воспользовался готовым методом (add)

        guys.add(p);
        guys.add(p1);
        guys.add(p2);

        // при попадании дублирующихся Person в список - вызывать исключение

        for (int i = 0; i < guys.size(); i++) {
            for (Object o : guys) {
                if (guys.get(i).equals(o)) {
                    throw new MyException("This person is already added");
                }
            }
        }
    }
}

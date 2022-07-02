import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws MyException {
//  создаем LinkedList
        List<Person> guys = new LinkedList<>();
//  создаем объект класса person и добавляем в LinkedList что бы список не был пустым
        Person person = new Person("A", "B", "C");
        guys.add(person);
//  вызываем метод для создания и добавления Person в LinkedList
        addPersonToList(guys);


        // при попадании дублирующихся Person в список - должен вызывать исключение

        for (int i = 0; i < guys.size(); i++) {
            for (int j = 0; j< guys.size(); j++) {
                if (guys.get(i).equals(guys.get(j))) {
                    throw new MyException("This person is already added");
                }
            }
        }
    }

        //метод для добавления Person в LinkedList

    public static void addPersonToList (List<Person> guys) {
        LinkedList<Person> somePerson = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Введите ФИО персонажа которого хотите добавить");
            somePerson.add(new Person(scanner.next(), scanner.next(), scanner.next()));
            System.out.println("Для продолжения добавления нажмите 1, для выхода любую другую цифру ");
            int s = scanner.nextInt();
            if (s != 1){
                guys.addAll(somePerson);
                exit = false;
            }

        }

    }
}


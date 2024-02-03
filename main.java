import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Person person = new Person("Person " + i, 20 + i);
            personList.add(person);
        }

        for (Person person : personList) {
            System.out.println(person);
        }

        for (int i = 0; i < personList.size(); i++) {
            if (i % 2 == 0) {
                Person updatedPerson = personList.get(i);
                updatedPerson.setAge(updatedPerson.getAge() + 1);
            }
        }

        System.out.println("После обновления возраста:");
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

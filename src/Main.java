public class Main {
    public static void main(String[] args) {
        Person person = new Person("Сергей", 22);
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());

        person.setName("Оксана");
        person.setAge(47);
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}
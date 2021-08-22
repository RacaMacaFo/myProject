package school.lesson8.task2;

public class Main {
    public static void main(String[] args){
        System.out.println("Телефоная книга");
        Phonebook phonebook = new Phonebook();
        System.out.println("================================================");

        System.out.println("Запись в справочник");
        phonebook.add("Кипелов", "+380631112233");
        phonebook.add("Кинчев", "+380632223344");
        phonebook.add("Шевчук", "+380633334455");
        phonebook.add("Цой", "+380634445566");
        phonebook.add("Шевчук","+380635556677");
        phonebook.add("Летов","+380636667788");
        phonebook.add("Кинчев","+380637778899");
        System.out.println("=================================================");

        System.out.println("Фамилия , номер телефона");
        System.out.println("Кипелов");
        System.out.println(phonebook.get("Кипелов"));
        System.out.println("Кинчев");
        System.out.println(phonebook.get("Кинчев"));
        System.out.println("Шевчук");
        System.out.println(phonebook.get("Шевчук"));
        System.out.println("Цой");
        System.out.println(phonebook.get("Цой"));
        System.out.println("Летов");
        System.out.println(phonebook.get("Летов"));



    }
}


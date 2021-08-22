package school.lesson8.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private final HashMap<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public void add(String lastname, String number){
        if(book.containsKey(lastname)){
            List<String> numbers = book.get(lastname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.printf("Номер %s добавлен для фамилии %s%n", number, lastname);
            }
        } else {
            book.put(lastname, new ArrayList<>(List.of(number)));
            System.out.printf("Номер %s добавлен для фамилии %s%n", number, lastname);
        }
    }

    public List<String> get(String lastname){
            return book.get(lastname);
    }
    }

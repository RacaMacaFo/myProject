package school.lesson4;

import java.util.Scanner;

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    public int age;
    public String name;


    abstract void run(int length);

    abstract void swim(int length);


}

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }

}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;


    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }


}

class Skills {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(200);
        cat.swim(0);


        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

    }
}

class Counter {

    String name;
    int age;

    static int count = 0;

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Барсик";
        count++;

        Dog bobic = new Dog();
        bobic.age = 5;
        bobic.name = "Бобик";
        count++;

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        System.out.println("Мы создали пса по имени " + bobic.name + ", его возраст - " + bobic.age);

        System.out.println("Общее количество животных = " + count);
    }

}


class Cat1 {
    public String name;
    public int appetite;
    public boolean fullness;

    public Cat1(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
    public static class Plate {
        public int food;
        public Plate(int food) {
            this.food = food;
        }
        public void decreaseFood(int n) {
            food -= n;
        }
        public void increaseFood(int x) {
            food += x;
        }
        public void info() {
            System.out.println("Всего еды: " + food);
        }

        public static class Main {
            public static Scanner sc = new Scanner(System.in);
            public static void main(String[] args) {
                int action;
                Cat1[] allCats = new Cat1[4];
                allCats[0] = new Cat1("Barsik", 5, false);
                allCats[1] = new Cat1("Snezhok", 30, false);
                allCats[2] = new Cat1("Murzik", 10, false);
                allCats[3] = new Cat1("Markiz", 45, false);


                Plate plate = new Plate(100);
                plate.info();
                for (int i = 0; i < allCats.length; i++) {
                    if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                        allCats[i].eat(plate);
                        allCats[i].fullness = true;
                        System.out.println("Котик " + allCats[i].name + " поел!");
                    } else {
                        System.out.println("Котик " + allCats[i].name + " не поел!");
                    }
                }
                plate.info();
                System.out.println("Сколько грамм вискаса добавить еще в миску?");
                action = sc.nextInt();
                plate.increaseFood(action);
                plate.info();

            }
        }
    }
}



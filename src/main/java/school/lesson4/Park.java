package school.lesson4;

import java.util.Scanner;

public class Park {
    public static Scanner ob = new Scanner(System.in);
    public info info;
    public String attraction;

    public Park() {
        System.out.print("Введите название парка");
        setPark(ob.next());
        info = new info();
    }

    public String getPark() {
        return attraction;
    }

    public void setPark(String park) {
        this.attraction = attraction;
    }

    public class info {
        int att, time, price;

        public info() {
            System.out.print("Кол-во аттракционов:");
            setAtt(ob.nextInt());
            System.out.print("Время работы:");
            setTime(ob.nextInt());
            System.out.print("Стоимость:");
            setPrice(ob.nextInt());
        }

        public int getAtt() {
            return att;
        }

        public void setAtt(int att) {
            this.att = att;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void print() {
            System.out.print("В парке " + getAtt() + " атракцион(ов)," + " работают " + getTime() + " часа(ов), " + "стоимость " + getPrice() + " грн" );
        }
    }

    static public void main(String[] args) {
        Park ct = new Park();
        ct.info.print();
    }
}
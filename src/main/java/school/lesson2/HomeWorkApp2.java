package school.lesson2;

import school.lesson1.HomeWorkApp;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        HomeWorkApp2 task = new HomeWorkApp2();
//        task.taskOne(10, 4);
//        task.taskTwo(-1);
//        task.taskThree(2);
//        task.taskFour("Текс по дебильному написан ", 5);
//        task.taskFive(2020);
//        task.taskSix();
//        task.taskSeven();
//        task.taskEight();
//        task.taskNine();
//        task.taskTen(5, 231);

    }

    public boolean taskOne(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else return false;
    }

    public void taskTwo(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public boolean taskThree(int a) {
        if (a >= 0) {
            return true;
        } else return false;
    }

    public void taskFour(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public boolean taskFive(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            return false;
        } else {
            return true;
        }
    }

    public void taskSix() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void taskSeven() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void taskEight() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void taskNine() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i==j) || (((i+1) + (j+1)) == 6)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }

    public void taskTen(int len, int initialvalue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialvalue;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }




}















    
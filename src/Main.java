public class Main {
    public static void main(String[] args) {
        /////////////Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
        /////////Задача 2

        int temp = 7;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        ////////Задача 3
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
        //////Задача 4
        int man = 26;
        if (man >= 2 && man <= 6) {
            System.out.println("Если возраст человека равен " + man + " , то ему нужно ходить в детский сад");
        }
        if (man >= 7 && man <=17) {
            System.out.println("Если возраст человека равен " + man + " , то ему нужно ходить в школу");
        }
        if (man >= 18 && man <= 24) {
            System.out.println("Если возраст человека равен " + man + " , то его место в университете");
        }
        if (man > 24) {
            System.out.println("Если ворзраст человека равен " + man + " , то ему пора на работу");
        }
        //////Задача 5
        int child = 15;
        if (child <= 5) {
            System.out.println("Если возраст ребенка равен " + child + " , то ему нельзя кататься на аттракционе");
        }
        if (child > 5 && child <= 14) {
            System.out.println("Если возраст ребенка равен " + child + " ,то ему можно кататься  на аттракционе в сопровождении взрослого");
        }
        if (child > 14) {
            System.out.println("Если возраст ребенка равен " + child + " ,то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        /////Задача 6
        int wagonPlace = 102;
        if (wagonPlace < 60 && wagonPlace >= 0) {
            System.out.println("В вагоне есть сидячее место");
        }
        else if (wagonPlace < 102 && wagonPlace >= 60) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
        /////////Задача 7
        int one = 5;
        int two = 4;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Число один наибольшее из всех");
        } else if (two > one && two > three) {
            System.out.println("Число два наибольшее из всех");
        } else {
            System.out.println("Число три наибольшее из всех");
        }


    }

}
public class Main {
    public static void main(String[] args) {

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }


        int temp = 7;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        int speed = 55;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        }

        int man = 25;
        if (man >= 2 && man <= 6) {
            System.out.println("Если возраст человека равен " + man + " , то ему нужно ходить в детский сад");
        } else if (man >=7 && man <=17) {
            System.out.println("Если возраст человека равен " + man + " ,то ему нужно ходить в школу");
        } else if (man >= 18 && man<= 24) {
            System.out.println("Если возраст человека равен " + man + " ,то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + man + " ,то ему пора ходить на работу");
        }


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

        int currentPassengers = 102;
        if (currentPassengers < 60 && currentPassengers >= 0) {
            System.out.println("В вагоне есть сидячее место");
        } else if (currentPassengers < 102 && currentPassengers >= 60) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }

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
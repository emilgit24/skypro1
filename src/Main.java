public class Main {

    public static void main(String... args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если восзраст меньше " + age + " нужно подождать");
        }


    // Task 2

        int temperature = 10;

        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку ");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки ");
        }

        // Task 3

        int speed = 65;

        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }

        // TASK 4

        int age1 = 19;

        if (age1 >= 2 && age1 <= 6) {
            System.out.println("ndetskiy sad");
        } else if (age1 >=7 && age1 <= 17){
            System.out.println("shkola");
        } else if (age1 >= 18 && age1 <=24) {
            System.out.println("univer");
        } else {
            System.out.println("rabotay");
        }


        // TASK 6

        int total = 102;
        int sit = 60;
        int place = 102;

        if (place <= 60) {
            System.out.println("est sidacee mesto");
        } else if (place < 102) {
            System.out.println(" est stoyacee mesto");
        } else {
            System.out.println("vagon polniy");
        }

        // TASK 7

        int one = 7;
        int two = 5;
        int three = 12;

        if (one > two && one > three) {
            System.out.println("one");
        } else if (two > one && two > three) {
            System.out.println("two");
        } else if (three > one && three > two) {
            System.out.println("three");
        }




    }
}

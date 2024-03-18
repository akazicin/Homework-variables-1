public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //task1
        int age = 16;
        if (age >= 18) {
            System.out.println(" Если возраст равен " + age + " он совершеннолетний");
        }
        if (age < 18) {
            System.out.println(" Если возраст равен " + age +
                    " он не достиг совершеннолетия, нужно немного подождать");
        }

//task2
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println(" На улице холодно, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println(" Сегодня тепло, можно идти без шапки");
        }

//task3
        int speed = 60;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
//task4
        int personsAge = 13;
        if (personsAge >= 2 && personsAge <= 6) {
            System.out.println(" Если возраст человека равен " + personsAge +
                    " ,то ему нужно ходить в детский сад");
        }
        if (personsAge >= 7 && personsAge <= 17) {
            System.out.println("Если возраст человека равен " + personsAge +
                    " ,то ему нужно ходить в школу");
        }
        if (personsAge >= 18 && personsAge <= 24) {
            System.out.println("Если возраст человека равен " + personsAge +
                    " ,то ему нужно ходить в университет");
        }

        if (personsAge > 24) {
            System.out.println(" Если возраст человека равен " + personsAge +
                    " ,то ему нужно ходить на работу");
        }


        //task5
        int childAge = 1;
        if (childAge <= 4) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ",то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println(" Если возраст ребенка равен " + childAge +
                    " ,то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    " можно кататься на аттракционе без сопровождения взрослого");
        }

        //task6
        int human = 30;
        if (human <= 60) {
            System.out.println(" В вагоне осталось " + -(human - 60) + " сидячих мест и 42 стоячих места ");
        } else if (human >= 60 && human <= 102) {
            System.out.println(" В вагоне закончились сидячие места и осталось " + (102 - human) + " стоячих мест");
        } else {
            System.out.println(" Вагон полностью забит, переполнено на " + -(102 - human) + " человек");
        }

        //task7

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(" one  максимум");
        } else {
            if (two > three) {
                System.out.println(" two максимум ");
            } else {
                System.out.println(" three максимум");
            }


        }
    }
}
public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", он не достиг совершеннолетия, нужно немного подождать");
        }
            System.out.println();

        int temperature = 8;
        if (temperature < 5) {
                System.out.println("На улице " + temperature + " нужно надеть шапку");
            } else {
                System.out.println("На улице " + temperature + " можно идти без шапки");
            }
                System.out.println();

        int speed = 59;
        if (speed > 60) {
                    System.out.println("Если скорость " + speed + " придется заплатить штраф");
            } else {
                    System.out.println("Если скорость " + speed + " можно ездить спокойно");
            }
        System.out.println();

        int ageMan = 20;
        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");
        }
        if (ageMan >= 5 && ageMan <= 14) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то его место в университете");
        }
        if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему пора ходить на работу");
        }
        System.out.println();

        int ageChildren = 13;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то он не может кататься на аттракционе.");
        }
        else if (ageChildren >= 5 && ageChildren <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren +
                               ", то он может кататься только в сопровождении взрослого. " +
                               "Если взрослого нет, то кататься нельзя.");
        }
        else  {
            System.out.println("Если возраст ребенка равен " + ageChildren +
                    ", то он может кататься без сопровождения взрослого.");
        }
        System.out.println();


        // Решание если можно использовать else if
        //int carriagePlace = 110;
        //if (carriagePlace < 60) {
        //    System.out.println("В вагоне есть сидячие места");
        //}
        //else if (carriagePlace >= 60 && carriagePlace < 102) {
        //    System.out.println("В ваоне есть стоячие места");
        //} else {
        //    System.out.println("В вагоне нет мест");
        //}

        int carriagePlace = 40;
        if (carriagePlace < 60) {
            System.out.println("Есть свободные сидячие места.");
        } else {
            if (carriagePlace < 102) {
                System.out.println("Есть стоячие места");
            }
            else {
                System.out.println("Мест нет");
            }
        }
        System.out.println();

        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
                System.out.println(two);
        } else {
            System.out.println(three);
        }
    }

}
public class Main {

        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
        }

        public static void task1 () {
            System.out.println("Задача 1");
            int age = 20;
            if (age >=18) {
                System.out.println("Твой возрвст - "+age+" лет. Ты можешь водить!");
            } else
            if (age <18) {
                System.out.println("Возраст еще не достиг совершеннолетия. Нужжно еще немного подожждать...(");
            }
        }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 20;
        if (temperature<5) {
            System.out.println("На улице " +temperature+" градуса, нужно надеть шапку");
        } else
        if (temperature>=5)  {
            System.out.println("На улице " +temperature+" градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed >60) {
            System.out.println("Если скорость "+speed+" , то придется заплатить штраф");
        } else
        if (speed<=60) {
            System.out.println("Если скорость "+speed+" , то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int peopleAge =70;
        if (peopleAge<2) {
            System.out.println("Если возраст человека равен "+peopleAge+" , то ему пора спать");
        } else
        if (peopleAge>=2 && peopleAge<=6) {
            System.out.println("Если возраст человека равен "+peopleAge+" , то ему нужно ходить в детский сад");
        } else
        if (peopleAge>=7 && peopleAge<=18) {
            System.out.println("Если возраст человека равен "+peopleAge+" , то ему нужно ходить в школу");
        } else
        if  (peopleAge>=18 && peopleAge<=24) {
            System.out.println("Если возраст человека равен "+peopleAge+" , то его место в университете ");
        } else
        if  (peopleAge>=24 && peopleAge<=60) {
            System.out.println("Если возраст человека равен "+peopleAge+" , то ему пора работать ");
        } else
        if (peopleAge>60) {
            System.out.println("Если возраст человека равен "+peopleAge+" , то ему пора отдохнуть");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int chaildAge = 20;
        boolean adult = false;
        if (chaildAge<5) {
            System.out.println("Если возраст ребенка равен "+chaildAge+" , то он не может кататься на аттракционе ");
        } else
        if (chaildAge>=5 && chaildAge<=14) {
            System.out.println("Если возраст ребенка равен "+chaildAge+" , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя. ");
            if (adult) {
                System.out.println("Можно кататься на аттракционе в сопровождении");
            } else
                System.out.println("Нельзя кататься на аттракционе без сопровождения взрослого");
        } else
        if (chaildAge>14) {
            System.out.println("Если возраст ребенка равен "+chaildAge+" , то он он может кататься без сопровождения взрослого. ");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int plases = 121;
        if (plases <=60) {
            System.out.println("В вагоне есть посадочные места");
        } else
        if (plases >60 && plases<=120) {
            System.out.println("В вагоне есть места");
        } else
        if (plases >120) {
            System.out.println("В вагоне нет мест");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one =1;
        int two =2;
        int three =3;
        if (one>two && one>three) {
            System.out.println("большее число - " +one);
        }
        if  (two>one && two>three) {
            System.out.println("бОльшее число - " +two);
        }
        else if (three>one && three>two) {
            System.out.println("бОльшее число - " + three);
        }

    }
}
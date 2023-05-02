public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }


    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8 + 4;
        var cat = 3.6 + 4;
        var paper = 763789 + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8 - 3.5;
        var cat = 3.6 - 1.6;
        var paper = 763789 - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Общий вес бойцов " + totalWeight);
        System.out.println("Разница между бойцами " + differenceWeight);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Разница между бойцами " + differenceWeight);
        differenceWeight = secondBoxer % firstBoxer;
        System.out.println("Разница между бойцами " + differenceWeight);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hours = 640;
        var worker = hours / 8;
        System.out.println("Всего работников в компании " + worker + " человек");
        worker = worker + 94;
        hours = 640 / worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + hours + " часа работы может быть поделено между сотрудниками");
    }
}
public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 2
        System.out.println("Задание 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 3
        System.out.println("Задание 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 4
        System.out.println("Задание 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задание 5
        System.out.println("Задание 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задание 6
        System.out.println("Задание 6");

        var fighter_1 = 78.2;
        var fighter_2 = 82.7;

        System.out.println(fighter_1 + fighter_2);
        System.out.println(fighter_2 - fighter_1);

        // Задание 7
        System.out.println("Задание 7");

        System.out.println(fighter_2 - fighter_1);
        System.out.println(fighter_2 % fighter_1);

        // Задание 8
        System.out.println("Задание 8");

        var totalTime = 640;
        var hoursForEach = 8;
        var totalEmployee = totalTime / hoursForEach;

        System.out.println("Всего работников в компании – " + totalEmployee + " человек!");

        totalEmployee = totalEmployee + 94;
        totalTime = totalEmployee * hoursForEach;

        System.out.println("Если в компании работает " + totalEmployee  + " человек, то всего " + totalTime +  " часов работы может быть поделено между сотрудниками!");

    }
}
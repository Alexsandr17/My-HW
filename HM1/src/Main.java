import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        boolean isTop = false;

        System.out.println("****\tДобро пожаловать в программу создания элтксиров\t***");
        System.out.println("Сегодня можете сварить:\n1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости\n" +
                "2. 2 кости ворона + 4 пельменя - Эликсир стойкости\n" +
                "3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности\n" +
                "4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир");
        System.out.println("Введите кол-во Жабьих глаз:");
        int first = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во Кости ворона:");
        int second = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во Слезы вурдалака:");
        int third = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во Пельмени:");
        int fourth = new Scanner(System.in).nextInt();
        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        if (first >= 3 &&second >= 1) {
            System.out.println("Вы можете сварить: Эликсир зоркости");
            isTop = true;
        }
        if (first >= 0 && second >= 2 && third >= 0 && fourth >= 4) {
            System.out.println("Вы можете сварить: Эликсир стойкости");
            isTop = true;
        }
        if (first >= 2 && second >= 0 && third >= 7 && fourth >= 1) {
            System.out.println("Вы можете сварить: Эликсир скрытности");
            isTop = true;
        }
        if (first >= 4 &&second >=3 && third >= 5 && fourth >=10) {
            System.out.println("Вы можете сварить: Запретный Эликсир ");
            isTop = true;
        }
        if (isTop == false) {
            System.out.println("Не хвотает не на один эликсир");
        }

        }
}






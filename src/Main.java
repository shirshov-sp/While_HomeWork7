public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ \"Циклы 2\"\n");


        //Задача 1
        System.out.println("Задача 1");
        double bank = 0;
        int freeMoney = 15000;
        int total = 2459000;
        int month = 0;
        while (bank < total) {
            month += 1;
            bank = bank * 1.01 + freeMoney;
        }
        System.out.println("Месяц " + (month) + ", сумма накоплений равна " + Math.round(bank * 100.0) / 100.0 + " рублей\n");


        //Задача 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        //Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17; //на 1000
        int mortalityRate = 8; //на 1000
        int currentYear = 2024;
        for (i = 0; i <= 10; i++) {
            System.out.print("Год " + currentYear + ", численность населения составляет " + population + "\n");
            currentYear++;
            population = population + (birthRate - mortalityRate) * population / 1000;
        }
        System.out.println();


        //Задача 4
        System.out.println("Задача 4");
        int deposit = 15000;
        bank = 0;
        total = 12_000_000;
        month = 0;
        while (bank < total) {
            month++;
            bank = bank * 1.07 + deposit;
            //System.out.println(month + " месяц, накоплено " + Math.round(bank * 100.0) / 100.0 + " рублей");
            //выводит с экспоненциальной нотацией всё, что больше 10млн., не красиво, поэтому ->
            System.out.print(month + " месяц, накоплено ");
            System.out.printf("%.2f", bank);
            System.out.println(" рублей");
        }
        System.out.println();


        //Задача 5
        System.out.println("Задача 5");
        deposit = 15000;
        bank = 0;
        total = 12_000_000;
        month = 0;
        while (bank < total) {
            month++;
            bank = bank * 1.07 + deposit;
            if (month % 6 == 0) {
                System.out.print(month + " месяц, накоплено ");
                System.out.printf("%.2f", bank);
                System.out.println(" рублей");
            }
        }
        System.out.println();


        //Задача 6
        System.out.println("Задача 6");
        deposit = 15000;
        bank = 0;
        month = 0;
        int depositTime = 9; //лет
        while (month <= depositTime * 12) {
            month++;
            bank = bank * 1.07 + deposit;
            if (month % 6 == 0) {
                System.out.print(month / 12.0 + " лет, накоплено ");
                System.out.printf("%.2f", bank);
                System.out.println(" рублей");
            }
        }
        System.out.println();


        //Задача 7
        System.out.println("Задача 7");
        int fridayDate = 3;
        do {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет");
            fridayDate = fridayDate + 7;
        }
        while (fridayDate <= 31);
        System.out.println();


        //Задача 8
        System.out.println("Задача 8");
        currentYear = 2024;
        int year200Ago = currentYear - 200;
        int year100After = currentYear + 100;
        int year = year200Ago;
        while (year <= year100After) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
            year += 1;
        }
    }
}

package com.company;

public class task2 {

    //2) Найти количество счастливых билетиков на трамвай от 000001 до 999999
    // (те у которых сумма первых 3 цифр равна сумме последних 3)

    public static void task2(String[] args) {
        int sum = 0;
        for (int i = 000001; i <= 999999; i++) {
            int number1 = i / 100000 % 10,
                    number2 = i / 10000 % 10,
                    number3 = i / 1000 % 10,
                    number4 = i / 100 % 10,
                    number5 = i / 10 % 10,
                    number6 = i % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
            }
        }
        System.out.println("Рулон билетов с номерами от 000001 до 999999 имеет " + sum + " счастливых билетов.");
    }
}


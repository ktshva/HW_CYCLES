package ru.netology.services.WorkAndVacation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WorkAndVacationTest {
    @Test
    void vacation() {

        WorkAndVacation service = new WorkAndVacation();

        // подготавливаем данные:
        int income = 100000;  // Доход
        int expenses = 60000;  // Расходы
        int threshold = 150000;  // Порог сбережений

        // вызываем целевой метод:

        int vacationMonths = service.calculate(income, expenses, threshold);

        System.out.println("Количество месяцев отдыха в следующий год: " + vacationMonths);
    }
}
package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    // Тест 1: Пример из задания (диапазон 200-300). Ожидается 3 числа (15, 16, 17).
    @Test
    void shouldCalculateThreeSquaresInExampleRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    // Тест 2: Проверка всего возможного диапазона (от 100 до 9801). Ожидается 90 чисел (от 10 до 99).
    @Test
    void shouldCalculateNinetySquaresInFullRange() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.calculate(100, 9801);

        Assertions.assertEquals(expected, actual);
    }

    // Тест 3: Диапазон, где нет ни одного совпадения. Ожидается 0.
    @Test
    void shouldCalculateZeroSquaresInEmptyRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(50, 99);

        Assertions.assertEquals(expected, actual);
    }

    // Тест 4: Диапазон, который включает только одно число (99*99 = 9801). Ожидается 1.
    @Test
    void shouldCalculateOneSquareAtMaxLimit() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculate(9800, 9801);

        Assertions.assertEquals(expected, actual);
    }
}
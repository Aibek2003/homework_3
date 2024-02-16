public class Main {
    public static void main(String[] args) {
        // Создаем массив дробных чисел
        double[] numbers = {8.0, 2.0, -2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 1.5, -3.0, 4.2, -6.8, 9.1, -5.5, 7.3};

        // Ищем первые два положительных числа
        int positiveCount = 0;
        double[] positiveNumbers = new double[2];

        for (double num : numbers) {
            if (num > 0 && positiveCount < 2) {
                positiveNumbers[positiveCount] = num;
                positiveCount++;
            }
        }

        // Ищем первое отрицательное число
        boolean negativeFound = false;
        double sumPositiveAfterNegative = 0;
        int countPositiveAfterNegative = 0;

        for (double num : numbers) {
            if (negativeFound && num > 0) {
                sumPositiveAfterNegative += num;
                countPositiveAfterNegative++;
            } else if (num < 0) {
                negativeFound = true;
            }
        }

        // Проверка на деление на ноль
        if (countPositiveAfterNegative > 0) {
            double averagePositiveAfterNegative = sumPositiveAfterNegative / countPositiveAfterNegative;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + averagePositiveAfterNegative);
        } else {
            System.out.println("Нет положительных чисел после первого отрицательного.");
        }
    }
}

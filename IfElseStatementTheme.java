public class IfElseStatementTheme {
    public static void main(String[] args) {
        int age = 21;
        boolean maleGender = true;
        double height = 1.86;
        String name = "Ivan";
        char nameFirstLetter = name.charAt(0);
        System.out.println("1. Перевод псевдокода на язык Java");
        if (age > 20) {
            System.out.println("Если тебе больше 20 лет то пора на завод");
        } else {
            System.out.println("Если тебе меньше 20 лет то нужно учиться в ПТУ, чтобы пойти на завод");
        }
        if (maleGender != true) {
            System.out.println("Скорее всего это женщина :)");
        } else {
            System.out.println("Скорее всего это мужчина :)");
        }
        if (height < 1.80) {
            System.out.println("Каши мало ел");
        } else {
            System.out.println("Стоит попробовать себя в волейболе");
        }
        if (nameFirstLetter == 'M') {
            System.out.println("Возможно тебя зовут Marina");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Возможно тебя зовут Ivan");
        } else {
            System.out.println("Тогда остается только Sashka");
        }

        System.out.println("\n2. Поиск max и min числа");
        double number1 = 14.1;
        double number2 = 14;
        if (number1 > number2) {
            System.out.println("Первое число max = " + number1 + " Второе число min = " + number2 +
                    " Первое число больше");
        } else if (number1 < number2) {
            System.out.println("Первое число min = " + number1 + " Второе число max = " + number2 +
                    " Второе число больше");
        } else {
            System.out.println("Первое число = " + number1 + " Второе число = " + number2 + " Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        double myNum = 7.7;
        System.out.println("Наше число = " + myNum);
        if (myNum == 0) {
            System.out.println("Наше число является нулем");
        } else {
            if (myNum % 2 == 0) {
                System.out.println("Наше число чётное");
            } else {
                System.out.println("Наше число нечётное");
            }
            if (myNum < 0) {
                System.out.println("Оно отрицательное");
            } else {
                System.out.println("Оно положительное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 714;
        int num2 = 117;
        int hundredNum1 = num1 / 100;
        int hundredNum2 = num2 / 100;
        int tenNum1 = (num1 % 100) / 10;
        int tenNum2 = (num2 % 100) / 10;
        int unitNum1 = num1 % 10;
        int unitNum2 = num2 % 10;
        System.out.println("Первое число = " + num1 + " Второе число = " + num2);
        if (hundredNum1 != hundredNum2 & tenNum1 != tenNum2 & unitNum1 != unitNum2) {
            System.out.println("Все цифры в разрядах разные!");
        } else {
            if (hundredNum1 == hundredNum2) {
                System.out.println("Третий разряд у чисел одинаков. Сотни = " + hundredNum1);
            }
            if (tenNum1 == tenNum2) {
                System.out.println("Второй разряд у чисел одинаков. Десятки = " + tenNum1);
            }
            if (unitNum1 == unitNum2) {
                System.out.println("Первый разряд у чисел одинаков. Единицы = " + unitNum1);
            }
        }
        //System.out.println("sotni " + hundredNum1 + " " + hundredNum2 + "\ndesytki " + tenNum1 + " " + tenNum2 +
        //        "\nedinici " + unitNum1 + " " + unitNum2);

        System.out.println("\n5. Определение символа по его коду");
        char newChar = '\u0057';
        System.out.println("Наш символ это " + newChar);
        if (newChar >= 'a' && newChar <= 'z') {
            System.out.println("Символ это маленькая буква");
        } else if (newChar >= 'A' && newChar <= 'Z') {
            System.out.println("Символ это большая буква");
        } else if (newChar >= '0' && newChar <= '9') {
            System.out.println("Символ это цифра");
        } else {
            System.out.println("Символ это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double depositAmount = 300_000;
        double depositInterest;
        System.out.println("Сумма вклада = " + depositAmount);
        if (depositAmount < 100_000) {
            depositInterest = depositAmount * 5 / 100;
            System.out.println("Начисленный процент = " + depositInterest);
            System.out.println("Итоговая сумма с процентами = " + (depositAmount + depositInterest));
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            depositInterest = depositAmount * 7 / 100;
            System.out.println("Начисленный процент = " + depositInterest);
            System.out.println("Итоговая сумма с процентами = " + (depositAmount + depositInterest));
        } else {
            depositInterest = depositAmount / 10;
            System.out.println("Начисленный процент = " + depositInterest);
            System.out.println("Итоговая сумма с процентами = " + (depositAmount + depositInterest));
        }

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int percentAverage;
        int estimationHistory;
        int estimationProgramming;
        int estimationAverage;
        if (percentHistory <= 60) {
            estimationHistory = 2;
        } else if (percentHistory > 60 & percentHistory <= 73) {
            estimationHistory = 3;
        } else if (percentHistory > 73 & percentHistory <= 91) {
            estimationHistory = 4;
        } else {
            estimationHistory = 5;
        }
        System.out.println("Оценка " + estimationHistory + " предмет История ");
        if (percentProgramming <= 60) {
            estimationProgramming = 2;
        } else if (percentProgramming > 60 & percentProgramming <= 73) {
            estimationProgramming = 3;
        } else if (percentProgramming > 73 & percentProgramming <= 91) {
            estimationProgramming = 4;
        } else {
            estimationProgramming = 5;
        }
        System.out.println("Оценка " + estimationProgramming + " предмет Программирование ");
        estimationAverage = (estimationHistory + estimationProgramming) / 2;
        System.out.println("Средний балл оценок по предметам = " + estimationAverage);
        percentAverage = (percentHistory + percentProgramming) / 2;
        System.out.println("Средний процент по предметам = " + percentAverage);

        System.out.println("\n8. Расчет прибыли за год");
        int rentPrice = 5000;
        int monthlyProfit = 13000;
        int cost = 9000;
        int yearProfit = (monthlyProfit * 12) - ((rentPrice + cost) * 12);
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit + " руб.");
        } else if (yearProfit < 0) {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }
    }
}
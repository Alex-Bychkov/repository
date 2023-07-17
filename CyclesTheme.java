public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int firstNum = -10;
        int lastNum = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int outFirst = firstNum;
        int outLast = lastNum;
        do {
            if (firstNum % 2 == 0) {
                sumEven += firstNum;
            } else {
                sumOdd += firstNum;
            }
            firstNum++;
        } while (firstNum <= lastNum);
        System.out.println("В промежутке [" + outFirst + "," + outLast + "]");
        System.out.println("Сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        int minNum = 0;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
            if (num2 > num3) {
                minNum = num3;
            } else {
                minNum = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
            if (num1 > num3) {
                minNum = num3;
            } else {
                minNum = num1;
            }
        } else if (num3 > num1 && num3 > num2) {
            maxNum = num3;
            if (num1 > num2) {
                minNum = num2;
            } else {
                minNum = num1;
            }
        }
        System.out.println("Max число = " + maxNum + " Min число = " + minNum);
        for (int i = --maxNum; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int numForReverse = 1234;
        int digit = 0;
        int digitSum = 0;
        System.out.println("Исходное число = " + numForReverse);
        System.out.println("Исходное число в обратном порядке = ");
        while (numForReverse != 0) {
            digit = numForReverse % 10;
            numForReverse /= 10;
            digitSum += digit;
            System.out.print(digit);
        }
        System.out.println("\nСумма его цифр = " + digitSum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int numStart = 1;
        int numFinish = 24;
        int lineWidth = 5;
        for (int i = 0; i < lineWidth; i++) {
            System.out.println();
            for (int j = 0; j < lineWidth && numStart > 0; j++) {
                System.out.format("%5d", numStart);
                numStart += 2;
                if (numStart >= numFinish) {
                    numStart = 0;
                    for (int k = 1; k < lineWidth && j + k < lineWidth; k++) {
                        System.out.format("%5d", numStart);
                    }
                }
            }
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int numToSearch = 3242592;
        int originalNum = numToSearch;
        int numTwos = 0;
        while (numToSearch > 0) {
            digit = numToSearch % 10;
            numToSearch /= 10;
            if (digit == 2) {
                numTwos++;
            }
        }
        if (numTwos == 0) {
            System.out.println("Число = " + originalNum + " не содержит двоек!");
        } else if (numTwos % 2 == 0) {
            System.out.println("Число = " + originalNum + " содержит " + numTwos + " четное количество двоек");
        } else {
            System.out.println("Число = " + originalNum + " содержит " + numTwos + " нечетное количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        char char1 = '*';
        char char2 = '#';
        char char3 = '$';
        int numChar2 = 5;
        int numStepChar2 = 5;
        for (int j = 0; j < 5; j++) {
            System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.print(char1);
            }
        }
        System.out.println();
        while (numStepChar2 > 0) {
            System.out.println();
            while (numChar2 > 0) {
                System.out.print(char2);
                numChar2--;
            }
            numStepChar2--;
            numChar2 += numStepChar2;
        }
        System.out.println("\n");
        do {
            System.out.println(char3 + "\n" + char3 + "" + char3);
        }
        while (char3 != '$');
        do {
            System.out.println(char3 + "" + char3 + "" + char3 + "\n" + char3 + "" + char3 + "\n" + char3);
        } while (char3 != '$');

        System.out.println("\n7. Отображение ASCII-символов");
        char symbol1 = 33;
        char symbol2 = 47;
        System.out.println("DECIMAL   CHARACTER");
        for (char i = symbol1; i <= symbol2; i++) {
            if (i % 2 != 0) {
                System.out.printf("%5d%10c%n", (int) i, i);
            }
        }
        char smallLetter1 = 97;
        char smallLetter2 = 122;
        for (char j = smallLetter1; j <= smallLetter2; j++) {
            if (j % 2 == 0) {
                System.out.printf("%5d%10c%n", (int) j, j);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int numForPalindrome = 1234321;
        int numReverse = 0;
        int digitPalindrome = 0;
        int originalPalindrome = numForPalindrome;
        while (numForPalindrome != 0) {
            digitPalindrome = numForPalindrome % 10;
            numReverse = numReverse * 10 + digitPalindrome;
            numForPalindrome = numForPalindrome / 10;
        }
        if (originalPalindrome == numReverse)
            System.out.println("Число " + originalPalindrome + " является  палиндромом");
        else
            System.out.println("Число " + originalPalindrome + " не является  палиндромом");

        System.out.println("\n9. Определение, является ли число счастливым");
        int luckyNum = 456564;
        int originalLuckyNum = luckyNum;
        int firstHalf = 0;
        int secondHalf = 0;


    }
}


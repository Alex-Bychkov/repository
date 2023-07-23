public class ArraysLesson {
    public static void main(String[] args) {
        System.out.println("1. Создайте массив целых чисел и найдите его сумму.");
        int[] array1 = {4, 5, 5, -6, 2};
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println("Сумма чисел в массиве = " + sum);

        System.out.println("\n2. Создайте массив строк и выведите на экран все строки, " +
                "у которых длина больше 5 символов.");
        String[] stringArray = {"my", "favorite", "food", "is", "chicken"};
        int stringLength;
        System.out.println("Строки с длиной > 5 символов:");
        for (int i = 0; i < stringArray.length; i++) {
            stringLength = stringArray[i].length();
            if (stringLength > 5) {
                System.out.println(stringArray[i]);
            }
        }

        System.out.println("\n3. Создайте массив целых чисел и найдите минимальное и максимальное значение в нем.");
        int[] array2 = {1, -1, 0, 112, 1, -222};
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < array2.length; i++) {
            if (maxNum < array2[i]) {
                maxNum = array2[i];
            } else {
                minNum = array2[i];
            }
        }
        System.out.println("Минимальное значение в массиве = " + minNum);
        System.out.println("Максимальное значение в массиве = " + maxNum);

        System.out.println("\n4. Создайте массив целых чисел и отсортируйте его по возрастанию.");
        int[] array3 = {14, 17, 91, 2, 1, -1, 0, 0, 64, -14};
        int buffer;
        int lengthArr = array3.length;
        for (int num : array3) {
            for (int i = 0; i < lengthArr - 1; i++) {
                if (array3[i] > array3[i + 1]) {            //Последовательное сравнение элементов массива
                    buffer = array3[i + 1];
                    array3[i + 1] = array3[i];
                    array3[i] = buffer;
                }
            }
        }
        for (int i = 0; i < lengthArr; i++) {               //Вывод отсортированного массива
            if (i == 0) {
                System.out.print("{" + array3[i] + ", ");   // Добавил условия чтобы были запятые и скобочки :)
            } else if (i == array3.length - 1) {
                System.out.print(array3[i] + "}");
            } else {
                System.out.print(array3[i] + ", ");
            }
        }

        System.out.println("\n\n5. Создайте двумерный массив и выведите на экран сумму каждой строки.");
        int[][] twoDimArray = {{1, 2, 0, -2}, {3, 0}, {5, 6, 0}, {7, -8, 12, 1}};
        for (int i = 0; i < twoDimArray.length; i++) {
            int sumString = 0;
            for (int j = 0; j < twoDimArray[i].length; j++) {
                sumString += twoDimArray[i][j];
            }
            System.out.println("Сумма строки " + (i + 1) + " = " + sumString);
        }

        System.out.println("\n6. Создайте двумерный массив и найдите наименьший элемент в каждом столбце.");
        int[][] twoDimArray2 = {
                //          {10, 22, 3, 4},
                {2, 31, 44, 44},
                {5, 21, 9, 13},
                {17, 18, 12, 21},
                {88, 99, 22, 33}};
        for (int i = 0; i < twoDimArray2.length; i++) {
            int minNumTwoDim = Integer.MAX_VALUE;
            for (int j = 0; j < twoDimArray2[i].length; j++) {
                if (minNumTwoDim > twoDimArray2[j][i]) {
                    minNumTwoDim = twoDimArray2[j][i];
                }
            }
            System.out.println("Минимальное число в столбце " + (i + 1) + " = " + minNumTwoDim);
        }

        System.out.println("\n7. Создайте массив целых чисел и определите, является ли он палиндромом.");
        int[] array4 = {1, 2, 5, 5, 2, 1};
        int lengthArray4 = array4.length;
        boolean palindrome = true;
        for (int i = 0; i < lengthArray4 / 2; i++) {
            if (array4[i] != array4[lengthArray4 - i - 1]) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Этот массив является палиндромом");
        } else {
            System.out.println("Этот массив не является палиндромом");
        }

        System.out.println("\n8. Вычисление среднего значения всех элементов в неравномерном массиве и создайте " +
                "новый массив, в  котором элементы будут  равны среднему числу в каждом подмассиве.");
        int[][] twoDimArray3 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        double[] averArray = new double[twoDimArray3.length];
        for (int i = 0; i < twoDimArray3.length; i++) {
            int sumString1 = 0;
            double averString = 0;
            for (int j = 0; j < twoDimArray3[i].length; j++) {
                sumString1 += twoDimArray3[i][j];
                averString = (double) sumString1 / (j + 1);
            }
            averArray[i] = averString;
            System.out.println("Сумма строки " + (i + 1) + " = " + sumString1);
            System.out.println("Среднее значение в строке " + (i + 1) + " = " + averString);
        }
        System.out.println("Массив из средних чисел строк: ");
        for (int k = 0; k < averArray.length; k++) {
            if (k == 0) {
                System.out.print("{" + averArray[k] + ", ");   // Добавил условия чтобы были запятые и скобочки :)
            } else if (k == averArray.length - 1) {
                System.out.print(averArray[k] + "}");
            } else {
                System.out.print(averArray[k] + ", ");
            }
        }

        System.out.println("\n\n9. Поиск максимальной суммы подмассива в неравномерном массиве.");
        int[][] twoDimArray4 = {{1, 2, 3}, {-4, 5}, {6, 7, 8, 9}, {-68, 3, 22, 0, 14, -7},
                {53, 6, -28, 30, 41}, {4, 32, 17}, {71, -39, 50, 20}};

    }
}

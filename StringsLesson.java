public class StringsLesson {
    public static void main(String[] args) {
        System.out.println("1. Напишите программу, которая выводит строку и ее длину.");
        String[] strings = {
                "Менеджер,  программист и тестировщик попали в ДТП,  несясь с горы,  из-за отказа тормозов",
                "Менеджер предложил сформировать группу обсуждения проблемы с тормозами",
                "Программист предложил проверить каждый винтик",
                "Тестировщик предложил затолкать машину в гору и повторить баг"
        };
        String minString = null;
        String maxString = null;
        int minLength = Integer.MAX_VALUE;
        int maxLength = 0;
        for (String string : strings) {
            int length = outputString(string);
            if (length <= minLength) {
                minLength = length;
                minString = string;
            }
            if (length >= maxLength) {
                maxLength = length;
                maxString = string;
            }
        }
        System.out.println("Минимальная строка: ");
        outputString(minString);
        System.out.println("Максимальная строка: ");
        outputString(maxString);

        System.out.println("\n2. Напишите программу, которая переписывает строки в обратном порядке, используя StringBuilder.");
        for (String string : strings) {
            System.out.println("Строка: " + string + " \nПеревернутая строка: " + reversString(string));
        }

        System.out.println("\n3. Напишите программу, которая  проверяет является ли строка палиндромом: ");
        String[] strings1 = {
                "Ежу хуже",
                "Лев осовел",
                "Кошмар, срам, шок",
                "Кирилл лирик"
        };

    }


    static int outputString(String string) {
        int stringLength = string.length();
        System.out.println("Строка: '" + string + "' имеет длину = " + stringLength);
        return stringLength;
    }

    static String reversString(String string) {
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        return builder.toString();
    }
}

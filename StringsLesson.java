
import java.util.Arrays;

public class StringsLesson {
    public static class Task1 {
        static String[] strings = {
                "Менеджер, программист и тестировщик попали в ДТП, несясь с горы, из-за отказа тормозов",
                "Менеджер предложил сформировать группу обсуждения проблемы с тормозами",
                "Программист предложил проверить каждый винтик",
                "Тестировщик предложил затолкать машину в гору и повторить баг"
        };

        public static void main(String[] args) {
            System.out.println("1. Напишите программу, которая выводит строку и ее длину. " +
                    "Найдите самую длинную строку. Найдите самую короткую строку.");
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
        }
    }

    static int outputString(String string) { //метод определяет длину строки
        int stringLength = string.length();
        System.out.println("Строка: '" + string + "' имеет длину = " + stringLength);
        return stringLength;
    }

    public static class Task2 {
        public static void main(String[] args) {

            System.out.println("\n2. Напишите программу, которая переписывает строки в обратном порядке, " +
                    "используя StringBuilder.");
            for (String string : Task1.strings) {
                if (string.length() != 0) {
                    System.out.println("Строка: " + string + " \nПеревернутая строка: " + reversString(string));
                } else {
                    System.out.println("Строка пустая");
                }
            }
        }
    }

    static String reversString(String string) {             //Метод, который переворачивает сроки
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        return builder.toString();
    }

    public static class Task3 {
        static String[] strings1 = {
                "Ежу хуже",
                "Лев осовел",
                "Кошмар, срам, шок",
                "Кирилл лирик",
                "12321"
        };

        public static void main(String[] args) {
            System.out.println("\n3. Напишите программу, которая  проверяет является ли строка палиндромом.");
            String reversString;
            String originalString;
            for (String string : strings1) {
                if (string.length() != 0) {
                    originalString = string;
                    reversString = reversString(string.replaceAll("[^а-яА-Яa-zA-Z0-9]", ""));
                    string = string.replaceAll("[^а-яА-Яa-zA-Z0-9]", "");
                    if (reversString.equalsIgnoreCase(string)) {
                        System.out.println("Строка: '" + originalString + "' это палиндром");
                    }
                    if (!reversString.equalsIgnoreCase(string)) {
                        System.out.println("Строка: '" + originalString + "' не является палиндром");
                    }
                } else {
                    System.out.println("Строка пустая");
                }
            }
        }
    }

    public static class Task4 {
        static String[] strings4 = {
                "Мне 13 лет, а тебе?",
                "Summertime sadness"
        };
        static char[] vowelLetters = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е',
                'А', 'У', 'О', 'Ы', 'И', 'Э', 'Я', 'Ю', 'Ё', 'Е',
                'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'
        }; //Массив гласных букв

        public static void main(String[] args) {
            System.out.println("\n4. Напишите программу, которая выводит по каждой строке массива: " +
                    "сколько в строке чисел, сколько букв, сколько пробелов, количество гласных букв в строке" +
                    " \nпишет всю строку в верхнем регистре, пишет всю строку в нижнем регистре.");
            for (String string : strings4) {
                int digit = 0;
                int letter = 0;
                int space = 0;
                int vowelLetter = 0;
                String lowerCaseString = string.toLowerCase();
                String upperCaseString = string.toUpperCase();
                for (int i = 0; i < string.length(); i++) {
                    if (Character.isDigit(string.charAt(i))) {
                        digit++;
                    }
                    if (Character.isLetter(string.charAt(i))) {
                        letter++;
                    }
                    if (Character.isWhitespace(string.charAt(i))) {
                        space++;
                    }
                    for (char ch : vowelLetters) {
                        if (string.charAt(i) == ch) {
                            vowelLetter++;
                        }
                    }
                }
                if (string.length() != 0) {
                    System.out.println("В строке: '" + string + "' цифр - " + digit + " букв - " + letter +
                            " пробелов - " + space + " гласных букв - " + vowelLetter);
                    System.out.println("Строка в верхнем регистре: " + upperCaseString);
                    System.out.println("Строка в нижнем регистре: " + lowerCaseString);
                } else {
                    System.out.println("Строка пустая");
                }
            }
        }
    }

    public static class Task5 {
        static String[] strings5 = {
                "Приданников Николай Михайлович",
                "Шканова Алина Александровна",
                "Яковлева Светлана Юрьевна",
                "Елисеев Антон Олегович",
                "Бычков Алексей Александрович",
                "Масанов Александр Николаевич",
                "Золотарёва Диана Евгеньевна",
                "Жулин Роман Геннадьевич",
                "Шевченко Евгения Николаевна",
                "Боровских Антон Евгеньевич",
                "Юсупова Светлана Эмильевна"
        };
        static char[] consonantLetters = {
                'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'
        }; //мы не ищем легких путей, да это массив согласных

        public static void main(String[] args) {
            System.out.println("5. Создайте массив строк, в котором перечислены все наши ФИО");
            Arrays.sort(strings5);
            System.out.println("Отсортированный массив ФИО с инициалами:");
            for (String string : strings5) {
                if ((string = string.trim()).isEmpty()) continue;
                String[] newStrings5 = string.split(" ");
                StringBuilder result = new StringBuilder(newStrings5[0] + " ");
                for (int i = 1; i < newStrings5.length; i++)
                    if (!(string = newStrings5[i].trim()).isEmpty()) {
                        result.append(string.substring(0, 1).toUpperCase() + ".");
                    }
                System.out.println(result);
            }
            System.out.println("\nВывод сотрудников, чьи фамилии начинаются на гласные:");
            for (String string : strings5) {
                for (char ch : Task4.vowelLetters) {
                    if (string.charAt(0) == ch) {
                        System.out.println(string);
                    }
                }
            }
            System.out.println("\nВывод сотрудников, чьи имена заканчиваются на согласные:");
            for (String string : strings5) {
                String[] names = string.split(" ");
                String name = names[1];
                for (char ch : consonantLetters) {
                    if (name.charAt(name.length() - 1) == ch)
                        System.out.println(string);
                }
            }
            System.out.println("\nВывод ФИО без повторяющихся символов");
            for (String string : strings5) {
                System.out.println();
                String[] names = string.toLowerCase().split(" ");
                for (String name : names) {
                    String str = "";
                    char ch;
                    for (int i = 0; i < name.length(); i++) {
                        ch = name.charAt(i);
                        str = str + ch;
                        name = name.replace(ch, ' ');
                        if (i == name.length() - 1) {
                            System.out.print(str.replaceAll("\\s", "") + " ");
                        }
                    }
                }
            }
        }
    }

    public static class Task6 {
        static String[] testEmptyStrings = {"", ""}; //массив пустых строк для тестов

        public static void main(String[] args) {
            System.out.println("6. Код, который принимает строки,  и возвращает массив слов, " +
                    "из которых состоит строка, а так же количество\n");
            for (String string : Task1.strings) {
                String[] words = string.split(" ");
                if (string.length() != 0) {
                    System.out.print(string);
                    System.out.print(" - Строка состоит из " + words.length + " слов");
                    System.out.println("\nСлова в строке:");
                    for (String word : words) {
                        System.out.print("'" + word.replaceAll("[,.!]", "") + "', ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Строка пустая");
                }
            }
        }
    }

    public static class Task7 {
        static String[] strings7 = {
                "", "Never sleep", "", "1986", "Мороз и солнце" //Массив с пустыми строками
        };

        public static void main(String[] args) {
            System.out.println("7. Напишите код, который в массиве строк находит пустую и пишет " +
                    "на какой позиции она находится");
            int nullString = 0;
            System.out.println("В массиве:");
            for (String string : strings7) {
                System.out.println("\"" + string + "\"");
            }
            for (int i = 0; i < strings7.length; i++) {
                if (strings7[i].equals("")) {
                    nullString++;
                    if (nullString != 0) {
                        System.out.println("Пустая строка имеет позицию в массиве = " + nullString);
                    }
                }
            }
            if (nullString != 0) {
                System.out.println("В массиве пустых строк = " + nullString);
            } else {
                System.out.println("Пустых строк нет");
            }
        }
    }

    public static class Task8 {
        static String reString = "Каждая !пустота! имеет своё !Начало строки!";

        static String replaceString(String string) {        //Метод подставлять подстроку в строки из массива
            StringBuilder builder = new StringBuilder(string);
            builder.replace(0, 5, reString.substring(28));
            String result = builder.toString();
            return result;
        }

        static String replaceSpace(String string) {         //Метод подставляет подстроку в строки вместо пробела
            String reSpace = reString.substring(7, 16);
            String substituted = " ";
            int strLength = string.length();
            StringBuilder builder = new StringBuilder(string);
            for (int i = 0; i < strLength; i++) {
                int index = builder.indexOf(substituted, i);
                if (index == -1) {
                    if (i == 0) {
                        return string;
                    }
                    return builder.toString();
                }
                builder = builder.replace(index, index + 1, reSpace);
            }
            return builder.toString();
        }

        public static void main(String[] args) {
            System.out.println("8.Напишите метод, который принимает строку и заменяет все вхождения одной подстроки " +
                    "на другую, используя StringBuilder.");
            for (String string : Task1.strings) {
                System.out.println(replaceString(string));
                System.out.println(replaceSpace(string));
            }
        }
    }
}

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        boolean desktopPc = true;
        float cpu = 3.3F;
        double memory = 1.333;
        byte core = 4;
        short ssd1 = 120;
        int ssd2 = 500;
        long hdd = 1000;
        char dGpu = 'Y';
        System.out.println(
                "Настольный компьютер " + desktopPc +
                "\nЧастота ЦП " + cpu +
                "\nЧастота Памяти " + memory +
                "\nЧисло ядер " + core +
                "\nОбъем SSD1 " + ssd1 +
                "\nОбъем SSD2 " + ssd2 +
                "\nОбъем HDD " + hdd +
                "\nДискретная видеокарта " + dGpu
        );

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penPrice= 100, bookPrice = 200, discnt = 0.11;
        System.out.println(
                "Общая стоимость товаров без скидки " + (penPrice + bookPrice) +
                "\nСумма скидки " + (penPrice + bookPrice) * discnt +
                "\nОбщая стоимость товаров со скидкой " + ((penPrice + bookPrice) - (penPrice + bookPrice) * discnt)
        );

        System.out.println(
                "\n3. Вывод слова JAVA \n" +
                "   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                 " JJ  a     a  V  a     a"
        );

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9223372036854775807L;
        System.out.println(
                "Byte " + byteNum + " " + ++byteNum + " "+ --byteNum +
                "\nShort " + shortNum + " " + ++shortNum + " "+ --shortNum +
                "\nInt " + intNum + " " + ++intNum + " "+ --intNum +
                "\nLong " + longNum + " " + ++longNum + " "+ --longNum
        );

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2, num2 = 5;
        System.out.println("С помощью третьей переменной \n" +
                "Исходные значения: Число1 = " + num1 + ", Число2 = " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Новые значения переменных: Число1 = " + num1 + ", Число2 = " + num2);
        System.out.println("С помощью арифметических операций \n" +
                "Исходные значения: Число1 = " + num1 + ", Число2 = " + num2);
        num1 += num2;
        num2 -= num1;
        num2 = -num2;
        num1 -= num2;
        System.out.println("Новые значения переменных: Число1 = " + num1 + ", Число2 = " + num2);
        System.out.println("С помощью побитовой операции \n" +
                "Исходные значения: Число1 = " + num1 + ", Число2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных: Число1 = " + num1 + ", Число2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char char1 = '#', char2 = '&', char3 = '@', char4 = '^', char5 = '_';
        System.out.println(
                "Код " + (int)char1 + " Символ " + char1 +
                "\nКод " + (int)char2 + " Символ " + char2 + "\nКод " + (int)char3 + " Символ " + char3 +
                "\nКод " + (int)char4 + " Символ " + char4 + "\nКод " + (int)char5 + " Символ " + char5
        );

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char1 = '/'; char2 = '\\';  char3 = '_'; char4 = '('; char5 = ')';
        System.out.println(
                "    " + char1 + char2 + "\n" +
                "   " + char1 + "  " + char2 + "\n" +
                "  " + char1 + char3 + char4 + " " + char5 + char2 + "\n" +
                " " + char1 + "      " + char2 + "\n" +
                char1 + char3 + char3 + char3 + char3 + char1 + char2 + char3 + char3 + char2
        );

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123, digit1 = num/100, digit2 = num%100/10, digit3 = num%10;
        System.out.println(
                "Число 123 содержит:\n" + digit1 + " сотен\n" + digit2 + " десятков\n" + digit3 + " единиц\n" +
                "Сумма его цифр = " + (digit1+digit2+digit3) +
                "\nПроизведение его цифр = " + (digit1*digit2*digit3)
        );

        System.out.println("\n9. Вывод количества сотен, десятков и единиц числа");
        int time = 86399, hour = time / 3600, min = time % 3600 / 60, sec = time / 60 % 60;
        System.out.println("Время " + hour + ":" + min + ":" + sec);
    }
}

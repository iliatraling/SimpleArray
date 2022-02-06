package Exersise14;

import java.util.Locale;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - лидер Интернета!";
        String str2 = new String(str1);
        str1.toLowerCase(Locale.ROOT);
        // экранирование \\
        String str3 = "C:\\masm32 projects";
        int result, idx;
        char ch;
        System.out.println("Длинa str1: " + str1.length());
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        if (str1.equals(str2)) {
            System.out.println("str1 эквивалентна str2");
        } else {
            System.out.println("str1 неэквивалентна str2");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 эквивалентна str3");
        } else {
            System.out.println("str1 неэквивалентна str3");
        }
        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 и str3 равны");
        } else if (result < 0) {
            System.out.println("str1 меньше str3");
        } else {
            System.out.println("str1 больше str3");
        }
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Индeкc первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индeкc последнего вхожения One: " + idx);
    }
}

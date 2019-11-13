package JaLaba2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean ok = true;
    while (ok) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("1.задание 1\n2.задание 2\n3.выход");
        n = in.nextInt();
        switch (n) {
            case 1:
                boolean OK = true;
                Task1 text = new Task1();
                text.setText();
                while (OK) {
                    System.out.println("Текущий текст: " + text.getText());
                    System.out.println("1.Найти сумму всех чисел(десятичная система)\n2.Изменить текст\n3.Увеличить каждую цифру на 1\n4.Определить сколько чисел N-ичной системы\n5.Сформировать строку из 16-ричных чисел\n6.Выход");
                    n = in.nextInt();
                    switch (n) {
                        case 1:
                            text.changeText();
                            break;
                        case 2:
                            text = new Task1();
                            text.setText();
                            break;
                        case 3:
                            text.summone();
                            System.out.println(text.getText());
                            break;
                        case 4:
                            System.out.print("Введите систему счисления которая вам интересна: ");
                            n = in.nextInt();
                            text.numSistem(n);
                            break;
                        case 5:
                            System.out.println(text.newtext());
                            break;
                        case 6:
                            OK = false;
                            break;
                    }
                }
                break;
            case 2:
                boolean OK1 = true;
                Task2 text1 = new Task2();
                text1.settext();
                break;
            case 3:
                ok = false;
                break;
        }
    }
    }
}

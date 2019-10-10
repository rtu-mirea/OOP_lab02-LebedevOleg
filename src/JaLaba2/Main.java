package JaLaba2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	boolean OK = true;
	int n;
	String text;
	Scanner in = new Scanner(System.in);
	System.out.println("Введите текс из чисел(числа разделяются ТОЛЬКО точкой).После числа через запятую пишется система счисления");
    text = in.nextLine();
    System.out.println(text);
	while (OK) {
        System.out.println("1.Найти сумму всех чисел(десятичная система)\n2.Увеличить каждую цифру на 1\n3.Определить сколько чисел N-ичной системы\n4.Сформировать строку из 16-ричных чисел,5.Выход");
        n = in.nextInt();
        switch (n) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                OK = false;
                break;
        }
    }
    }
}

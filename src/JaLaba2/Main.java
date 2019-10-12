package JaLaba2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	boolean OK = true;
	int n;
	Task1 text = new Task1();
	Scanner in = new Scanner(System.in);
	text.setText();
	while (OK) {
        System.out.println("Текущий текст: "+text.getText());
        System.out.println("1.Найти сумму всех чисел(десятичная система)\n2.Изменить текст\n3.Увеличить каждую цифру на 1\n4.Определить сколько чисел N-ичной системы\n5.Сформировать строку из 16-ричных чисел,6.Выход");
        n = in.nextInt();
        switch (n) {
            case 1:
                text.changeText();
                break;
            case 2:
                text.setText();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                OK = false;
                break;
        }
    }
    }
}

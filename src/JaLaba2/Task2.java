package JaLaba2;

import java.util.Scanner;

public class Task2 {
    private StringBuffer temp = new StringBuffer();
    private String[][] temp1;

    private Scanner in = new Scanner(System.in);
    public void settext(){
        boolean OK = true;
        System.out.println("Введите текс из чисел(числа разделяются ТОЛЬКО точкой).После числа через запятую пишется система счисления");
        while (OK) {
            temp = new StringBuffer(in.next());
            OK = false;
            for (int i = 0; i < temp.length(); i++) {
                if ((temp.charAt(i) >= 48 && temp.charAt(i) <= 57 || temp.charAt(i)>=65 && temp.charAt(i)<=70) || (temp.charAt(i)>=97 && temp.charAt(i)<=102) || temp.charAt(i) == 46 || temp.charAt(i) == 44);
                else {
                    System.out.println("Вы не правильно ввели текст. Пожалуйста введите число ',' система счисления '.' следующее число если нужно");
                    OK = true;
                    break;
                }
            }
        }


    }

}

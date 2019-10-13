package JaLaba2;
import java.util.Scanner;

public class Task1 {
    private String text;
    private String[][] temp1;

    Scanner in = new Scanner(System.in);
    void Task1(){
        text = "";
    }
    public void setText() {
        boolean OK = true;
        System.out.println("Введите текс из чисел(числа разделяются ТОЛЬКО точкой).После числа через запятую пишется система счисления");
        while (OK) {
            text = in.nextLine();
            OK = false;
            for (int i = 0; i < text.length(); i++) {
                if ((text.charAt(i) >= 48 && text.charAt(i) <= 57) || text.charAt(i) == 46 || text.charAt(i) == 44);
                else {
                    System.out.println("Вы не правильно ввели текст. Пожалуйста введите число ',' система счисления '.' следующее число если нужно");
                    OK = true;
                    break;
                }
            }
        }
    }
    public String getText() {
        return text;
    }
    public void changeText(){
        String x[] = text.split("\\.");
        temp1 =new String[x.length][2];
        for(int i= 0; i<x.length;i++){
           String z[] = x[i].split(",");
           if (z.length>2 || z[0]=="0" && z[1]=="0" || z[0] == "0"){
               System.out.print("Ошибка ввода. Введите текст заново.");
               break;
           }
           temp1[i][0] = z[0];
           temp1[i][1] = z[1];
        }
        int summ = 0;
        int t1 = 0, t2 = 0;
        for(int i = 0; i<temp1.length;i++){
            t2 = Integer.parseInt(temp1[i]);//whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy

        }
    }
}

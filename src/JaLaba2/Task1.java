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
        System.out.println("Введите текс из чисел(числа разделяются ТОЛЬКО точкой).После числа через запятую пишется система счисления");
        text = in.nextLine();
    }
    public String getText() {
        return text;
    }
    public void changeText(){
        for(int i = 0;i<text.length();i++)
        {
            if(text[i]>= 48)
        }
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

    }
}

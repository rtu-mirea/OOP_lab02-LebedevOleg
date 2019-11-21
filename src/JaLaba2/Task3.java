package JaLaba2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task3 {
    public void check(String x){
        String y[]= x.split(" ");
        Pattern p = Pattern.compile("^([0-9]|[a-fA-F])+");
        Matcher m;
        for (String i : y) {
            m = p.matcher(i);
            if(m.matches())
                System.out.println(i + " 16cc");
            else
                System.out.println(i + " не16сс");
        }
    }

    public void delete(String x){
        String y[] = x.split(" ");
        x+= " ";
        int len = y.length;
        Pattern p;
        Matcher m;
        for (int i =0; i<y.length-1;i++){
            x = x.replaceAll("(?:" + Pattern.quote(y[i] + " ") + "){2,}","");
    //         p= Pattern.compile(y[i]+ " " + (y[i])+);
      //        m = p.matcher(y[i+1]);
        //    if(m.matches()){
          //      for (int k = i; k < len - 1; k++) //сдвиг последующих элементов
            //        y[k] = y[k + 1];
              //  for (int k = i+1; k < len - 1; k++) //сдвиг последующих элементов
             //       y[k] = y[k + 1];
              //  len-=2;
            }


        x.trim();
        System.out.println(x);
    }
}

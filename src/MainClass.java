
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

          List<MySport> sports = new ArrayList<MySport>();
            sports.add(new Football ("hard", 90, "Fotbal", 25,4));
          sports.add(new Basket("last", 45, "Basket", 3));

       for(MySport s:sports) {
           System.out.println(s.toString());
           s.show();
       }
        MySport.add(4);
        MySport.add(3,6);
    }
}
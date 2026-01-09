import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;

public class SmartApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();
        while(true){
            System.out.println(LocalTime.now());
            System.out.print("コマンド (todo x/exit): ");
            String cmd = sc.nextLine();
            if(cmd.startsWith("todo ")){
                todos.add(cmd.substring(5));
            } else if(cmd.equals("exit")) break;
        }
    }
}

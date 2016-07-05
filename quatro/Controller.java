
package quatro;

import java.util.Scanner;
import java.io.*;

public class Controller  {
    
    ObservableTimer timer;
    
    public void setModel(ObservableTimer m) {
        timer = m;
    }
    
    public void input()  {
        try {
        File file = new File("timer.txt");
        FileWriter pw = new FileWriter(file);
        
        System.out.println("Tempo Inicial: ");
        Scanner in = new Scanner(System.in);
        int Input = in.nextInt();
        Integer num;
        timer.add(num = Input);
        pw.write(num.toString());        
        do {           
            timer.add(num = timer.tick());
            pw.write(num.toString());

        }while(timer.getNum() > 1);
        
        pw.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

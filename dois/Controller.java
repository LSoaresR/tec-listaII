
package dois;

import java.util.Scanner;


public class Controller  {
    
    ObservableTimer timer;
    
    public void setModel(ObservableTimer m) {
        timer = m;
    }
    
    public void input() {
        System.out.println("Tempo Inicial: ");
        Scanner in = new Scanner(System.in);
        int Input = in.nextInt();
        timer.add(Input);
        do {
            timer.add(timer.tick());
        }while(timer.getNum() != 1);
        
    }
}


package dois;


public class View implements TimerObserver {

    
    public void notificar(ObservableTimer observable) {
         System.out.println(observable.getNum());
         if(observable.getNum() == 1)
             System.out.println("***End***");
    }
    
}

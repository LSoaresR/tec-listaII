package tres;

public class View implements TimerObserver {

    
    public void notificar(ObservableTimer observable) {
         do {            
             System.out.println(observable.tick());  
         } while(observable.getNum() != 1);    
         System.out.println("***End***");
    }
    
}

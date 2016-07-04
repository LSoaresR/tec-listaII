package tres;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        ObservableTimer model = new Model();
        //model.addObserver(new View());
        model.addObserver(new Window());
        Controller controller = new Controller();
        controller.setModel(model);
        controller.input();
        
    }
    
}

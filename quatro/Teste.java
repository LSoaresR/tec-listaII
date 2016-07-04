
package quatro;

public class Teste {
    public static void main(String[] args) {
        ObservableTimer model = new Model();
        model.addObserver(new View());
        Controller controller = new Controller();
        controller.setModel(model);
        controller.input();
    }
    
}

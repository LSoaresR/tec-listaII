
package dois;

import java.util.ArrayList;

public class Model implements ObservableTimer {
    protected int num;
    private ArrayList<TimerObserver> observer = new ArrayList<>(); 
    
    public void add(int num) {
        this.num = num;
        notifyObservers();
    }
    
    public int tick() {
        this.num--;
        return this.num;       
    }
    
    public int getNum() {
        return num;
    }
    
    public void addObserver(TimerObserver observer) {
        this.observer.add(observer);
    }
    
    public void removeObserver(TimerObserver observer) {
        this.observer.remove(observer);
    }
    
    public void notifyObservers() {
        for(TimerObserver o :observer)
            o.notificar(this);
            
    }
    
}

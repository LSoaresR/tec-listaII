package tres;
public interface ObservableTimer {
    public void add(int num);
    public int tick();
    public int getNum();
   
    
    public void addObserver(TimerObserver observer);
    public void removeObserver(TimerObserver observer);
}

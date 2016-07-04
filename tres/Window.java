package tres;

import javax.swing.*;
import java.awt.*;

public class Window implements TimerObserver {
    
   
    @Override
    public void notificar(ObservableTimer observable) {
       
    JFrame janela = new JFrame();
    Tratador tratador = new Tratador();
    
    janela.addWindowListener(tratador);
    
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
   // p.setBackground(Color.blue);
    
    janela.setContentPane(p);
    janela.setSize(500, 500);
    
    JPanel panelleft = new JPanel();
    JPanel panelcenter = new JPanel();
    panelleft.setLayout(new GridLayout(3,2));
    
    p.add("West", panelleft );
    p.add("Center",panelcenter);
    
    //Form
    JLabel text = new JLabel("From");
    text.setSize(100, 200);
    panelleft.add(text);
    
    JTextField fe = new JTextField("");
    panelleft.add(fe);
    Integer a = (Integer)observable.getNum();
    fe.setText(a.toString());
        
       
    //Start
    JButton start = new JButton("Start");
    start.addActionListener(tratador);
    start.setSize(100,200);
    panelleft.add(start);
    //End
    JButton end = new JButton("End");
    end.addActionListener(tratador);
    panelleft.add("South",end);
   
    //TextField
    JTextField tela = new JTextField(5);
    tela.setText("3");
    tela.setVisible(true);
    panelcenter.add(tela);
    
    janela.pack();
    janela.setVisible(true);

    }
    
   
    

}

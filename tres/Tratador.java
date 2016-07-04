package tres;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
        
public class Tratador implements ActionListener, WindowListener {

   
    public void actionPerformed(ActionEvent e) {        
        JButton button = (JButton)(e).getSource();
        
            if(e.getSource() == button) {
              if(button.getText().equals("Start"))
                 JOptionPane.showMessageDialog(null, "O botão Start foi clicado");   
              if(button.getText().equals("End")) 
                 JOptionPane.showMessageDialog(null, "O botão End foi clicado"); 
            
     }
    }
    
    
    public void windowClosing (WindowEvent we)
   {
      System.out.println("Fechando janela");
      System.exit(0);
   }
   public void windowActivated (WindowEvent we){
      System.out.println("windowActivated");
   }
   public void windowClosed (WindowEvent we){
      System.out.println("windowClosed");
   }
   public void windowDeactivated (WindowEvent we){
      System.out.println("windowDeactivated");
   }
   public void windowDeiconified(WindowEvent we){
      System.out.println("windwDeiconified");
   }
   public void windowIconified (WindowEvent we){
      System.out.println("windwIconified");
   }
   public void windowOpened (WindowEvent we){
      System.out.println("windowOpened");
   }
}

    


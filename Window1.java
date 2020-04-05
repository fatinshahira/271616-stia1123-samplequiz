package window1;
import javax.swing.*;

public class Window1 {

    private final JFrame f;
  
    public Window1(){
        f = new JFrame("Hello World");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
   }
   
    public static void main(String[] args) {
       Window1 window1 = new Window1();
    }
    
}

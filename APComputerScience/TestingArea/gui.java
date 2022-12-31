package TestingArea;
import javax.swing.*;

public class gui {
    public static void main(String args[]){
        JFrame frame = new JFrame("Test Gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        JButton button = new JButton("Button");

        JButton button1 = new JButton("Press");
        frame.getContentPane().add(button); 
        frame.getContentPane().add(button1);// Adds Button to content pane of frame
        frame.setVisible(true);

     }

}

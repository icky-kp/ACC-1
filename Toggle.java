import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JToggleButton;

public class Toggle implements ItemListener {
    static JLabel text;

    public static void main(String[] args) {
        // create a frame
        JFrame frame = new JFrame("Toggle Button");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        // Create an object
        Toggle obj = new Toggle();
        JToggleButton button = new JToggleButton("ToggleButton");
        button.setBounds(150, 100, 200, 100);
        button.addItemListener(obj);
        frame.add(button);

        text = new JLabel();
        text.setBounds(150, 250, 300, 100);
        frame.add(text);

        frame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            text.setText("Status of Toggle Button: SELECTED");
        } else {
            text.setText("Status of Toggle Button: DESELECTED");
        }
    }
}
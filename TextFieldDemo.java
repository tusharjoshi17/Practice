package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class TF extends Frame
{
    Label l1,l2;
    TextField tf;


    TF()
    {
      super("TextField Demo");
      l1= new Label("No text is entered yet");
      l2= new Label("Enter key is not hit yet");
      tf = new TextField(20);

      Handler h = new Handler();

      tf.addTextListener(h);
      tf.addActionListener(h);
      setLayout(new FlowLayout());
      add(l1);
      add(l2);
      add(tf);
    }
    class Handler implements ActionListener, TextListener
    {
    public void textValueChanged(TextEvent te)
    {
        l1.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent ae)
    {
        l2.setText(tf.getText());
    }
    }
}
public class TextFieldDemo
{
    public static void main(String[] args) {
    TF f = new TF();
    f.setVisible(true);
    f.setSize(400,400);
    }
}

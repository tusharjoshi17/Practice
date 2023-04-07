package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class TA extends Frame implements ActionListener
//{
//    TextArea ta;
//    TextField tf;
//    Label l;
//    Button b;
//
//    TA()
//    {
//        super("TextArea Demo");
//        tf=new TextField ();
//        l = new Label("Label");
//        b = new Button("Click");
//
//        setLayout(new FlowLayout());
//
//        add(l);
//        add(tf);
//        add(ta);
//        add(b);
//        b.addActionListener(this);
//    }
//    public void actionPerformed(ActionEvent e)
//    {
//        ta.insert(tf.getText(),ta.getCaretPosition());
//    }
//
//}
//public class TextAreaDemo
//{
//    public static void main(String[] args) {
//    TA t = new TA();
//    t.setVisible(true);
//    t.setSize(500,400);
//    }
//}

class MyFrame1 extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame1()
    {
        super("TextArea Demo");

        l=new Label("No Text Entered ");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        b=new Button("Click");

        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae)
    {
        ta.insert(tf.getText(), ta.getCaretPosition());

    }


}

public class TextAreaDemo
{
    public static void main(String[] args)
    {
        MyFrame1 f=new MyFrame1();
        f.setSize(500,500);
        f.setVisible(true);


    }
}

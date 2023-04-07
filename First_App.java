package src;

import java.awt.*;
class MyApp extends Frame
{
    Label l;
    TextField tf;
    Button b;

    MyApp(){
        super("App");
        setLayout(new FlowLayout());
        l=new Label("Name:");
        tf = new TextField(28);
        b = new Button("Ok");

        add(b);
        add(l);
        add(tf);
    }
}
public class First_App {
    public static void main(String[] args) {
//        Frame f = new Frame("App");
//        f.setLayout(new FlowLayout());
//        Button b = new Button("Ayoo");
//        Label l = new Label("Name: ");
//        TextField tf = new TextField(20);
//        f.add(b);
//        f.add(l);
//        f.add(tf);
        MyApp f = new MyApp();
        f.setVisible(true);
        f.setSize(300,300);
    }
}

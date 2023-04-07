
class outerClass{
    void display(){
        class innerClass{
            void show(){
                System.out.println("Hello");
            }
        }
        innerClass i = new innerClass();
        i.show();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        outerClass o = new outerClass();
        o.display();
    }
}

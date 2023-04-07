import java.util.Scanner;

class StackOverFlowException extends Exception {
    public String toString(){
        return "StackOverFlowException: Stack Overflow";
    }
}
class StackUnderFlowException extends Exception {
    public String toString(){
        return "StackUnderFlowException: Stack Underflow";
    }
}
class Stack {
    int top = -1;
    int size;
    int[] arr;

    Stack() {
        arr = new int[size];
    }

    void push(int data) throws StackOverFlowException {
        if (top == size - 1) {
            throw new StackOverFlowException();
        }
        arr[++top] = data;
    }

    int pop() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException();
        }
        return arr[top--];
    }
}

public class StackOverUnderFlowExceptions {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int size = sc.nextInt();
        try{
            for(int i=0;i<size;i++){
                System.out.println("Enter data: ");
                int data = sc.nextInt();
                s.push(data);
            }
            for(int i=0;i<size;i++){
                System.out.println(s.pop());
            }
        }
        catch(StackOverFlowException | StackUnderFlowException e){
            System.out.println(e);
        }
    }
}
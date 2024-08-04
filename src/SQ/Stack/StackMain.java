package SQ.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack=new CustomStack(5);

        stack.push(34);
        stack.push(3);
        stack.push(4);
        stack.push(43);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //for exception
        System.out.println(stack.pop());

    }
}

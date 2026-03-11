public class StackClient {
    public static Stack flipped(Stack s){
        Stack result = new Stack();
        while(s.size() > 0){
            result.push(s.pop());
        }
        return result;
    }
}

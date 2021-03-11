public class EmptyContent {
    public String message;

    public Example(String s) {
        message = s;
    }

    public String getGreeting() {
        message = String.Empty;
        return message;
    }
}

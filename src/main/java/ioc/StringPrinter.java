package ioc;

public class StringPrinter implements Printer {
    private StringBuffer stringBuffer = new StringBuffer();

    public void print(String message) {
        stringBuffer.append(message);
    }

    @Override
    public String toString() {
        return stringBuffer.toString();
    }
}

package Implementing_the_Factory_Method_Pattern;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}

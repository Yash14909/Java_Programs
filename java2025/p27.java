import java.io.*;

public class p27 implements AutoCloseable {
    // Resource cleanup logic
    @Override
    public void close() {
        System.out.println("Cleaning up resources explicitly");
    }

    public static void main(String[] args) {
        try (p27 d = new p27()) {
            System.out.println("Using the p27 object");
        } // The `close()` method will automatically be called here
    }
}

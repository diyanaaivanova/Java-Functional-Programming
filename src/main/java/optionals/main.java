package optionals;

import java.util.Optional;

public class main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");

        Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("exception"));

        System.out.println(value);
    }
}

import java.util.Arrays;
import java.util.List;

public class Clase4{

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("java", "lambda", "stream", "code", "example", "api");
        palabras.stream().filter(p->p.startsWith("j")).forEach(System.out::println);
    }
}
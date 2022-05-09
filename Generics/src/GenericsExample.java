import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        // Example without Generics
        List names = new ArrayList();
        names.add("Kelly");
        String name = (String) names.get(0);
        System.out.println("Firstname: " +name);
//        names.add(7);

        // With Generics
        List<String> names2 = new ArrayList<>();
        names2.add("Kelly");
        String name2 = names2.get(0);
        System.out.println("Fisrt name: " +name2);
//        name.add(7);
    }
}

import java.JavaLang;
import java.MainLang;
import java.util.jar.JarEntry;

public class index {
    public static int age;
    static MainLang mainLang;
    public static void main(String[] args) {
        age = 24;
        String name;
        String lastName = age == 24 ? "Sanya" : "Lena";
        name = String.format("%s say : %s", age, lastName);
        System.out.println(name);
    }
}

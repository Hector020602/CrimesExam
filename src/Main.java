import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Dni, Person> map = new HashMap<>();
        Dni dni1 = new Dni(1111);
        Dni dni2 = new Dni(2222);
        Dni dni3 = new Dni(3333);
        Dni dni4 = new Dni(4444);


        map.put(dni1, new Person("Pepe", 35));
        map.put(dni2, new Person("Eva", 40));
        map.put(dni3, new Person("Maria", 45));
        map.put(dni4, new Person("Carlos", 50));

        System.out.println(map.get(new Dni(2222)));

    }
}

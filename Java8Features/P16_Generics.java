import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Generic Interface
interface Storage<T> {
    void store(T data);
}

// Generic Class
class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// Multiple Type Parameters
class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}

// Generic Interface Implementation
class DataStorage<T> implements Storage<T> {

    @Override
    public void store(T data) {
        System.out.println("Stored: " + data);
    }
}

// Generic Methods
class GenericUtility {

    // Generic Method
    public static <T> void print(T data) {
        System.out.println("Generic Method: " + data);
    }

    // Generic Method with List
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    // Bounded Generic
    public static <T extends Number> double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }
}

public class P16_Generics {

    public static void main(String[] args) {

        // --------------------------------
        // 1. RAW TYPE
        // --------------------------------

        ArrayList list = new ArrayList<>();

        list.add("Pratik");
        list.add(101);

        String str = (String) list.get(0);

        System.out.println("Raw List: " + list);
        System.out.println("String: " + str);


        // --------------------------------
        // 2. GENERIC COLLECTION
        // --------------------------------

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1010);
        list2.add(2001);

        System.out.println("Integer List: " + list2);

        // Type Safety
        // list2.add("Java");   // Compile-time error


        // --------------------------------
        // 3. GENERIC CLASS
        // --------------------------------

        Box<Integer> intBox = new Box<>(100);

        System.out.println("Box Integer: " + intBox.getValue());

        Box<String> stringBox = new Box<>("Pratik");

        System.out.println("Box String: " + stringBox.getValue());

        // Type Safety
        // intBox.setValue("Java");   // Compile-time error


        // --------------------------------
        // 4. GENERIC INTERFACE
        // --------------------------------

        Storage<String> storage = new DataStorage<>();

        storage.store("Java");


        // --------------------------------
        // 5. MULTIPLE TYPE PARAMETERS
        // --------------------------------

        Pair<Integer, String> student =
                new Pair<>(101, "Pratik");

        student.display();


        // --------------------------------
        // 6. GENERIC METHOD
        // --------------------------------

        GenericUtility.print(100);
        GenericUtility.print("Java");
        GenericUtility.print(10.5);


        // --------------------------------
        // 7. GENERIC METHOD WITH LIST
        // --------------------------------

        List<String> names =
                Arrays.asList("Pratik", "Rahul", "Amit");

        GenericUtility.printList(names);


        // --------------------------------
        // 8. BOUNDED GENERIC
        // --------------------------------

        System.out.println(
                "Square: " + GenericUtility.square(10)
        );

        System.out.println(
                "Square: " + GenericUtility.square(5.5)
        );


        // --------------------------------
        // 9. UNBOUNDED WILDCARD
        // <?>
        // --------------------------------

        List<Integer> numbers =
                Arrays.asList(10, 20, 30);

        printAnyList(numbers);

        List<String> names2 =
                Arrays.asList("Java", "Spring");

        printAnyList(names2);


        // --------------------------------
        // 10. UPPER BOUNDED WILDCARD
        // <? extends Number>
        // --------------------------------

        List<Integer> marks =
                Arrays.asList(80, 90, 70);

        printNumbers(marks);


        // --------------------------------
        // 11. LOWER BOUNDED WILDCARD
        // <? super Integer>
        // --------------------------------

        List<Number> numberList =
                new ArrayList<>();

        addNumbers(numberList);

        System.out.println("Number List: " + numberList);


        // --------------------------------
        // 12. RAW TYPE WITH GENERIC CLASS
        // --------------------------------

        Box rawBox = new Box(100);

        System.out.println("Raw Box: " + rawBox.getValue());
    }


    // --------------------------------
    // Unbounded Wildcard
    // --------------------------------

    static void printAnyList(List<?> list) {

        System.out.println("Any List:");

        for (Object obj : list) {
            System.out.println(obj);
        }
    }


    // --------------------------------
    // Upper Bounded Wildcard
    // --------------------------------

    static void printNumbers(List<? extends Number> list) {

        System.out.println("Number List:");

        for (Number n : list) {
            System.out.println(n);
        }
    }


    // --------------------------------
    // Lower Bounded Wildcard
    // --------------------------------

    static void addNumbers(List<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);
    }
}
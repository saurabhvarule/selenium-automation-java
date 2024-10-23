
import java.util.List;
import java.util.ArrayList;

class Program1 {

    public static void main(String[] args) {
        List<String> days = new ArrayList<>();
        System.out.println("Array list elements : " + days);
        days.add("Monday");
        System.out.println("Array list elements : " + days);
        days.add("Tuesday");
        System.out.println("Array list elements : " + days);
        days.set(1, "Sunday");
        System.out.println("Array list elements : " + days);
        days.add(0, "Friday");
        System.out.println("Array list elements : " + days);

    }
}
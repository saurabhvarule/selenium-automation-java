
package JavaCollection.LinkedList;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Saurabh");
        names.add("Harshal");
        names.add("Aditi");
        names.add("Prajwal");

        for (String data : names) {
            System.out.println(data);
        }
        names.remove();
        System.out.println(names);
        names.toArray();
        System.out.println(names);
    }
}
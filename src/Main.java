public class Main {
    public static void main(String[] args) {
        ExpandableArray array = new ExpandableArray();
        array.add("Eran");
        array.add("Timothy");
        array.add("Perera");
        array.add("is");
        array.add("me😊");
        System.out.println(array.index(0) + " " + array.index(1) + " " + array.index(2));
        array.printEach();
        System.out.println(array.toString());

    }
}
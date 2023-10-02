public class EqualOverride {
    public static void main(String[] args) {
        Student a = new Student("Mary", 19, 1122);

        Student b = new Student("Mary", 15, 1122);

        System.out.println(a.equals(b));
    }
}z
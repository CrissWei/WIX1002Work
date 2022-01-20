package Jan;

public class Day12 {
    public static void main(String[] args) {

        Test1();
        System.out.println("==============");
        //Day12.Test1();
    }

    private static void Test1() {
        Person person = new Person();
        person.setName("criss");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println( person.isGender());

    }
}

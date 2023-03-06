package codes;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(fullName("Leonardo", "Lima"));
    }
    public static String fullName(String firstName, String lastName) {
//        return firstName + " " + lastName;
        return firstName.concat(" ").concat(lastName);
    }

}

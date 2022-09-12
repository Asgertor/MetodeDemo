public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(26, 1.84);

        System.out.println("Højde: " + p1.getHeight() +"\nAlder: " + p1.getAlder());
        p1.hasBirthday();
        p1.setHeight(1.86);
        System.out.println("\nNy højde: " + p1.getHeight() +"\nNy alder: " + p1.getAlder());

    }
}

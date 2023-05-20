
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        package1.Car car1 = new package1.Car();
        car1.starterIntruction();
        package2.Car car2 = new package2.Car();
        car2.starterIntruction();

        MathLib math = new MathLib();
        System.out.println(math.getLuasLingkaran(10) + " cm2");

        LivingRoom livingRoom = new LivingRoom();
        double area = livingRoom.area();
        System.out.println("Total ruangan: " + area);
        System.out.println(livingRoom.getluasRuangan(10,10));

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        System.out.println("(" + person4.getLocalCount() + "," + Person.getInstanceCount() + ")");
    }
}
public class Person {
    private static int instanceCount = 0;
    private int localCount = 0;

    public Person() {
        instanceCount++;
        localCount = instanceCount;
    }

    public int getLocalCount() {
        return localCount;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

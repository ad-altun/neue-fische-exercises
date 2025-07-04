public class Counter {
    public static int totalCount = 0;
    public int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
        System.out.println(" - Total number of static variable: " + totalCount);
    }

    public void incrementInstanceCount() {
        instanceCount++;
        System.out.println(" - Total number of instance variable: " + instanceCount);

    }



}

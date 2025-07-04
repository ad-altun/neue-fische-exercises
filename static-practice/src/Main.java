public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        System.out.println("----------------------");
        System.out.println();
        System.out.println("In total there are 4 instances of the Counter Object: " +
                "\n" + "counter1, counter2, counter3, counter4 ");
        System.out.println();
        System.out.println("And change in the instanceCount value displayed " +
                "\n" + "below when each object instance is called once: ");
        counter1.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter3.incrementInstanceCount();
        counter4.incrementInstanceCount();
        System.out.println();
        System.out.println("if the same sequence runs again in the same order: ");
//        System.out.println();
        counter1.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter3.incrementInstanceCount();
        counter4.incrementInstanceCount();

        System.out.println();
        System.out.println();
        System.out.println("For equally comparison, totalCount called with Counter object 4 times as well:  ");
//        System.out.println();
        System.out.println("and totalCount (for the static variable) value, when it is 4 times called is shown here: ");
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        System.out.println();
        System.out.println("Again, if you call the same sequence one more time, static totalCount variable changes as seen: ");
//        System.out.println();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        System.out.println();

        System.out.println("----------------------");



    }
}
public class CounterRunner {
    public static void main(String[] args) {
        Counter counter = new Counter(4);
        int value = counter.getValue();
        counter.click();
        int value1 = counter.getValue();

//        System.out.println(value + "\n" + value1);
    }
}

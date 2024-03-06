public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public Counter() {
        this.value = 0;
    }

    /**
     * The click method will increase the value by 1
     */
    public void click(){
        value = value + 1;
    }
    /**
     * The method will return the current value
     * @return the current value
     */
    public int getValue(){
        return value;
    }
}

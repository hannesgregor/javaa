public class Counter {

    private int startingValue;
    private boolean check;

    public Counter (int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int startingValue() {
        return this.startingValue;
    }

    public void increase() {
        this.startingValue++;
    }

    public void decrease() {
        this.startingValue--;
    }

    public void increase(int by) {
        if (by >= 0) {
            this.startingValue += by;
        }
    }

    public void decrease(int by) {
        if (by < 0){
            return;
        }
        this.startingValue -= by;

        if(this.check && this.startingValue<0) {
            this.startingValue = 0;
        }
    }
}

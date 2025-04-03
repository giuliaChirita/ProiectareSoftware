package ro.ulbs.paradigme.util;

class IntCalculator {
    protected int state;

    public IntCalculator(int initialValue) {
        this.state = initialValue;
    }

    public IntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public IntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public IntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }

    public int result() {
        return this.state;
    }

    public IntCalculator clear() {
        this.state = 0;
        return this;
    }

    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(10).subtract(1).multiply(2).result();
        System.out.println("rezultat: " + result);
    }
}
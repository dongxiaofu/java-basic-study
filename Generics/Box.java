public class Box<T> {

    T t;

    private void add(T t) {
        this.t = t;
    }

    private T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<Double> doubleBox = new Box<Double>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(10);
        System.out.printf("integerBox: %d\n", integerBox.get());

        doubleBox.add(4.5);
        System.out.printf("doubleBox: %.1f\n", doubleBox.get());

        stringBox.add(new String("hello"));
        System.out.printf("stringBox: %s\n", stringBox.get());
    }
}
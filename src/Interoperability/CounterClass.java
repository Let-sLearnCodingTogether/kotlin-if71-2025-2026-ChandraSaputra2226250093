package Interoperability;

public class CounterClass {
    int number = 0;

    public void increment() {
        number++;   //jika ditambah this. berarti merujuk ke number yg di public class,
        // jika tidak merujuk ke number yg di public void beraarti harus menambahkan int number
        // di dalam increment(int number)
    }
}

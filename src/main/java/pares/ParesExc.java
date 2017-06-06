package pares;

public class ParesExc extends Exception {

    public ParesExc(String msg, Throwable e) {
        super(msg,e);
    }

    public ParesExc(String msg) {
        super(msg);
    }
}

package grammer.singleton;

/**
 * java는 멀티스레드 기반이기에 원자성 고려 필요
 * 원자성이 고려되어 있지 않다.
 *
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

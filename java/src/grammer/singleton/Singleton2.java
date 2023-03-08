package grammer.singleton;

/**
 * java는 멀티스레드 기반이기에 원자성 고려 필요
 * synchronized로 해결
 *
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

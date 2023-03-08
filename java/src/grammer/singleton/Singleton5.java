package grammer.singleton;

/**
 * java는 멀티스레드 기반이기에 원자성 고려 필요
 * 정적 블록
 */
public class Singleton5 {
    private static Singleton5 instance = null;

    static {
        instance = new Singleton5();
    }

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return instance;
    }
}

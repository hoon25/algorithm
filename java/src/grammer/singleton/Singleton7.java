package grammer.singleton;

/**
 * 이중 확인 잠금(DCL)
 * 이중 확인 잠금(DCL, Double Checked Locking)도 있습니다. 인스턴스 생성 여부를 싱글톤 패턴 잠금 전에 한번,
 * 객체를 생성하기 전에 한 번 2번 체크하면 인스턴스가 존재하지 않을 때만 잠금을 걸 수 있기 때문에 앞서 생겼던 문제점을 해결할 수 있습니다.
 *
 * Volatile
 * JAVA 에서는 스레드 2개가 열리면 변수를 메인메모리(RAM)으로부터 가져오는 것이 아니라 캐시메모리에서 각각의 캐시 메모리를 기반으로 가져오게 됩니다.
 */
public class Singleton7 {
    private volatile Singleton7 instance;

    private Singleton7() {

    }

    public Singleton7 getInstance() {
        if (instance == null) {
            synchronized (Singleton7.class) {
                if (instance == null) {
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }


}

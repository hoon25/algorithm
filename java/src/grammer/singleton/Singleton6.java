package grammer.singleton;

/**
 * java는 멀티스레드 기반이기에 원자성 고려 필요
 * 정적 멤버와 Lazy Holder(중첩 클래스)  -> 제일 많이 쓴다.
 * singleInstanceHolder라는 내부 클래스를 하나 더 만듬으로써, Singleton 클래스가 최초에 로딩되더라도 함께 초기화가 되지 않고,
 * getInstance()가 호출 될 때 singleInstanceHolder 클래스가 로딩되어 인스턴스를 생성하게 됩니다.
 * 불필요한 자원할당을 막을 수 있다.
 */
public class Singleton6 {
    private static class singleInstanceHolder {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}

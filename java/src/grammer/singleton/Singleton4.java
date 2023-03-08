package grammer.singleton;

/**
 * java는 멀티스레드 기반이기에 원자성 고려 필요
 * 정적 멤버
 * static 멤버나 블록은 런타임이 아니라 최초에 JVM이 클래스 로딩 때
 * 모든 클래스들을 로드할 때 미리 인스턴스를 생성하는데 이를 이용한 방법
 * <p>
 * 불필요한 자원낭비라는 문제점이 있습니다. 싱글톤 인스턴스가 필요없는 경우도 무조건 싱글톤 클래스를 호출해 인스턴스를 만들어야 하기 때문
 */
public class Singleton4 {
    private final static Singleton4 instance = new Singleton4();

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return instance;
    }
}

package grammer.passByReference;


public class StringController {

    static String rawName = "홍길동";
    static String changeName = "김길동";

    public static void main(String[] args) {
        StringDTO stringDTO = new StringDTO(rawName);

        stringDTO.setName(changeName);

        // call by refererence로 넘겨준 값의 주소를 바꿔도 원본의 주소값은 바뀌지 않는다.
        System.out.println("stringDTO속 name : " + stringDTO.getName()); // 김길동
        System.out.println("rawName : " + rawName); // 홍길동

    }


}

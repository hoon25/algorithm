package grammer;

import java.math.BigDecimal;

/*
부동소수점 관련 코드
 */
public class FloatingPoint {
    public static void main(String[] args) {
        Float a = 0.25f;
        Float b = 0.5f;

        System.out.println(a + b); // 0.75
        System.out.println(a + b == 0.75); // true

        Float c = 0.3f;
        Float d = 0.6f;

        System.out.println(c + d); // 0.90000004
        System.out.println(c + d == 0.9); // false

        Float e = 1.000000f;
        Float f = 2.000000f;

        System.out.println(e + f);
        System.out.println(e + f == 3.00000);

        // BigDecimal
        BigDecimal a10 = BigDecimal.valueOf(0.3);
        BigDecimal b10 = BigDecimal.valueOf(0.6);
        BigDecimal c10 = new BigDecimal("0.9");

        System.out.println(a10.add(b10));
        System.out.println(a10.add(b10).equals(c10));
    }

}

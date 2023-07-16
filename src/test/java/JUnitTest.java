import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("test example 1") // 테스트 이름 명시
    @Test // 테스트를 수행하는 메서드라는 뜻
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(a+b, sum); // 값이 같은지 확인
    }
}

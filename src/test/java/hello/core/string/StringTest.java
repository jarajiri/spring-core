package hello.core.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    @DisplayName("문자열 비교 테스트 equal")
    void stringEqual(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        assertThat(s1).isEqualTo(s3);
        assertThat(s1).isSameAs(s2);
    }

    @Test
    @DisplayName("문자열 비교 테스트 same")
    void stringSame(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        assertThat(s1).isNotSameAs(s3);
        assertThat(s3).isNotSameAs(s4);
    }
}

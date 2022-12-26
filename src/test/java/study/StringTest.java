package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split1(){
        String[] actualArr = "1,2".split(",");
        assertThat(actualArr).contains("1");
        assertThat(actualArr).containsExactly("1","2");
    }

    @Test
    void split2(){
        String[] actualArr = "1".split(",");
        assertThat(actualArr).contains("1");
        assertThat(actualArr).containsExactly("1");
    }

    @Test
    void subString(){
        String actualArr = "(1,2)".substring(1,4);
        assertThat(actualArr).isEqualTo("1,2");
    }

    @Test
    void charAt(){
        String actualArr = "(1,2)".substring(1,4);
        assertThat(actualArr).isEqualTo("1,2");
    }

    @Test
    @DisplayName("StringIndexOutOfBoundsException test")
    void test(){
        assertThatThrownBy(()->{
            char a = "(1,2)".charAt(1);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }


}

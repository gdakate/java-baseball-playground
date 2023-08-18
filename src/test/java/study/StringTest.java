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

    //요구사항 1
    @Test
    @DisplayName("1,2 주어졌을 때 ,로 split")
    void split1(){
        String before = "1,2";
        String[] list = before.split(",");
        assertThat(list[0]).contains("1");
        assertThat(list).containsExactly("1","2");
    }
    @Test
    @DisplayName("1이 주어졌을 때 ,로 split")
    void split2(){
        String before = "1";
        String[] list = before.split(",");
        assertThat(list[0]).contains("1");
        assertThat(list).containsExactly("1");
    }

    //요구사항 2 : substring - 문자열 자르기
    //마땅한 이름짓기가 곤란..
    @Test
    @DisplayName("문자열 자르기")
    void subString(){
        String given = "(1,2)";
        String substring = given.substring(1, 4);
        assertThat(substring).isEqualTo("1,2");
    }

    //요구사항 3
    @Test
    @DisplayName("문자열 위치 벗어날 때 발생하는 에러 확인")
    void charAt(){

        assertThatThrownBy(()->{
            String given = "abc";
            given.charAt(4);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }

    //예외 확인용
    public static void main(String[] args) {
       try {
           String given = "abc";
           given.charAt(4);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}

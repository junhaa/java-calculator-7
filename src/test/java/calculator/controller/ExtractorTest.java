package calculator.controller;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExtractorTest {
    @Test
    @DisplayName("구분자_추출_테스트")
    void 구분자_추출_테스트(){
        Extractor extractor = new Extractor();
        String extractResult = extractor.extractCustomDelimiters("//'\n1:2'3");

        Assertions.assertThat(extractResult).isEqualTo("1:2'3");

        List<Integer> exList = List.of(1, 2, 3);
        Assertions.assertThat(extractor.extractNumbers(extractResult)).isEqualTo(exList);
    }
}

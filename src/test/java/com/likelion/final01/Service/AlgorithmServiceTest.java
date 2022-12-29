package com.likelion.final01.Service;

import com.likelion.final01.service.AlgorithmService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Annotation 없이 만든다.
public class AlgorithmServiceTest {

    //Spring을 안쓰고 테스트하기 때문에 new를 이용해 초기화해준다.
    //pojo 방식을 최대한 활용한다.

    AlgorithmService algorithmService = new AlgorithmService();

    @Test
    @DisplayName("자릿수의 합 잘 구하는지 테스트")
    void sumOfDigit() {
        assertEquals("21", algorithmService.sumOfDigit(687));
    }
}

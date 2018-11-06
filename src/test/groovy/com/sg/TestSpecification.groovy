package com.sg

import com.sg.core.Parity
import com.sg.core.Sandbox
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Unroll

@ContextConfiguration(classes = [Sandbox.class])
class TestSpecification extends Specification {

    @Autowired
    private Sandbox sandbox

    @Unroll
    def "Parity test #number"() {
        when:
        def parity = sandbox.evaluateParity(number)

        then:
        parity == parityCheck

        where:
        number | parityCheck
        4      | Parity.EVEN
        1      | Parity.ODD
        2      | Parity.EVEN
        3      | Parity.ODD
        6      | Parity.EVEN
        8      | Parity.EVEN
        1000   | Parity.EVEN
        999    | Parity.ODD
        32543  | Parity.ODD
        -50    | Parity.EVEN
        -1     | Parity.ODD
        -5646  | Parity.EVEN
    }

    @Unroll
    def "Multiplication test #a x #b"() {
        when:
        def multiResult = sandbox.integerMulti(a, b)

        then:
        multiResult == result

        where:
        a    | b   | result
        0    | 1   | 0
        1    | 2   | 2
        -3   | -5  | 15
        -2   | 1   | -2
        100  | 10  | 1000
        -100 | -10 | 1000

    }

}

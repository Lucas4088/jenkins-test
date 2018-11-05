package com.sg.core;

import org.springframework.stereotype.Component;

@Component
public class Sandbox {
    public int integerMulti(int a, int b) {
        return a * b;
    }

    public Parity evaluateParity(int a) {
        if (a % 2 == 0) {
            return Parity.EVEN;
        } else {
            return Parity.ODD;
        }
    }
}

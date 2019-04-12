package com.LexBFS.graph.constMatrix;

import org.springframework.stereotype.Component;

@Component
public interface Matrix {
    int[] MATRIX_6X6 = {
        //  a b c d e f
        0,1,0,0,0,1,
        1,0,1,1,0,1,
        0,1,0,1,0,0,
        0,1,1,0,1,1,
        0,0,0,1,0,1,
        1,1,0,0,1,0,6
    };
}

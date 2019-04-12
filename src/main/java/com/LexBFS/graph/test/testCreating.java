package com.LexBFS.graph.test;

import com.LexBFS.graph.service.GraphService;
import com.LexBFS.graph.constMatrix.Matrix;
import com.LexBFS.vertex.Vertex;

import java.util.List;

public class testCreating {
    public static void main(String[] args) {
        GraphService graphService = new GraphService();
        List<Vertex> vertexList = graphService.readFromMatrix(Matrix.MATRIX_6X6);
        int a = 0;

    }
}

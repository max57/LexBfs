package LexBFS.graph.test;

import LexBFS.graph.service.GraphService;
import LexBFS.graph.constMatrix.Matrix;
import LexBFS.vertex.Vertex;

import java.util.List;

public class testCreating {
    public static void main(String[] args) {
        GraphService graphService = new GraphService();
        List<Vertex> vertexList = graphService.readFromMatrix(Matrix.MATRIX_6X6);
        int a = 0;

    }
}

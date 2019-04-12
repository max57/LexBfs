package com.appConsole;

import com.LexBFS.algorithms.linearAlgoritm.LexBFSLinTime;
import com.LexBFS.graph.service.GraphService;
import com.LexBFS.graph.constMatrix.Matrix;
import com.LexBFS.algorithms.increaseAlgorithm.LexBFS;
import com.LexBFS.vertex.Vertex;

import java.util.List;

public class AppConsole {
    public static void main(String[] args) {
        GraphService graphService = new GraphService();
        List<Vertex> graph = graphService.readFromMatrix(Matrix.MATRIX_6X6);
        Vertex start = graph.get(2);

        //Прямой алгоритм
        LexBFS lexBFS = new LexBFS();
        graphService.printGraph(lexBFS.lexBFS(graph, start));

        //-----------------//
        System.out.println();
        //-----------------//

        List<Vertex> graphTwo = graphService.readFromMatrix(Matrix.MATRIX_6X6);
        start = graphTwo.get(2);
        //Алгоритм за линейное время
        LexBFSLinTime lexBFSLinTime = new LexBFSLinTime();
        graphService.printGraph(lexBFSLinTime.lexBFSLinTime(graphTwo, start));
    }
}

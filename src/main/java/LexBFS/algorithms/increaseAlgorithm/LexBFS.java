package LexBFS.algorithms.increaseAlgorithm;


import LexBFS.vertex.Vertex;
import LexBFS.vertex.vertexService.VertexService;

import java.util.LinkedList;
import java.util.List;

public class LexBFS {
    public List<Vertex> lexBFS(List<Vertex> graph, Vertex start){
        VertexService vertexService = new VertexService();
        List<Vertex> output = new LinkedList<Vertex>();
        start.setValue(graph.size());
        for (Vertex vertex : graph) {
            if (!start.getName().equals(vertex.getName())){
                vertex.setValue(0);
            } else {
                vertex.setValue(graph.size());
            }
        }
        for (int i = 0; i < graph.size(); i++){
            Vertex u = vertexService.getVertexWithMaxValue(graph);
            u.setVisited(true);
            output.add(u);
            vertexService.increaseUnvisitedNeighboursLabel(u, graph.size() - i);
        }
        return output;
    }
}

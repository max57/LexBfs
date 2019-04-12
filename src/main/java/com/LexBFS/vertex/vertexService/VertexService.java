package com.LexBFS.vertex.vertexService;

import com.LexBFS.vertex.Vertex;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Component
public class VertexService {

    public Vertex getVertexWithMaxValue(List<Vertex> vertexList){
        List<Vertex> unvisitedVertexes = this.getUnvisitedVertexes(vertexList);
        Vertex vertexWithMaxValue = unvisitedVertexes.get(0);
        for (int i = 1; i < unvisitedVertexes.size(); i++){
            if (vertexWithMaxValue.getValue() < unvisitedVertexes.get(i).getValue()){
                vertexWithMaxValue = unvisitedVertexes.get(i);
            }
        }
        return vertexWithMaxValue;
    }

    private List<Vertex> getUnvisitedVertexes(List<Vertex> vertexList){
        List<Vertex> unvisitedVertexes = new LinkedList<Vertex>();
        for (Vertex vertex : vertexList) {
            if (!vertex.isVisited()){
                unvisitedVertexes.add(vertex);
            }
        }
        return unvisitedVertexes;
    }

    public void increaseUnvisitedNeighboursLabel(Vertex u, int number) {
        for (int i = 0; i < u.getNeighbours().size(); i++){
            if (!u.getNeighbours().get(i).isVisited()){
                u.getNeighbours().get(i).setValue(u.getNeighbours().get(i).getValue() * 10 + number);
            }
        }
    }

    public List<Set<Vertex>> refine(List<Set<Vertex>> s, Set<Vertex> u){
        List<Set<Vertex>> result = new LinkedList<Set<Vertex>>();
        Set<Vertex> s1 = new HashSet<Vertex>();
        Set<Vertex> s2 = new HashSet<Vertex>();
        for (Set<Vertex> vertices : s) {
            for (Vertex vertex : vertices) {
                for (Vertex u1 : u) {
                    if (vertex.getName().equals(u1.getName())){
                        s1.add(vertex);
                    }
                }
            }
            if (CollectionUtils.isEmpty(s.get(1))){
                s1.addAll(u);
            }
            if (vertices.containsAll(u)){
                s2.addAll(vertices);
                s2.removeAll(u);
            }
        }
        result.add(s1);
        result.add(s2);


        return result;
    }
}

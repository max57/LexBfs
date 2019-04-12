package com.LexBFS.algorithms.linearAlgoritm;

import com.LexBFS.vertex.Vertex;
import com.LexBFS.vertex.vertexService.VertexService;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LexBFSLinTime {

    public List<Vertex> lexBFSLinTime(List<Vertex> graph, Vertex start) {
        VertexService vertexService = new VertexService();
        List<Vertex> output = new LinkedList<Vertex>();
        List<Set<Vertex>> listOfSets = this.separateListOnSets(graph, start);

        for (int i = 0; i < graph.size(); i++) {
            Set<Vertex> u = listOfSets.get(0);
            // set visited, add to the output
            for (Vertex vertex : u) {
                vertex.setVisited(true);
            }
            output.addAll(u);
            if (output.size() == graph.size()) {
                break;
            }
            listOfSets = vertexService.refine(listOfSets, u);
            Set<Vertex> children = new HashSet<Vertex>();
            for (Vertex vertex : u) {
                for (Vertex neighbours : vertex.getNeighbours()) {
                    if (!neighbours.isVisited()) {
                        children.add(neighbours);
                    }
                }
            }
            listOfSets = vertexService.refine(listOfSets, children);
        }
        return output;
    }

    private List<Set<Vertex>> separateListOnSets(List<Vertex> vertices, Vertex start) {
        List<Set<Vertex>> listOfSets = new LinkedList<Set<Vertex>>();
        Set<Vertex> s1 = new HashSet<Vertex>();
        Set<Vertex> s2 = new HashSet<Vertex>();

        for (Vertex vertex : vertices) {
            if (vertex.getName().equals(start.getName())) {
                s1.add(vertex);
                s2.add(vertex);
            } else {
                s2.add(vertex);
            }
        }

        listOfSets.add(s1);
        listOfSets.add(s2);
        return listOfSets;

    }
}

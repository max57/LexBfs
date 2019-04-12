package com.appServer.api;

import com.LexBFS.algorithms.increaseAlgorithm.LexBFS;
import com.LexBFS.graph.constMatrix.Matrix;
import com.LexBFS.graph.service.GraphService;
import com.LexBFS.vertex.Vertex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/lexbfs")
public class LexBFSApi {
    @Autowired
    GraphService graphService;
    @Autowired
    LexBFS lexBFS;

    @GetMapping(path = "/a", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<String> lexBFS(){
        List<Vertex> graph = graphService.readFromMatrix(Matrix.MATRIX_6X6);
        Vertex start = graph.get(2);

        //Прямой алгоритм
        List<Vertex> list = lexBFS.lexBFS(graph, start);
        List<String> names = new LinkedList<>();

        for (Vertex vertex : list) {
            names.add(vertex.getName());
        }

        return names;
    }
    @GetMapping(path = "/str", produces= MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "dasdsa";
    }
}

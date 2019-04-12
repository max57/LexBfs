package com.LexBFS.graph.service;
import com.LexBFS.vertex.Vertex;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.*;

@ComponentScan
@Component
public class GraphService {
    private static final int ONE = 1;
    private static final int ZERO = 0;
    private static final Map<Integer, String> VERTEX_NAME = new HashMap<Integer, String>();
    static{
        VERTEX_NAME.put(1, "a");
        VERTEX_NAME.put(2, "b");
        VERTEX_NAME.put(3, "c");
        VERTEX_NAME.put(4, "d");
        VERTEX_NAME.put(5, "e");
        VERTEX_NAME.put(6, "f");
        VERTEX_NAME.put(7, "g");
        VERTEX_NAME.put(8, "h");
        VERTEX_NAME.put(9, "i");
        VERTEX_NAME.put(10, "j");
        VERTEX_NAME.put(11, "k");
        VERTEX_NAME.put(13, "l");
        VERTEX_NAME.put(14, "m");
        VERTEX_NAME.put(15, "n");
        VERTEX_NAME.put(16, "o");
        VERTEX_NAME.put(17, "p");
        VERTEX_NAME.put(18, "q");
        VERTEX_NAME.put(19, "r");
        VERTEX_NAME.put(20, "s");
        VERTEX_NAME.put(21, "t");
        VERTEX_NAME.put(22, "u");
        VERTEX_NAME.put(23, "v");
        VERTEX_NAME.put(24, "w");
        VERTEX_NAME.put(25, "x");
        VERTEX_NAME.put(26, "y");
        VERTEX_NAME.put(27, "z");
    }



    public List<Vertex> firstGraph(){
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex d = new Vertex("d");
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");


        List<Vertex> vertexList = new LinkedList<Vertex>();
        vertexList.add(e);
        vertexList.add(a);
        vertexList.add(c);
        vertexList.add(f);
        vertexList.add(b);
        vertexList.add(d);

        List<Vertex> eN = new LinkedList<Vertex>();
        eN.add(f);
        eN.add(d);
        e.setNeighbours(eN);

        List<Vertex> fN = new LinkedList<Vertex>();
        fN.add(e);
        fN.add(d);
        fN.add(a);
        fN.add(b);
        f.setNeighbours(fN);

        List<Vertex> dN = new LinkedList<Vertex>();
        dN.add(e);
        dN.add(f);
        dN.add(c);
        dN.add(b);
        d.setNeighbours(dN);

        List<Vertex> aN = new LinkedList<Vertex>();
        aN.add(f);
        aN.add(b);
        a.setNeighbours(aN);

        List<Vertex> bN = new LinkedList<Vertex>();
        bN.add(f);
        bN.add(c);
        bN.add(d);
        bN.add(a);
        b.setNeighbours(bN);

        List<Vertex> cN = new LinkedList<Vertex>();
        cN.add(d);
        cN.add(b);
        c.setNeighbours(cN);

        return vertexList;
    }

    public List<Vertex> secondGraph(){
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex d = new Vertex("d");
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex z = new Vertex("z");
        Vertex x = new Vertex("x");
        Vertex y = new Vertex("y");
        Vertex q = new Vertex("q");
        Vertex m = new Vertex("m");
        Vertex n = new Vertex("n");


        List<Vertex> vertexList = new LinkedList<Vertex>();
        vertexList.add(e);
        vertexList.add(a);
        vertexList.add(c);
        vertexList.add(f);
        vertexList.add(b);
        vertexList.add(d);
        vertexList.add(y);
        vertexList.add(m);
        vertexList.add(z);
        vertexList.add(x);
        vertexList.add(n);
        vertexList.add(q);



        List<Vertex> yN = new LinkedList<Vertex>();
        yN.add(x);
        yN.add(b);
        e.setNeighbours(yN);

        List<Vertex> eN = new LinkedList<Vertex>();
        eN.add(f);
        eN.add(d);
        e.setNeighbours(eN);

        List<Vertex> fN = new LinkedList<Vertex>();
        fN.add(e);
        fN.add(d);
        fN.add(a);
        fN.add(b);
        f.setNeighbours(fN);

        List<Vertex> dN = new LinkedList<Vertex>();
        dN.add(e);
        dN.add(f);
        dN.add(c);
        dN.add(b);
        d.setNeighbours(dN);

        List<Vertex> aN = new LinkedList<Vertex>();
        aN.add(f);
        aN.add(b);
        a.setNeighbours(aN);

        List<Vertex> bN = new LinkedList<Vertex>();
        bN.add(f);
        bN.add(c);
        bN.add(d);
        bN.add(a);
        b.setNeighbours(bN);

        List<Vertex> cN = new LinkedList<Vertex>();
        cN.add(d);
        cN.add(b);
        c.setNeighbours(cN);

        return vertexList;
    }

    public List<Vertex> readFromMatrix(int[] matrix){
        List<Vertex> vertexList = new LinkedList<Vertex>();
        int size = matrix[matrix.length - 1];

        for (int i = 0; i < matrix[matrix.length - 1]; i++){
            vertexList.add(new Vertex(VERTEX_NAME.get(i + 1)));
        }
        int j = 0;
        int k = 0;
        for (int i = 0; i < matrix.length - 2; i++){
            if (matrix[i] == ONE){
                vertexList.get(j).getNeighbours().add(vertexList.get(k));
            }
            j++;
            if (j == size){
                j = ZERO;
                k++;
            }
        }




        return vertexList;
    }

    public void printGraph(List<Vertex> list){
        for (Vertex vertex : list) {
            System.out.print(vertex.getName() + " ");
        }
    }


}

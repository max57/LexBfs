package LexBFS.vertex;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private String name;
    private Integer value = 1;
    List<Vertex> neighbours = new LinkedList<Vertex>();
    private boolean isVisited = false;

    public Vertex(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }

}

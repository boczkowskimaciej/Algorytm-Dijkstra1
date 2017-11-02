package mboczkowski.model;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private final List<Edge> edges = new ArrayList<>();
    private final String name;

    public Vertex(String name){
        this.name = name;
    }

    public void link(Vertex other, float value){
        Edge edge = new Edge(this, other, value);
        edges.add(edge);
        other.edges.add(edge);
    }


}

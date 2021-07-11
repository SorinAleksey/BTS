package com.github.elonmuks.BTS;

import java.util.ArrayList;

public class Graph {
    public ArrayList<GraphEdges> graphEdges;
    public ArrayList<GraphVertices> graphVertices;

    public Graph() {
        graphEdges = new ArrayList<>();
        graphVertices = new ArrayList<>();
    }
}

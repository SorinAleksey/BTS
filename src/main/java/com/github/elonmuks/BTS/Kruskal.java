package com.github.elonmuks.BTS;

import java.util.Comparator;

public class Kruskal {
    public Graph graph;
    public Kruskal(){
        graph = new Graph();
    }
    public void SortEdges() {
        graph.graphEdges.sort(Comparator.comparingDouble((o1) -> (o1.weight)));
    }
}

package com.github.elonmuks.BTS;

public class GraphEdges {
    public int firstVertex;
    public int secondVertex;
    public double weight;

    public GraphEdges() {
    }
    public GraphEdges(int firstVertex, int secondVertex, double weight) {
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
        this.weight = weight;
    }

}

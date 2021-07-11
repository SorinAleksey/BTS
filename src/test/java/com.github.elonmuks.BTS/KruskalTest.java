package com.github.elonmuks.BTS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KruskalTest {
    Kruskal kruskal = new Kruskal();
    @Test
    void sortEdges() {
        kruskal.graph.graphEdges.add(new GraphEdges(1, 2, 10));
        kruskal.graph.graphEdges.add(new GraphEdges(2, 3, 15));
        kruskal.graph.graphEdges.add(new GraphEdges(3, 4, 13));
        kruskal.SortEdges();
        assertEquals(10.0, kruskal.graph.graphEdges.get(0).weight);
        assertEquals(13.0, kruskal.graph.graphEdges.get(1).weight);
        assertEquals(15.0, kruskal.graph.graphEdges.get(2).weight);
    }
}
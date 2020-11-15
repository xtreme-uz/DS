package com.company.ds.model;

import com.company.model.Vertex;

import java.util.*;

public class Graph {

    public Map<Vertex, List<Vertex>> adjacency;

    public Graph() {
        this.adjacency = new HashMap<>();
    }

    // O(1) + O(n)
    public boolean isAdjacent(int a, int b) {
        Vertex vertexA = new Vertex(a);
        Vertex vertexB = new Vertex(b);
        List<Vertex> vertices = adjacency.get(vertexA);

        for (Vertex vertex : vertices) {
            if (vertex.value == vertexB.value){
                return true;
            }
        }
        return false;
    }

    public static Graph toGraph(List<Integer> vertex, Map<Integer, Integer> edges) {
        Graph graph = new Graph();
        for (Integer item : vertex) {
            graph.addVertex(item);
        }
        edges.forEach((key, value) -> graph.addEdge(key, value));
        return graph;
    }

    public void addVertex(int value) {
        adjacency.putIfAbsent(new Vertex(value), new ArrayList<>());
    }

    public void removeVertex(int value) {
        Vertex item = new Vertex(value);
        for (List<Vertex> adjacencies: adjacency.values()) {
            adjacencies.remove(item);
        }
        adjacency.remove(item);
    }

    public void addEdge(int value1, int value2) {
        Vertex vertex1 = new Vertex(value1);
        Vertex vertex2 = new Vertex(value2);
        adjacency.get(vertex1).add(vertex2);
        adjacency.get(vertex2).add(vertex1);
    }

    public void removeEdge(int value1, int value2) {
        Vertex vertex1 = new Vertex(value1);
        Vertex vertex2 = new Vertex(value2);
        List<Vertex> vertices1 = adjacency.get(vertex1);
        if (vertices1 != null) {
            vertices1.remove(vertex2);
        }
        List<Vertex> vertices2 = adjacency.get(vertex2);
        if (vertices2 != null) {
            vertices2.remove(vertex1);
        }
    }

}

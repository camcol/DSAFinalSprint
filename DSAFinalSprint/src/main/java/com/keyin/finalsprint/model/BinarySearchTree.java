package com.keyin.finalsprint.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BinarySearchTree {
    private Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {


        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.getValue()) {
            root.setLeft(insertRec(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insertRec(root.getRight(), value));
        }

        return root;
    }

    public String toJson() {
        return toJsonRec(root, 0);
    }

    private String toJsonRec(Node node, int indentLevel) {


        if (node == null) {
            return "null";
        }

        StringBuilder json = new StringBuilder();

        String indent = "  ".repeat(indentLevel);

        json.append("{\n");

        json.append(indent).append("  \"value\": ").append(node.getValue()).append(",\n");

        json.append(indent).append("  \"left\": ").append(toJsonRec(node.getLeft(), indentLevel + 1)).append(",\n");

        json.append(indent).append("  \"right\": ").append(toJsonRec(node.getRight(), indentLevel + 1)).append("\n");

        json.append(indent).append("}");

        return json.toString();
    }
}

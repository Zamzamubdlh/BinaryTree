package com.binarytree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addNode(new Node(50));
        tree.addNode(new Node(30));
        tree.addNode(new Node(20));
        tree.addNode(new Node(40));
        tree.addNode(new Node(70));
        tree.addNode(new Node(60));
        tree.addNode(new Node(80));

        System.out.println(BinaryTree.searchValue(tree.root, 5));

        tree.printNodes();
    }
}

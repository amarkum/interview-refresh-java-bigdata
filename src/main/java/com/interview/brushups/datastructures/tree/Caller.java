package com.interview.brushups.datastructures.tree;

public class Caller {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(9);
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(8);
        binarySearchTree.add(12);
        binarySearchTree.add(10);
        binarySearchTree.add(14);

        System.out.println(binarySearchTree.nodeSearch(108));
        System.out.println(binarySearchTree.nodeSearch(12));

        binarySearchTree.printTree(binarySearchTree.getRoot());
    }


}

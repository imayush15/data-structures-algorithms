package binaryTreeLinkedList;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        tree t = new tree();
        Node root =  t.create();
        System.out.println("7 :" + t.search(root, 7));

        System.out.println("Reverse Level Order is :");
        t.reverseLevelOrder(root);






    }
}

package Trees;

import java.util.ArrayList;

public class Leftview {
    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.left = new Tree(20);
        root.right = new Tree(30);
        root.left.left = new Tree(40);
        root.left.right = new Tree(50);
        root.right.left = new Tree(60);
        root.right.right = new Tree(70);

        System.out.println("Left view of the Binary Tree");
        Tree.Leftview(root, 1);
        System.out.println();

        System.out.println("Left view of the Binary Tree using Iteration");
        ArrayList<Integer> a=Tree.leftView(root);
        for(Integer aa:a)System.out.print(aa+" ");
        System.out.println();
    }
}

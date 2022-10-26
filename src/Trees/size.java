package Trees;

public class size {

    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.left = new Tree(20);
        root.right = new Tree(30);
        root.left.left = new Tree(40);
        root.left.right = new Tree(50);
        root.right.left = new Tree(60);
        root.right.right = new Tree(70);


        System.out.println("Size of the Tree using Queue:");
        System.out.println(Tree.SizeOfTree(root));
        System.out.println();


        System.out.println("Size of the Tree using Recursion:");
        System.out.println(Tree.size(root));
        System.out.println();
    }
}

package Trees;

public class Height {
    public static void main(String[] args) {
        Tree root = new Tree(10);
        root.left = new Tree(20);
        root.right = new Tree(30);
        root.left.left = new Tree(40);
        root.left.right = new Tree(50);
        root.right.left = new Tree(60);
        root.right.right = new Tree(70);

        System.out.println("Height of the Tree:");
        System.out.println(Tree.Height(root));
        System.out.println();



    }
}

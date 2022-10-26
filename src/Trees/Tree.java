package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    int data;
    Tree left;
    Tree right;
    public Tree(int data)
    {
        this.data=data;
        this.right=null;
        this.left=null;
    }

    public static void Inorder(Tree root)
    {
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static void Preorder(Tree root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        Preorder(root.left);

        Preorder(root.right);
    }

    public static void Postorder(Tree root)
    {
        if(root==null)
            return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static int Height(Tree root)
    {
        if(root==null)
            return 0;
        else
            return Math.max(Height(root.left), Height(root.right))+1;
    }

    public static void PrintKthNode(Tree root, int k)
    {
        if(root==null)
            return;
        if(k==0)
            System.out.print(root.data+" ");
        else
        {
            PrintKthNode(root.left, k-1);
            PrintKthNode(root.right, k-1);
        }

        //System.out.println(root.data);


    }

    public static void Levelorder(Tree root)
    {

        if(root==null) return;
        Queue<Tree>q=new LinkedList<Tree>();
        q.add(root);
        while(!q.isEmpty())
        {
            Tree curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }


    public static int  SizeOfTree(Tree root)
    {
        if(root==null) return 0;
        int count=0;
        Queue<Tree>q=new LinkedList<Tree>();
        q.add(root);
        while(!q.isEmpty())
        {
            Tree curr=q.poll();
            count=count+1;
            //System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
        //System.out.println(count);
        return count;


    }

    public static int size(Tree root)
    {
        if(root==null)
            return 0;

        return 1+size(root.left)+size(root.right);
    }


    public static int FindMax(Tree root)
    {
        if(root==null) return 0;
        int maxi=Integer. MIN_VALUE;
        Queue<Tree> q=new LinkedList<Tree>();
        q.add(root);
        while(!q.isEmpty())
        {
            Tree curr=q.poll();
            maxi=Math.max(maxi, curr.data);
            //System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
        //System.out.println(maxi);
        return maxi;
    }

    public static void Leftview(Tree root, int level)
    {
        ArrayList<Integer>arr=new ArrayList<>();
        int maxlevel=0;

        if(root==null) return;

        if(maxlevel<level)
        {
            System.out.print(root.data+" ");
            maxlevel=level;
        }

        Leftview(root.left, level+1);
        Leftview(root.right, level+1);



    }

    public static ArrayList<Integer> leftView(Tree root)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Queue<Tree>q=new LinkedList<Tree>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            int count=q.size();
            for(int i=0; i<count; i++)
            {
                Tree curr=q.poll();
                if(i==0)
                    arr.add(curr.data);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }

        }
        return arr;
    }


    public static boolean child(Tree root)
    {
        if(root.left==null&&root.right==null) return true;
        Queue<Tree>q=new LinkedList<Tree>();
        q.add(root);
        while(!q.isEmpty())
        {
            Tree curr=q.poll();
            if(curr.data!=(curr.left.data+curr.right.data))
                return false;

            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);

        }
        return true;

    }
}

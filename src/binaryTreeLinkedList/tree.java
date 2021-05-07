package binaryTreeLinkedList;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node() {

    }

    Node(int data) {
        this.data = data;
        left=right=null;
    }
}

public class tree {
    Node create() {
        Node p, t;
        Queue<Node> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

//        Creating Root Node
        System.out.print("Enter Root value : ");
        int x = sc.nextInt();
        Node root = new Node(x);
        q.add(root);

//        Repeating procedure for creating other Nodes
        while(!q.isEmpty()) {
//        For left child
            p = q.poll();
            System.out.print("Enter Left Child : ");
            x = sc.nextInt();

            if(x!=-1) {
                t = new Node(x);
                p.left = t;
                q.add(t);
            }

//        For Right Child
            System.out.print("Enter Right Child : ");
            x = sc.nextInt();

            if(x!=-1) {
                t = new Node(x);
                p.right = t;
                q.add(t);
            }
        }
        return root;
    }

    void preorder(Node t) {
        if(t!=null) {
            System.out.print(t.data + " ");
            preorder(t.left);
            preorder(t.right);
        }
    }

//    Inorder Traversal : Left, Root, Right
    void inorder(Node t) {
        if(t!=null) {
            inorder(t.left);
            System.out.print(t.data + " ");
            inorder(t.right);
        }
    }

//    Postorder Traversal : Left, Right, Root
    void postorder(Node t) {
        if(t!=null) {
            postorder(t.left);
            postorder(t.right);
            System.out.print(t.data + " ");
        }
    }
    void iter_preorder(Node root) {
        Node t = root;
        Stack<Node> st =  new Stack<>();
        st.add(t);
        while(t!=null || st.isEmpty()) {
            if(t!=null) {
                System.out.print(t.data + " ");
                st.push(t);
                t = t.left;
            }
            else {
                t = st.pop();
                t = t.right;
            }

        }
    }
    void iter_inorder(Node root) {
        Node t = root;
        Stack<Node> st = new Stack<>();

        while(t!=null || !st.isEmpty()) {
            if(t!=null) {
                st.push(t);
                t = t.left;
            }
            else {
                t = st.pop();
                System.out.print(t.data + " ");
                t = t.right;
            }
        }
    }

    int leafCount(Node root)  {
        int x, y;
        if(root!=null) {
            x = leafCount(root.left);
            y = leafCount(root.right);

            if(root.left==null && root.right==null) {
                return x+y+1;
            }
            return x+y;
        }
        return 0;
    }

    void levelOrder(Node root) {
        Node temp;
        Queue<Node> q = new LinkedList<>();
        if(root==null)
            System.out.println("NULL");
        else {
            q.add(root);
            while(!q.isEmpty()) {
                temp = q.poll();
                System.out.print(temp.data + " ");
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
        }
    }

    int SearchBinTree(Node root, int key) {
        int temp;
        if(root==null) return -1;
        else {
            if(root.data==key) {
                return 1;
            }
            else {
                temp = SearchBinTree(root.left, key);
                if(temp!=0)
                    return temp;
                else
                    return SearchBinTree(root.right, key);
            }
        }
    }

    Node insert(Node root, int val) {
        Node temp;
        Queue<Node> q = new LinkedList<>();
        Node newNode = new Node(val);

        if(root==null) {
            root = newNode;
        }else {
            q.add(root);
            while(!q.isEmpty()) {
                temp = q.poll();
                if(temp.left!=null) {
                    q.add(temp.left);
                }else {
                    temp.left = newNode;
                }

                if(temp.right!=null) {
                    q.add(temp.right);
                }else {
                    temp.right = newNode;
                }
            }


        }
        return root;
    }

    boolean search(Node root, int key) {
        Node temp;
        Queue<Node> q = new LinkedList<>();
        if(root==null)
            return false;
        q.add(root);
        while(!q.isEmpty()) {
            temp = q.poll();
            if(key == temp.data)
                return true;
            if(temp.left!=null) {
                q.add(temp.left);
            }
            if(temp.right!=null) {
                q.add(temp.right);
            }
        }
        return false;
    }

    void reverseLevelOrder(Node root) {
        Stack<Integer> st = new Stack<>();
        if(root==null) {
            System.out.println("Error");
        }else {
            Queue<Node> q = new LinkedList<>();
            Node temp;
            q.add(root);
            while(!q.isEmpty()) {
                temp = q.poll();
                st.push(temp.data);

                if(temp.left!=null) {
                    q.add(temp.left);
                }
                if(temp.right!=null) {
                    q.add(temp.right);
                }
            }
            while(!st.isEmpty()) {
                int x = st.pop();
                System.out.print(x + " ");
            }
        }
    }

    void deleteBinTree(Node root) {
        if(root==null) {
            System.out.println("Tree is Already Empty");
        }else {
            deleteBinTree(root.left);
            deleteBinTree(root.right);
            root=null;
        }
    }

}

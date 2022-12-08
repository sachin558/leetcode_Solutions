/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if (root == null) return null;

        Node temp = root;

        while (temp.left != null) {
            Node curr = temp;

            while (true) {
                curr.left.next = curr.right;

                if (curr.next == null) break;

                curr.right.next = curr.next.left;
                curr = curr.next;
            }

            temp = temp.left;
        }

        return root;
    }
}
/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

// @lc code=start

// Definition for a Node.
/*
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;
        HashMap<Integer, Node> map = new HashMap<>();
        return clone(node, map);
    }

    private Node clone(Node node, HashMap<Integer, Node> map) {
        if (map.containsKey(node.val))
            return map.get(node.val);
        map.put(node.val, new Node(node.val));
        Node newNode = map.get(node.val);
        for (Node neighbor : node.neighbors)
            newNode.neighbors.add(clone(neighbor, map));
        return newNode;
    }
}
// @lc code=end

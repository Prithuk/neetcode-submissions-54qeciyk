/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Create the new head and the Map
        Map<Node, Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        map.put(head, newHead); // Map original head to new head

        Node oldTemp = head;
        Node newTemp = newHead;

        // Step 2: First Pass - Create all 'next' nodes and fill the map
        while (oldTemp.next != null) {
            // Create the copy of the NEXT node
            Node copyNode = new Node(oldTemp.next.val);
            map.put(oldTemp.next, copyNode);
            
            newTemp.next = copyNode;
            
            // Move both pointers forward
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }

        // Step 3: Second Pass - Fix the 'random' pointers
        oldTemp = head;
        while (oldTemp != null) {
            if (oldTemp.random != null) {
                // Get the NEW node that corresponds to the original random node
                map.get(oldTemp).random = map.get(oldTemp.random);
            }
            oldTemp = oldTemp.next;
        }

        return newHead;
    }
}

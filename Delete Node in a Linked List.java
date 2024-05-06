class Solution {
  public void deleteNode(ListNode currentNode) {
    currentNode.val = currentNode.next.val;
    currentNode.next = currentNode.next.next;
  }
}

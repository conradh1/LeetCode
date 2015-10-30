public class MergeTwoSortedLists {

  public static void main(String[] args) {
    new MergeTwoSortedLists().run();
  }

   public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  public void run() {
  
    // build the simple tree from chapter 11.
    
    
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = null;
    if (l1 == null) return l2;
    if (l2 == null) return l1;
  
    if (l1.val < l2.val) {
      head = l1;
    } 
    else {
      head = l2;
      l2 = l1;
      l1 = head;
    }
    while(l1.next != null && l2 != null) {
      if (l1.next.val > l2.val) {
        ListNode tmp = l1.next;
        l1.next = l2;
        l2 = tmp;
      }
      l1 = l1.next;
    } 
    if (l1.next == null) l1.next = l2;
    return head;
  }

}

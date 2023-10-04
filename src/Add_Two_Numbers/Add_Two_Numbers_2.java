package Add_Two_Numbers;

/**
 * todo Document type Add_Two_Numbers.Add_Two_Numbers_2
 */
public class Add_Two_Numbers_2 {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;



        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(9);
        ListNode a4 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next=a4;


        ListNode current = addTwoNumbers(n1,a1);
        while (current != null)
        {
            System.out.println(current.val);
            current=current.next;
        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        ListNode current_l1 = l1;
        ListNode current_l2 = l2;

        while (current_l1 != null || current_l2 != null) {
            int x = (current_l1 != null) ? current_l1.val : 0;
            int y = (current_l2 != null) ? current_l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (current_l1 != null) current_l1 = current_l1.next;
            if (current_l2 != null) current_l2 = current_l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }




}



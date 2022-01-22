//import java.util.HashSet;

/*class NodeM{
    int data;
    boolean visited;        //different method
    NodeM next;
    NodeM(int x){
        data=x;
        visited = false;
        next=null;
    }
}*/

//method 1 :- O(n^2) traversing each node with all other nodes.
/*method 2 :- O(n) add an boolean visited variable in default node and
              make it false by default and then traverse the LL and mark
              the visited node true while traversing if any node found
              visited true then stop */
class DetectLoop {

    /*static boolean isLoop(Node head){       //method 3 O(n)
        Node temp = new Node(0);
        Node curr = head;
        while (curr != null) {
            if(curr.next == null)
            return false;
            if(curr.next == temp)
            return true;
            Node curr_next = curr.next;
            curr.next = temp;
            curr = curr_next;
        }
        return false;
    }*/
    /*static boolean isLoop(Node head){           //method 4 hashing O(n)
        HashSet<Node> s = new HashSet<>();
        for(Node r=head;r.next!=null;r=r.next){
            if(s.contains(r))
            return true;

            s.add(r);
        }
        return false;
    }*/
    static boolean isLoop(Node head){       //floyd cycle detection
        Node slow_p = head,fast_p = head;   //O(m+n)
        while (fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if(slow_p == fast_p)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
    	if (isLoop(head)) 
            System.out.print("Loop found"); 
        else
            System.out.print("No Loop");

    }
}

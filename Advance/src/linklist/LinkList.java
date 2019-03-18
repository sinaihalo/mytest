package linklist;

public class LinkList {

	 	public Node head;
	    public Node current;

	    //方法：向链表中添加数据
	    public void add(int data) {
	        //判断链表为空的时候
	        if (head == null) {//如果头结点为空，说明这个链表还没有创建，那就把新的结点赋给头结点
	            head = new Node(data);
	            current = head;
	        } else {
	            //创建新的结点，放在当前节点的后面（把新的结点合链表进行关联）
	            current.next = new Node(data);
	            //把链表的当前索引向后移动一位
	            current = current.next;   //此步操作完成之后，current结点指向新添加的那个结点
	        }
	    }

	    //方法：遍历链表（打印输出链表。方法的参数表示从节点node开始进行遍历
	    public void print(Node node) {
	        if (node == null) {
	            return;
	        }

	        current = node;
	        while (current != null) {
	            System.out.print(current.data);
	            current = current.next;
	        }
	        System.out.print("\n");
	    }


	    class Node {
	        //注：此处的两个成员变量权限不能为private，因为private的权限是仅对本类访问。
	        int data; //数据域
	        Node next;//指针域

	        public Node(int data) {
	            this.data = data;
	        }
	    }

	  //方法：获取单链表的长度
	    public int getLength(Node head) {
	        if (head == null) {
	            return 0;
	        }

	        int length = 0;
	        Node current = head;
	        while (current != null) {
	            length++;
	            current = current.next;
	        }

	        return length;
	    }
	    
	    public int findLastNode(int index,int size) {  //index代表的是倒数第index的那个结点

	        //第一次遍历，得到链表的长度size
	        if (head == null) {
	            return -1;
	        }

	        current = head;
	        while (current != null) {
	            size++;
	            current = current.next;
	        }

	        //第二次遍历，输出倒数第index个结点的数据
	        current = head;
	        for (int i = 0; i < size - index; i++) {
	            current = current.next;
	        }

	        return current.data;
	    }
	    public Node findLastNode(Node head, int index) {

	        if (head == null) {
	            return null;
	        }

	        Node first = head;
	        Node second = head;

	        //让second结点往后挪index个位置
	        for (int i = 0; i < index; i++) {
	            second = second.next;
	        }

	        //让first和second结点整体向后移动，直到second结点为Null
	        while (second != null) {
	            first = first.next;
	            second = second.next;
	        }

	        //当second结点为空的时候，此时first指向的结点就是我们要找的结点
	        return first;
	    }
	    //方法重载：向链表中添加结点
	    public void add(Node node) {
	        if (node == null) {
	            return;
	        }

	        if (head == null) {
	            head = node;
	            current = head;
	        } else {
	            current.next = node;
	            current = current.next;
	        }
	    }
	  //方法：链表的反转
	    public Node reverseList(Node head) {

	        //如果链表为空或者只有一个节点，无需反转，直接返回原链表的头结点
	        if (head == null || head.next == null) {
	            return head;
	        }

	        Node current = head;
	        Node next = null; //定义当前结点的下一个结点
	        Node reverseHead = null;  //反转后新链表的表头

	        while (current != null) {
	            next = current.next;  //暂时保存住当前结点的下一个结点，因为下一次要用

	            current.next = reverseHead; //将current的下一个结点指向新链表的头结点
	            reverseHead = current;   

	            current = next;   // 操作结束后，current节点后移
	        }

	        return reverseHead;
	    }
	  //方法：检测单链表是否有环
	    public boolean hasCycle(Node head) {

	        if (head == null) {
	            return false;
	        }

	        Node first = head;
	        Node second = head;

	        while (second != null) {
	            first = first.next;  //first指针走一步
	            second = second.next.next;  //second指针走两步

	            if (first == second) {  //一旦两个指针相遇，说明链表是有环的
	                return true;
	            }
	        }

	        return false;
	    }
	    //方法：有环链表中，获取环的长度。参数node代表的是相遇的那个结点
	    public int getCycleLength(Node node) {

	        if (head == null) {
	            return 0;
	        }

	        Node current = node;
	        int length = 0;

	        while (current != null) {
	            current = current.next;
	            length++;
	            if (current == node) {  //当current结点走到原点的时候
	                return length;
	            }
	        }

	        return length;
	    }
	  //方法：判断单链表是否有环。返回的结点是相遇的那个结点
	    public Node hasCycle(Node head,String s) {

	        if (head == null) {
	            return null;
	        }

	        Node first = head;
	        Node second = head;

	        while (second != null) {
	            first = first.next;
	            second = second.next.next;

	            if (first == second) {  //一旦两个指针相遇，说明链表是有环的
	                return first;  //将相遇的那个结点进行返回
	            }
	        }

	        return null;
	    }
	    public static void main(String[] args) {
	        LinkList list = new LinkList();
	        //向LinkList中添加数据
	        for (int i = 0; i < 10; i++) {
	            list.add(i);
	        }

	        list.print(list.head);// 从head节点开始遍历输出
	        System.out.println("length:"+list.getLength(list.head));
	        System.out.println(list.findLastNode(2, 0));
	        System.out.println("*"+list.findLastNode(list.head, 2).data);
	        //list.print(list.head);
	        list.print(list.reverseList(list.head));
	        list = new LinkList();
	        //向LinkList中添加数据
	        for (int i = 0; i < 4; i++) {
	            list.add(i);
	        }
	        list.add(list.head);  //将头结点添加到链表当中，于是，单链表就有环了。备注：此时得到的这个环的结构，是下面的第8小节中图1的那种结构。
	        //用两个指针去遍历：first指针每次走一步，second指针每次走两步，如果first指针和second指针相遇，说明有环
	        System.out.println(list.hasCycle(list.head));
	        /**
	         * 让其返回值为相遇的那个结点。然后，我们拿到这个相遇的结点就好办了，这个结点肯定是在环里嘛，我们可以让这个结点对应的指针一直往下走，直到它回到原点，就可以算出环的长度了。
	         */
	        Node current = list.hasCycle(list.head,"");  //获取相遇的那个结点
	        System.out.println("环的长度为" + list.getCycleLength(current));
	    }

}

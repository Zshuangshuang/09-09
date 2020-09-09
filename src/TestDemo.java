import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:两个有序单链表的合并
 * User:ZouSS
 * Date:2020-09-09
 * Time:13:28
 **/


class Node{
    private int val;
    private Node next;

    public Node(int val) {
        this.val = val;

    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
public class TestDemo {
    public Node head;
 



    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(node);
    }
    public  void display(){
        Node cur  = this.head;
        while(cur != null){
            System.out.print(cur.getVal()+" ");
            cur = cur.getNext();

        }
        System.out.println();
    }
    public Node merge(TestDemo testDemo1,TestDemo testDemo2){
       Node node = new Node(-1);
       Node temp = node;
       while(testDemo1 != null && testDemo2 != null){

       }
        return null;
    }
    public static void main(String[] args) {

       TestDemo testDemo1 = new TestDemo();
       testDemo1.addLast(10);
       testDemo1.addLast(20);
       testDemo1.addLast(30);
       testDemo1.display();
       TestDemo testDemo2 = new TestDemo();
       testDemo2.addLast(1);
       testDemo2.addLast(4);
       testDemo2.addLast(35);
       testDemo2.display();
        System.out.println("================");

    }
}

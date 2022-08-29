class Link_List{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

// add_first
public void AddFirst(String data) {
    Node  newNode = new Node(data);
    if ( head ==null) {
      head=newNode;
      return;
  }
  newNode.next=head;
  head=newNode;
}
// add_last
public void AddLast(String data) {
    Node  newNode = new Node(data);
    if ( head ==null) {
      head= newNode;
      return;
    }
    Node currNode =head;
    while(currNode.next != null){
        currNode=currNode.next;
    }
    newNode.next=newNode;
}
public void printlist() {
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    Node currNode =head;
    while(currNode != null){
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
    }
    System.out.println("null");
}
public static void main(String args[]) {
    
    Link_List words= new Link_List();
    words.AddFirst("Mornig");
    words.AddFirst("Good");
    words.AddFirst("Hellow");
    words.AddLast(".");
    words.printlist();

}
}
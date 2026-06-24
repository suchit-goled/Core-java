package com.suchit.collections.LL;

public class childrens {
    static Node head;
          public static void addLast(String data){

              Node node=new Node(data);

              if(head==null) {
                  head = node;
                  return;

              }

              Node currNode=head;
              while(currNode.next!=null){
                  currNode=currNode.next;
              }
              currNode.next=node;
          }


}

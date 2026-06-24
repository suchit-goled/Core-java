    package com.suchit.collections.LL;



    public class Parents {
            Node head;

        public void addFirst(String data){
                Node node= new Node(data);
                if(head==null){
                    head=node;
                    return;

                }
                node.next=head;
                head=node;
        }

        public void printList(){
            Node curr = head;

            while(curr != null){
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }

            System.out.println("null");
        }


        }


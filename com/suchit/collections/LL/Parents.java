    package com.suchit.collections.LL;



    public class Parents {
            static Node head;

        public void addFirst(String data){
                Node node= new Node(data);
                if(head==null){
                    head=node;
                    return;

                }
                node.next=head;
                head=node;
        }




        }


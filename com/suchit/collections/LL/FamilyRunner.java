package com.suchit.collections.LL;

public class FamilyRunner {

    public static void main(String[] args) {

        Parents parents = new Parents();
        parents.addFirst("Father");
        parents.addFirst("Mother");

        childrens children = new childrens();
        children.addLast("Son");
        children.addLast("Daughter");

        printList();
    }

    public static void printList() {

        Node curr = Parents.head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}
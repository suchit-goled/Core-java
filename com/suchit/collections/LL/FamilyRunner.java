package com.suchit.collections.LL;


public class FamilyRunner {
    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.addFirst("Father");
        parents.addFirst("Mother");
        parents.printList();

        childrens childerns=new childrens();
        childrens.addLast("SON");
        childrens.addLast("Daughter");
        childerns.printList();
    }


}

package com.company;

   public class MyStack<K>{
       private final MyLinkedList<K> myLinkedList;

       public MyStack() {
           this.myLinkedList = new MyLinkedList<>();

       }
           public void push (INode <K> element) {
               myLinkedList.add(myNode);
           }
           public INode<K> peak {
               return myLinkedList.head;
           }
           public void printStack () {
               myLinkedList.printMyNodes();
           }
       }
   }
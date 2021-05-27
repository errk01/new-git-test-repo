package com.company;

public class BinarySearchTree {
    Node root;

     public Node insertNode(Node current, int key){
         if(current == null){
             return new Node(key);

             // if the key less then, it goes to the left of the tree for the search
         }else if(key < current.getKey()){
             current.setLeftNode(insertNode(current.getLeftNode(),key));
             // if the key is grader then, it goes to the right
         }else if(key > current.getKey()){
             current.setRightNode(insertNode(current.getRightNode(),key));
         }else{
             return current;
         }
         return current;
     }

     public void add(int key){
         root = insertNode(root, key);
     }

    @Override
    public String toString() {
        return "BinarySearchTree: \nroot=" + root;
    }
}

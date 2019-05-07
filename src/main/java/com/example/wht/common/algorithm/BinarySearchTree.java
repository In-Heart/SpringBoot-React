package com.example.wht.common.algorithm;

import sun.reflect.generics.tree.Tree;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/1/18-9:17
 * @description
 */
public class BinarySearchTree {

//    public static void main(String args[]){
//        BinarySearchTree tree=new BinarySearchTree();
//        //5  2  7  3  4  1  6
//        int[] array=new int[]{5,2,7,3,4,1,6};
//
//        for (int i : array) {
//            tree.put(i);
//        }
//        tree.midOrderTraverse(tree.root);
//
////        for(int i=0;i<array.length-1;i++){
////            SearchBinaryTree.TreeNode node=tree.searchNode(array[i]);
////            tree.delNode(node);
////        }
////
////        System.out.println("----");
////        tree.midOrderTraverse(tree.root);
//    }

    // 根结点
    public TreeNode root;

    public static class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightChild;
        TreeNode parent;
        public TreeNode(int data){
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
            this.parent = null;
        }
    }

    /**
     * 中序遍历
     * @param root
     */
    public void midOrderTraverse(TreeNode root){
        if(root == null){
            return ;
        }
        midOrderTraverse(root.leftChild);
        System.out.println(root.data+"");
        midOrderTraverse(root.rightChild);
    }

    /**
     * 添加节点
     */
    public TreeNode put(int data){
        if(root == null){
            TreeNode treeNode = new TreeNode(data);
            root = treeNode;
            return treeNode;
        }
        TreeNode parent = null;
        TreeNode node = root;
        while (node!=null){
            parent = node;
            if(data < node.data){
                node = root.leftChild;
            } else if(data > node.data){
                node = root.rightChild;
            } else {
                return node;
            }
        }
        TreeNode newNode = new TreeNode(data);
        if(data<parent.data) {
            parent.leftChild = newNode;
        }else{
            parent.rightChild = newNode;
        }
        newNode.parent = parent;
        return newNode;
    }

    public TreeNode getMinLeftTreeNode(TreeNode treeNode){
        TreeNode minNode = null;
        if (treeNode == null){
            return null;
        }else {
            minNode = treeNode;
            while (minNode.leftChild != null){
                minNode = minNode.leftChild;
            }
        }
        return minNode;
    }
}

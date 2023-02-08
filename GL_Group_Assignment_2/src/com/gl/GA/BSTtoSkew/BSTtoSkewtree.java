package com.gl.GA.BSTtoSkew;

public class BSTtoSkewtree
	{
	    int val;
	    BSTtoSkewtree left,right;
	    BSTtoSkewtree(int val)
	    {
	        this.val=val;
	        left=right=null;
	    }
	}
	class BSTMain
	{
	    BSTtoSkewtree node;
	    BSTtoSkewtree prev = null;
	    BSTtoSkewtree newNode = null;
	    void performBST(BSTtoSkewtree root)
	    {
	        if(root == null)return;
	        performBST(root.left);
	        BSTtoSkewtree rightNode = root.right;
//	      Node leftNode = root.left;
	     
	        if(newNode == null)
	        {
	            newNode = root;
	            root.left = null;
	            prev = root;
	        }
	        else
	        {
	            prev.right = root;
	            root.left = null;
	            prev = root;
	        }
	        performBST(rightNode);
	    }  
	    void traverse(BSTtoSkewtree root)
	    {
	        if(root == null)return;
	        System.out.print(root.val + " ");
	        traverse(root.right);       
	    }
	    public static void main(String[] args) 
	    {   
	        BSTMain tree = new BSTMain();
	        tree.node = new BSTtoSkewtree(50);
	        tree.node.left = new BSTtoSkewtree(30);
	        tree.node.right = new BSTtoSkewtree(60);
	        tree.node.left.left = new BSTtoSkewtree(10);
	        tree.node.right.left= new BSTtoSkewtree(55);       
	        tree.performBST(tree.node);
	        tree.traverse(tree.newNode);
	    }
	}

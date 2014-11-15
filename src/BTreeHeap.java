/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package priorityqueue;


/**
 *
 * @author Luis Barreto
 */
public class BTreeHeap 
{
    private Node root;
    public Node getRoot()
    {
        return this.root;
    }
    public BTreeHeap(int value)
    {
        this.root = new Node(value);
    }
    public void printTree(Node nd)
    {
        if(nd!=null)
        {
            System.out.print(nd.value+ " \n");
            if(nd.left!=null)
            {
                System.out.print(nd.left.value + " ");
                if (nd.right != null)
                {
                    System.out.print(nd.right.value + " ");
                    printTree(nd.left);
                }
                printTree(nd.right);
            }
            //System.out.println("Done!!!");
           // printTree(nd.left);
            
        }
    }
    public void insert(Node nd, int value)
    {
        if(nd.left != null)
        {
            if(nd.right != null)
            {
                if(nd.left.hasChildren(nd.left)<2)
                {
                    insert(nd.left, value);
                }
                else
                {
                    insert(nd.right, value);
                }
            }
            else
            {
                nd.right = new Node(value);
            }
        }
        else
        {
            nd.left = new Node(value);
        }
    }
   /* public void insert(node nd, int value)
    {
            if (nd.left != null) 
            {
                if (nd.right != null)
                {
                    insert(nd.left, value);
                    System.out.println("Inserting :" + value + " to left child to node " + nd.value);
                }
                else
                {
                    nd.right = new node(value);
                    System.out.println("Creating a new right node with value: "+ value + " to parent node " + nd.value);
                }
            }
            else 
            {
                if (nd.left != null)
                {
                    insert(nd.right, value);
                    System.out.println("Inserting :" + value + " to right child to node "+ nd.value );
                }
                else
                {
                    nd.left = new node(value);
                    System.out.println("Creating a new left child node with value: "+ value + " to parent node" + nd.value);    
                }
                
            }
    }*/
    
}

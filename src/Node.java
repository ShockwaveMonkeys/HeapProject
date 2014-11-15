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
public class Node 
{
    protected Node left;
    protected Node right;
    int value;
    
    public Node(int value)
    {
        this.value = value;
    }
    public int hasChildren(Node nd)
    {
        if (nd != null)
        {
            if((nd.left != null)&&(nd.right != null))
                return 2;
            else if((nd.left != null)&&(nd.right == null))
                return 1;
            else
                return 0;
        }
        else
            return 0;
    }
    
}

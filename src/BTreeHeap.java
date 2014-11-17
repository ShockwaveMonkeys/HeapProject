/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package priorityqueue;


/**
 *
 * @author Luis Barreto
 * @author Younggun Chung(Young)
 */
public class BTreeHeap 
{
    private Node root;
    public int swap;
    public int smallestNum;
    public int travelCount = 0;
    public int nodeCount;
	
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
    
    // Young
    public void printRoot(Node nd) {
    	if(nd != null) {
            System.out.print(nd.value + " ");
            
            if(nd.left != null) {
                System.out.print(nd.left.value + " ");
                //printNodes(nd.left);
                
                if (nd.right != null) {
                    System.out.print(nd.right.value + " ");
                	//System.out.print(nd.left.value + " ");
                	
                	//printChild(nd);
                }
                //else printChild(nd.left);
                
                printChild(nd.left);
                
                if (nd.right != null) {
                	printChild(nd.right);
                }
                
                
            }
            
        }
    }
    
    // Young
    // Max number of node = 7
    public void printChild(Node nd) {
    	if(nd != null) {
            //System.out.print(nd.value + " ");
            
            if(nd.left != null) {
                System.out.print(nd.left.value + " ");
                //printNodes(nd.left);
                
                if (nd.right != null) {
                    System.out.print(nd.right.value + " ");
                	//System.out.print(nd.left.value + " ");
                	
                	//printChild(nd);
                }
                //else printChild(nd.left);
            }
        }
    }
	
    // Young
    // this method cannot run if the value is first number of array list
    public void insert(int value){
    	// check the value is a number or not
    	if(value != (int)value){
    		System.out.println(value + " is not a number.");
    		
    		return;
    	}
    	
    	if(root.left != null) {
            if(root.right != null) {
                if(root.left.hasChildren(root.left)<2) {
                    insert(root.left, value);
                }
                else {
                    insert(root.right, value);
                }
            }
            else {
                root.right = new Node(value);
            }
        }
        else {
            root.left = new Node(value);
        }
    }
    
    //Young
    public void setSmallestNum(int num){
    	smallestNum = num;
    }
    
    //Young
    public void setTravelCount(int num){
    	travelCount = num;
    }
    
    //Young
    public void nodeCount(Node nd){
    	if(nd != null){
    		nodeCount++;
    		
    		if(nd.left != null){
    			nodeCount(nd.left);
    		}
    		if(nd.right != null){
    			nodeCount(nd.right);
    		}
    	}
    	
    	//System.out.println(nodeCount);
    }
    
    //Young
    public void getNodeCount(){
    	System.out.println(nodeCount);
    }
    
    //Young
    public void setCount(int num){
    	nodeCount = num;
    }
    
    //Young
    // must run setSwap(root.value) first
    // setTravelCount(0)
    public void buildHeap(Node nd){
//    	if(nd.value < smallestNum){
//    		smallestNum = nd.value;
//    		travelCount++;
//    	}
    	if(nd != null){
	    	
	    	if(nd.left != null){
	    		if(nd.right != null) {
	    			buildHeap(nd.right);
	    		}
	    		buildHeap(nd.left);
	    		    		
	    		if(nd.value > nd.left.value){
	    			swap = nd.value;
	    			nd.value = nd.left.value;
	    			nd.left.value = swap;
	    		}
	    	}
	        		
	    	if(nd.right != null){    		   		
	    		buildHeap(nd.right);
	    		if(nd.value > nd.right.value){
	    			swap = nd.value;
	    			nd.value = nd.right.value;
	    			nd.right.value = swap;
	    		}
	    		
//	    		if(nd.left.left != null){
//	    			if(nd.right.value > nd.left.left.value){
//	    				swap = nd.right.value;
//	    				nd.right.value = nd.left.left.value;
//	    				nd.left.left.value = swap;
//	    			}
//	    		}
	    		
	    		if(nd.left != null){
	    			buildHeap(nd.left);
	    		}
	    		
	    		
	    	}
	    	
    	//System.out.println(travelCount); 
    	}
    }

    //Young
//    public void findNodeByOrder(Node nd, int num){
//    	for(int i = 0; i < num; i++){
//    		
//    	}
//    	
//    	if (nd != null){
//    		
//    	}
//    }

    //Young
    //deleteMin must run after buildHeap
//    public void deleteMin(Node nd){
//    	if(nd != null){
//    		if((nd.left != null) && (nd.right != null)){
//    			nd.value = nd.left.value;
//        		nd.left.value = nd.right.value;
//        		
//        		deleteNode(nd.right);
//    		}
//    		
//    		if((nd.left != null) && (nd.right == null)){
//    			nd.value = nd.left.value;
//    			nd.left = null;
//    		}
//    	}
//    }
//    
//    // Young
    public void deleteNode(Node nd){
    	if(nd != null){
    		if((nd.left != null) && (nd.right != null)){
    			nd.value = nd.left.value;
        		nd.left.value = nd.right.value;
        		if(nd.left.left != null){
        			nd.right.value = nd.left.left.value;
        		}
        		if(nd.left.right != null){
        			nd.left.left.value = nd.left.right.value;
        		}
        		
        		
        		//deleteNode(nd.left);
        		
//        		if(nd.right.left != null){
//        			nd.right.left = null;
//        		}
        		
        		
    		}
    		
//    		if((nd.left != null) && (nd.right == null)){
//    			nd.value = nd.left.value;
//    			nd.right = null;
//    		}
    		
    		//cannot happen in queue heap
    		/*if((nd.left == null) && (nd.right != null)){
    			nd.value = nd.right.value;
    		}*/
    		
    		/*if((nd.left == null) && (nd.right == null)){
    			System.out.println("All queues are deleted. ");
    		}*/
    	}
    }
    
    public void moveNode(Node nd){
    	if(nd != null){
    		if(nd.right != null){
    			if(nd.left.left != null){
    				
    			}
    		}
    	}
    }
    
    public void delete(Node nd, int num){
    	for(int i = 0; i < num; i++){
    		
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



//import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Luis Barreto
 */
public class PriorityQueue 
{
    static BTreeHeap  myHeap = new BTreeHeap(5);
    /**
    * @param args
    */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Node root = myHeap.getRoot();
        myHeap.insert(root, 1);
        myHeap.insert(root, 6);
        myHeap.insert(root, 8);
        myHeap.insert(root, 4);
        myHeap.insert(root, 3);
        myHeap.insert(root, 10);
        myHeap.insert(root, 9);
        myHeap.printTree(root);
        
        
        
        //heap using the Heap class
        // TODO Auto-generated method stub
	/*Heap<Integer> hp = new Heap<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter next int, 'done' to stop: ");
	String line = sc.next();
	while (!line.equals("done")) 
        {
            hp.insert(Integer.parseInt(line));
            System.out.println(hp);
            System.out.print("Enter next int, 'done' to stop: ");
            line = sc.next();
	}
	while (!hp.isEmpty()) 
        {
            int max = hp.delete();
            System.out.println(max + " " + hp);
	}
        */
        // File instructions
        // Open the file
       /* FileInputStream fstream = new FileInputStream("C:\\PriorityQueue\\src\\priorityqueue\\textfile.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   
        {
            // Print the content on the console
            System.out.println (strLine);
        }
        //Close the input stream
        br.close();*/
    }

}
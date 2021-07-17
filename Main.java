import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args)
    {
    	
    	File file = new File("Numbers");
    	try {
			Scanner scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: reading File");
		}
        BST bst = new BST();
        
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
 
        bst.inorder();
    }

}

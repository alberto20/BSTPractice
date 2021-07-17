import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args)
    {
    	 BST bst = new BST();
    	File file = new File("Numbers");
    	try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine())
	    	{
	    		String data = scan.nextLine();
	    		bst.insert(Integer.parseInt(data));
	    	}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: reading File");
			e.printStackTrace();
		}
 
        bst.inorder();
    }
}

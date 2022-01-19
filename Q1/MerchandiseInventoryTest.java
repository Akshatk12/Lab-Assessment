package Q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MerchandiseInventoryTest {
	 ArrayList<Merchandise> mlist=new ArrayList<Merchandise>();
	public static void main(String[] args) {
		
		 ArrayList<Merchandise> mlist=new ArrayList<Merchandise>();

		Merchandise md=null;
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("input.dat"));
			String line=null;
			while((line=br.readLine())!=null) {
				String []tokens=line.split(" ");
				md=new Merchandise(tokens[0], 
						Integer.parseInt(tokens[1]) ,Double.parseDouble(tokens[2]));
				mlist.add(md);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Given Data:");
		for(Merchandise e: mlist) {
			e.display();
		}
		Collections.sort(mlist,new MerchandiseAsPerName());
		System.out.println("Sorting as Per Name in ascending order");
		for(Merchandise e : mlist) {
			e.display();
		}
		Collections.sort(mlist,new MerchandiseAsPerPrice());
		System.out.println("Sorting as Per Price in descending order");
		for(Merchandise e : mlist) {
			e.display();
		}
		
	}
}


// Name:
// Date:
// Per:
// AP Computer Science

import java.awt.Graphics;


/**
 * Implements the list of messages for marquee
 */
public class SushiList {
	private Node heading, topNode;
	private int numSushi = 10;

public SushiList(String[]sushiNames) 
	
	{
		 heading = new Node("Sushi Names: "); 
		 heading.setPrevious(new Node(" "));
		 heading.setNext(new Node(" "));
		 topNode = heading; 
		 for(int i = 0; i<sushiNames.length; i++) {
			 heading = heading.getNext(); 
			 heading.setNext(new Node(sushiNames[i]));
		 } 
	heading.setNext(topNode);
		 
		 
	}
  public void scrollUp()
  {
	  topNode = topNode.getNext(); 
  }
	
  public int getCount(String sushi)
  {
	  int count = 0;  
		  if(sushi.equals("Tuna")) 
				  count = 1;
		  if(sushi.equals("Beef")) 
			  count = 3;
		  if(sushi.equals("Salmon")) 
			  count = 2;
		  if(sushi.equals("Tempura")) 
			  count = 2;
		  if(sushi.equals("Unagi")) 
			  count = 2;
	  System.out.println(count + " " + sushi + " left on the belt!");
	  return count;
  }
  public String getPrice(String sushi)
  {
	  String price = "";
	  if(sushi.equals("Beef"))
		  price = "$3.50";
	  if(sushi.equals("Salmon"))
		  price = "$4.50";
	  if(sushi.equals("Tempura"))
		  price = "$2.50";
	  if(sushi.equals("Tuna"))
		  price = "$3.75";
	  if(sushi.equals("Unagi"))
		  price = "$4.75";
	  System.out.println(sushi + " is " + price + " each!");
	 return price; 

  }
  public void getLoc(String sushi) 
  {
	  String loc = "";
	  if(sushi.equals("Beef"))
		  loc = "1, 5, 7";
	  if(sushi.equals("Salmon"))
		  loc = "2, 10";
	  if(sushi.equals("Tempura"))
		  loc = "3, 9";
	  if(sushi.equals("Tuna"))
		  loc = "6";
	  if(sushi.equals("Unagi"))
		  loc = "4, 8";
	  System.out.println(sushi +  " is avaliable at location(s) " + loc + "!");
  }
	
	public void draw(Graphics g, int x, int y, int lineHeight, int nLines)
	{
		Node node = topNode;
		for (int k = 1; k <= nLines; k++) {
			g.drawString((String) node.getValue(), x, y);
			y += lineHeight;
			node = node.getNext();
		}
	}
}

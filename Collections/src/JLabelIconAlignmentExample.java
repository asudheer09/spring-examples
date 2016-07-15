/*import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;


public class Test {

	*//**
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list= new ArrayList();
		
		for(int i=0;i<=10;i++){
			list.add(i);
		}
		ListIterator ltr=list.listIterator();
		while(ltr.hasNext()){
			
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
		}
		
		System.out.println(list);
		
		boolean b= list.contains(5);
		System.out.println("list contains the given value "+b);
		
		Object[] obj=list.toArray();
		
		for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}
		
		
		ArrayList b1= new ArrayList();
		b1.add(1);
		b1.add(2);
		b1.add(3);
		
		Vector v= new Vector();
		
		v.add(4);
		v.add(5);
		
		b1.addAll(v);
		
		System.out.println("fffffffffffffffffffff"+b1);
		
		
		Scanner sc= new Scanner(System.in);
		
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		System.out.println("hhhhhhhhh "+(p^q));
		
		
		
	}

}
*/

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelWithIconTextExample" width=200 height=200>
</applet>
*/
 
public class JLabelIconAlignmentExample extends JApplet{
       
        public void init(){
               
                /*
                 * Create an icon from an image using
                 * ImageIcon(String imagePath, String description)
                 * constructor.
                 */
               
                ImageIcon icon = new ImageIcon("images/copy.gif");
               
                /*
                 * To create an Image label and set horizontal alignment, use
                 * JLabel(Icon icon, int horizontalAlignment) or
                 * JLabel(String text, Icon icon, int horizontalAlignment)
                 *
                 * where horizontalAlignment can be one of the following SwingConstants,
                 * LEFT, CENTER, RIGHT, LEADING or TRAILING.
                 */
               
                //center aligned JLabel
                JLabel imageLabel = new JLabel("Copy",icon, JLabel.CENTER);
               
                /*
                 * Add JLabel to an Applet
                 */
               
                add(imageLabel);
               
                /*
                 * Please note that the label is centered vertically in its display area.
                 */
        }
}
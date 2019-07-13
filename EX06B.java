package GridLayout;
import java.applet.*;
import java.awt.*;

public class EX06B extends Applet{
	CardLayout layout;
	public void init() {
		resize(320,240);
		
		setLayout(new GridLayout(2,2));
		
		Panel panel1 = new Panel();
		panel1.setLayout(new BorderLayout());
		panel1.add("North", new Label("This is page 1"));
		panel1.add("Center",new Button("Go to Page 2"));
		panel1.add("South", new Label("This entire card is a Panel"));
		add("Page1",panel1);
		
		Panel panel3 = new Panel();
		panel3.setLayout(new BorderLayout());
		panel3.add("North",new Label("This is page 3"));
		panel3.add("Center", new Button("Go to Page 4"));
		add("Page3",panel3);
		
		Panel panel2 = new Panel();
		panel2.setLayout(new BorderLayout());
		panel2.add("North", new Label("This is page 3"));
		panel2.add("Center", new Button());
		
		Panel panel4 = new Panel();
		panel4.setLayout(new BorderLayout());
		panel4.add("Center", new Button("Go to Page 1"));
		add("Page4",panel4);
		
	}
	
	public boolean action(Event evt, Object obj) {
		
		boolean result = false;
		if("Go to Page 1".equals(obj)) {
			layout.show(this,"Page1");
			result = true;
		}
		else if ("Go to Page 2".equals(obj)) {
			layout.show(this, "Page2");
			result = true;
		}
		else if("Go to Page 3".equals(obj)) {
			layout.show(this, "Page 3");
		}
		else if("Go to Page 4".equals(obj)){
			layout.show(this, "Page 4");
			result = true;
		}
		return result;
			
	}
}

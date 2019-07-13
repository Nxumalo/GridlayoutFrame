package GridLayout;
import java.applet.*;
import java.awt.*;

public class EX06C extends Applet{
	
	CardLayout layout;
	public void init() {
		resize(320,240);
		setLayout(new GridLayout(2,2));
		Panel p1 = new Panel();
		p1.add(new Button("Panel 1"));
		add(p1);
		
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		p2.add("North", new Label("This is a panel on a panel"));
		
		Panel subPanel = new Panel();
		subPanel.add(new Label("Name"));
		subPanel.add(new TextField(8));
		p2.add("South",subPanel);
		add(p2);
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(2,2));
		p3.add(new Button("Panel 3-1"));
		p3.add(new Button("Panel 3-2"));
		p3.add(new Button("Panel 3-3"));
		p3.add(new Button("Panel 3-4"));
		add(p3);
		
		add(new Button("No Panel"));
		
	}
	
	public boolean action(Event evt, Object obj) {
		boolean result = false;
		
		if("Go to Page 1".equals(obj)) {
			layout.show(this,"Page1");
			result = true;
		}
		else if("Go to Page 2".equals(obj)) {
			layout.show(this,"Page2");
			result = true;
		}
		else if("Go to Page 3".equals(obj)) {
			layout.show(this,"Page3");
			result = true;
		}
		else if ("Go to Page 4".equals(obj)) {
			layout.show(this,"Page 4");
			result = true;
		}
		return result;
	}

}

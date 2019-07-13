package GridLayout;
import java.applet.*;
import java.awt.*;

public class EX06A extends Applet{

	public void init() {
		resize(320,240);
		setLayout(new GridLayout(2,2));
		Panel p1 = new Panel();
		p1.add(new Button("Panel 1"));
		add(p1);
		
		Panel p2 = new Panel();
		p2.add(new Button("Panel 2 -1 "));
		p2.add(new TextField(8));
		add(p2);
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(2,2));
		p3.add(new Button("Panel 3-1"));
		p3.add(new Button("Panel 3-2"));
		p3.add(new Button("Panel 3-3"));
		p3.add(new Button ("Panel 3-4"));
		add(p3);
	}
}

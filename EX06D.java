package GridLayout;
import java.applet.*;
import java.awt.*;

public class EX06D extends Applet {

	MyFrame frame;
	
	public void init() {
		frame = new MyFrame();
		add(new Button("Show Frame"));
	}
	
	public boolean action(Event evt,Object obj) {
		boolean result = false;
		if("Show Frame".equals(obj)) {
			frame.show();
			result = true;
		}
		return result;
	}
	
	class MyFrame extends Frame{
		public MyFrame() {
			add("Center", new Label("This is a Frame"));
			
			Panel p = new Panel();
			p.add(new Button("Close"));
			add("South",p);
			resize(250,250);
		}
	
	public boolean action(Event evt, Object arg) {
		boolean result = false;
		if("Close".equals(evt.arg)) {
			dispose();
			result = true;
		}
		return result;
		}
	}
}
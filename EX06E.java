package GridLayout;
import java.applet.*;
import java.awt.*;

public class EX06E extends Applet{
	
	MyFrame frame;
	
	public void init() {
		frame = new MyFrame();
		add(new Button("Show Frame"));
	}
	
	public boolean action(Event evt, Object obj) {
		boolean result = false;
		if("Show Frame".equals(obj)) {
			frame.show();
			result = true;
		}
		return result;
	}
	
}

class MyFrame extends Frame{
	TextField title;
	Choice cursor;
	public MyFrame() {
		setLayout(new GridLayout(3,1));
		
		Panel panel1 = new Panel();
		panel1.add(new Label("Title"));
		title = new TextField(0);
		panel1.add(title);
		add(panel1);
		
		Panel panel2 = new Panel();
		panel2.add(new Label("Cursor"));
		cursor = new Choice();
		cursor.addItem("Default");
		cursor.addItem("Crosshair");
		cursor.addItem("Hand");
		cursor.addItem("Move");
		cursor.addItem("Text");
		cursor.addItem("Wait");
		panel2.add(cursor);
		add(panel2);
		
		Panel panel3 = new Panel();
		
		panel3.add(new Button("Apply"));
		panel3.add(new Button("Close"));
		add(panel3);
		
		resize(250,250);
		
	}
		
		public boolean action(Event evt,Object arg) {
			boolean result = false;
			
			if("Close".equals(evt.arg)) {
				dispose();
				result = true;
			}
			else if("Apply".equals(evt.arg)) {
				setTitle(title.getText());
				
				int Cursors[] = {DEFAULT_CURSOR,CROSSHAIR_CURSOR, HAND_CURSOR,MOVE_CURSOR,TEXT_CURSOR,TEXT_CURSOR};
				setCursor(Cursors[cursor.getSelectedIndex()]);
			}
			return result;
		}
		
		
	}
	
	
	
	
}

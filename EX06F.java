package GridLayout;
import java.applet.*;
import java.awt.*;

public class EX06F extends Applet{
	
	MyDialog dlg;
	
	public void init() {
		Frame f = new Frame();
		f.resize(250,250);
		dlg = new MyDialog(f,"Howdy");
		add(new Button("Show Dialog"));
	}
	
	public boolean action(Event evt,Object obj) {
		boolean result = false;
		if("Show Dialog".equals(obj)) {
			dlg.show();
			result = true;
		}
		return result;
	}
}
class MyDialog extends Dialog{
	
	Label resizeLabel;
	String labelText[] = {
		"Dialog is Not resizable",
		"Dialog is resizeable"
	};
	
	public MyDialog(Frame parent, String title) {
		
		super(parent,title,false);
		setResizable(false);
		
		resizeLabel = new Label(labelText[0]);
		add("North",resizeLabel);
		
		Panel p = new Panel();
		p.add(new Button("Toggle"));
		p.add(new Button("Close"));
		add("South",p);
		
		pack();
		resize(250,250);
		
	}
	public boolean action(Event evt, Object arg) {
		boolean result = false;
		if("Toggle".equals(evt.arg)) {
			if(isResizable())
				resizeLabel.setText(labelText[0]);
			else
				resizeLabel.setText(labelText[1]);
			
			setResizable(!isResizable());
			result = true;
		}
		else if("Close".equals(evt.arg)) {
			dispose();
			result = true;
		}
		return result;
	}
		
		
		
		
		
		
		
		
		
	
}
